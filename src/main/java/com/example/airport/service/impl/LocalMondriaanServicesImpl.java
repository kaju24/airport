package com.example.airport.service.impl;

import com.example.airport.service.DateFormatUtils;
import lombok.extern.slf4j.Slf4j;
import nl.randstadgroep.nextgen.gm.assignment.client.api.AssignmentClient;
import nl.randstadgroep.nextgen.gm.assignment.client.api.AssignmentClientApi;
import nl.randstadgroep.nextgen.gm.assignment.client.api.impl.AssignmentClientImpl;
import nl.randstadgroep.nextgen.gm.assignment.client.handler.ApiException;
import nl.randstadgroep.nextgen.gm.assignment.client.model.GetAssignmentResponse;
import nl.randstadgroep.nextgen.gm.assignment.client.model.GetAssignmentResponseAssignmentFileInner;
import nl.randstadgroep.nextgen.gm.assignment.client.model.GetAssignmentResponseAssignmentFileInnerRateOverviewInner;
import nl.randstadgroep.nextgen.gm.talent.client.model.GetTalentResponse;
import nl.randstadgroep.nextgen.gm.talent.client.model.GetTalentResponseTalentFileInner;
import nl.randstadgroep.rone.common.enums.OwningEntity;
import nl.randstadgroep.rone.talent.assignment.model.Assignment;
import nl.randstadgroep.rone.talent.assignment.model.BillRate;
import nl.randstadgroep.rone.talent.assignment.model.PayRateDetail;
import nl.randstadgroep.rone.talent.assignment.model.enums.*;
import nl.randstadgroep.rone.talent.profile.model.TalentProfile;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class LocalMondriaanServicesImpl implements LocalMondriaanServices {

    private static final String LOG_PRFX = "[Local Mondriaan Services] :";
    private final AssignmentClient gmAssignmentClient;

    @Autowired
    public LocalMondriaanServicesImpl(final AssignmentClient gmAssignmentClient) {
        this.gmAssignmentClient = gmAssignmentClient;
    }



    @Override
    public Assignment retrieveAssignmentDetails(final String assignmentNumber) {
        try {
            final GetAssignmentResponse assignmentResponse = gmAssignmentClient.assignmentGet(assignmentNumber);
            if (assignmentResponse != null && !CollectionUtils.isEmpty(assignmentResponse.getAssignmentFile())) {
                return mapToAssignmentPojo(assignmentResponse);
            } else {
                log.error("{} No assignment details found in mondriaan for local assignment number {}", LOG_PRFX, assignmentNumber);
            }
        } catch (final ApiException e) {
            log.error("{} An error occurred while trying to retrieve assigment detail from mondriaan for assignment number {} : {}", LOG_PRFX, assignmentNumber, e.getMessage());
            throw new RuntimeException(e);
        }
        return null;

    }


    /**
     * Mapper to map mondriaan assignment to GAIM local pojo assignment {@link TalentProfile}
     *
     * @param response mondriaan talent details
     * @return Collection of {@link TalentProfile}
     */
    private TalentProfile mapToTalentProfilePojo(final GetTalentResponse response) {
        if (response != null && !CollectionUtils.isEmpty(response.getTalentFile())) {
            // There will be only one entry
            final GetTalentResponseTalentFileInner talentFile = response.getTalentFile().get(0);
            return TalentProfile.builder()
                    .owningEntity(talentFile.getGroupCompany() != null ? OwningEntity.fromShortCode(talentFile.getGroupCompany()) : null)
                    .build();
        }

        return null;
    }

    /**
     * Mapper to map mondriaan assignment to GAIM local pojo assignment {@link Assignment}
     *
     * @param assignmentResponse mondriaan assigment details
     * @return Collection of {@link Assignment}
     */
    private Assignment mapToAssignmentPojo(final GetAssignmentResponse assignmentResponse) {
        if (assignmentResponse != null && !CollectionUtils.isEmpty(assignmentResponse.getAssignmentFile())) {
            // There will be only one entry
            final GetAssignmentResponseAssignmentFileInner gmAssignment = assignmentResponse.getAssignmentFile().get(0);
            return Assignment.builder()
                    .actualEndDate(DateFormatUtils.parseDate(gmAssignment.getEndDate()))
                    .startDate(DateFormatUtils.parseDate(gmAssignment.getStartDate()))
                    .payRateDetails(mapPayRateDetails(gmAssignment.getRateOverview()))
                    .billRates(mapBillRates(gmAssignment.getRateOverview()))
                    .employeeNumber(gmAssignment.getEmployeeNumber())
                    .build();
        }
        return null;
    }

    /**
     * Creates list of {@link PayRateDetail} from given mondriaan assigment rare overview
     *
     * @param rateOverviews Collection of mondriaan assignment rate overview {@link GetAssignmentResponseAssignmentFileInnerRateOverviewInner}
     * @return Collection of {@link PayRateDetail}
     */
    private List<PayRateDetail> mapPayRateDetails(final List<GetAssignmentResponseAssignmentFileInnerRateOverviewInner> rateOverviews) {
        if (!CollectionUtils.isEmpty(rateOverviews)) {
            return rateOverviews.stream().map(r ->
                    {
                        BigDecimal amount = null;
                        if (!CollectionUtils.isEmpty(r.getRateDetail()) && StringUtils.isNotEmpty(r.getRateDetail().get(0).getPaymentRate())) {
                            amount = new BigDecimal(r.getRateDetail().get(0).getPaymentRate());

                        }
                        return PayRateDetail.builder()
                                .effectiveDate(DateFormatUtils.parseDate(r.getRateStartDate()))
                                .endDate(DateFormatUtils.parseDate(r.getRateEndDate()))
                                .amount(amount)
                                .type(CompensationDetailTypeEnum.BASE)
                                .currencyCode(CurrencyCodeEnum.EUR)
                                .unit(CompensationDetailUnitEnum.HOURLY)
                                .build();
                    }
            ).collect(Collectors.toList());
        }
        return null;
    }

    /**
     * Creates list of {@link BillRate} from given mondriaan assigment rare overview
     *
     * @param rateOverviews Collection of mondriaan assignment rate overview {@link GetAssignmentResponseAssignmentFileInnerRateOverviewInner}
     * @return Collection of {@link BillRate}
     */
    private List<BillRate> mapBillRates(final List<GetAssignmentResponseAssignmentFileInnerRateOverviewInner> rateOverviews) {
        if (!CollectionUtils.isEmpty(rateOverviews)) {
            return rateOverviews.stream().map(r ->
                    {
                        BigDecimal amount = null;
                        if (!CollectionUtils.isEmpty(r.getRateDetail()) && StringUtils.isNotEmpty(r.getRateDetail().get(0).getBillingRate())) {
                            amount = new BigDecimal(r.getRateDetail().get(0).getBillingRate());
                        }
                        return BillRate.builder()
                                .amount(amount)
                                .effectiveDate(DateFormatUtils.parseDate(r.getRateStartDate()))
                                .endDate(DateFormatUtils.parseDate(r.getRateEndDate()))
                                .type(BillRateTypeEnum.BILL_RATE)
                                .currencyCode(CurrencyCodeEnum.EUR)
                                .unit(BillRateUnitEnum.HOURLY)
                                .build();
                    }
            ).collect(Collectors.toList());
        }
        return null;
    }
}
