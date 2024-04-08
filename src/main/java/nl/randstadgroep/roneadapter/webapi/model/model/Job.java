package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Job
 */


public class Job {

    private String jobId;

    private JobStatus status;

    private String opco;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime jobStartDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime jobEndDate;

    private Integer maxApplicants;
    private List<ContractTypesEnum> contractTypes;
    private String clientId;
    private String clientName;
    private String jobTitle;
    private String jobClassificationIndustryLabel;
    private List<JobWorkLocationsInner> workLocations;
    private String educationalLabel;
    private Boolean nightShift;
    private Integer applyLimit;
    private List<BillRate> billRates;
    private List<JobCertification> certifications;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdDate;
    private Boolean deleted;
    private List<EducationRequirement> educationRequirements;
    private List<EmployeeTypesEnum> employeeTypes;
    private List<EmploymentCategoriesEnum> employmentCategories;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime estimatedEndDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime estimatedStartDate;
    private List<ExpectedHoursOfServiceEnum> expectedHoursOfService;
    private String groupId;
    private List<InternalConsultant> internalConsultants;
    private Boolean isBucketJobOrder;
    private JobClassification jobClassification;
    private List<JobDescription> jobDescriptions;
    private JobLevelEnum jobLevel;
    private List<JobRequirement> jobRequirements;
    private List<JobTitle> jobTitles;
    private JobLanguageCode languageCode;
    private List<LocalId> localIds;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime modifiedDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime openDate;
    private String orderId;
    private List<PayRate> payRates;
    private ReasonForOpeningEnum reasonForOpening;
    private Boolean remoteWorkAllowed;
    private String sbiCode;
    private String sbiLabel;
    private List<Skill> skills;
    private List<WorkHours> workHours;
    private List<ClientContactResponse> clientContacts;

    public Job jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get jobId
     *
     * @return jobId
     */


    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Job status(JobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */


    @JsonProperty("status")
    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public Job opco(String opco) {
        this.opco = opco;
        return this;
    }

    /**
     * Get opco
     *
     * @return opco
     */


    @JsonProperty("opco")
    public String getOpco() {
        return opco;
    }

    public void setOpco(String opco) {
        this.opco = opco;
    }

    public Job jobStartDate(OffsetDateTime jobStartDate) {
        this.jobStartDate = jobStartDate;
        return this;
    }

    /**
     * The timestamp of the job posting creation date
     *
     * @return jobStartDate
     */


    @JsonProperty("jobStartDate")
    public OffsetDateTime getJobStartDate() {
        return jobStartDate;
    }

    public void setJobStartDate(OffsetDateTime jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public Job jobEndDate(OffsetDateTime jobEndDate) {
        this.jobEndDate = jobEndDate;
        return this;
    }

    /**
     * The timestamp of the job posting creation date
     *
     * @return jobEndDate
     */


    @JsonProperty("jobEndDate")
    public OffsetDateTime getJobEndDate() {
        return jobEndDate;
    }

    public void setJobEndDate(OffsetDateTime jobEndDate) {
        this.jobEndDate = jobEndDate;
    }

    public Job maxApplicants(Integer maxApplicants) {
        this.maxApplicants = maxApplicants;
        return this;
    }

    /**
     * Get maxApplicants
     *
     * @return maxApplicants
     */


    @JsonProperty("maxApplicants")
    public Integer getMaxApplicants() {
        return maxApplicants;
    }

    public void setMaxApplicants(Integer maxApplicants) {
        this.maxApplicants = maxApplicants;
    }

    public Job contractTypes(List<ContractTypesEnum> contractTypes) {
        this.contractTypes = contractTypes;
        return this;
    }

    public Job addContractTypesItem(ContractTypesEnum contractTypesItem) {
        if (this.contractTypes == null) {
            this.contractTypes = new ArrayList<>();
        }
        this.contractTypes.add(contractTypesItem);
        return this;
    }

    /**
     * Get contractTypes
     *
     * @return contractTypes
     */


    @JsonProperty("contractTypes")
    public List<ContractTypesEnum> getContractTypes() {
        return contractTypes;
    }

    public void setContractTypes(List<ContractTypesEnum> contractTypes) {
        this.contractTypes = contractTypes;
    }

    public Job clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     *
     * @return clientId
     */


    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Job clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Get clientName
     *
     * @return clientName
     */


    @JsonProperty("clientName")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Job jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get jobTitle
     *
     * @return jobTitle
     */


    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Job jobClassificationIndustryLabel(String jobClassificationIndustryLabel) {
        this.jobClassificationIndustryLabel = jobClassificationIndustryLabel;
        return this;
    }

    /**
     * Get jobClassificationIndustryLabel
     *
     * @return jobClassificationIndustryLabel
     */


    @JsonProperty("jobClassificationIndustryLabel")
    public String getJobClassificationIndustryLabel() {
        return jobClassificationIndustryLabel;
    }

    public void setJobClassificationIndustryLabel(String jobClassificationIndustryLabel) {
        this.jobClassificationIndustryLabel = jobClassificationIndustryLabel;
    }

    public Job workLocations(List<JobWorkLocationsInner> workLocations) {
        this.workLocations = workLocations;
        return this;
    }

    public Job addWorkLocationsItem(JobWorkLocationsInner workLocationsItem) {
        if (this.workLocations == null) {
            this.workLocations = new ArrayList<>();
        }
        this.workLocations.add(workLocationsItem);
        return this;
    }

    /**
     * Get workLocations
     *
     * @return workLocations
     */


    @JsonProperty("workLocations")
    public List<JobWorkLocationsInner> getWorkLocations() {
        return workLocations;
    }

    public void setWorkLocations(List<JobWorkLocationsInner> workLocations) {
        this.workLocations = workLocations;
    }

    public Job educationalLabel(String educationalLabel) {
        this.educationalLabel = educationalLabel;
        return this;
    }

    /**
     * Get educationalLabel
     *
     * @return educationalLabel
     */


    @JsonProperty("educationalLabel")
    public String getEducationalLabel() {
        return educationalLabel;
    }

    public void setEducationalLabel(String educationalLabel) {
        this.educationalLabel = educationalLabel;
    }

    public Job nightShift(Boolean nightShift) {
        this.nightShift = nightShift;
        return this;
    }

    /**
     * Get nightShift
     *
     * @return nightShift
     */


    @JsonProperty("nightShift")
    public Boolean getNightShift() {
        return nightShift;
    }

    public void setNightShift(Boolean nightShift) {
        this.nightShift = nightShift;
    }

    public Job applyLimit(Integer applyLimit) {
        this.applyLimit = applyLimit;
        return this;
    }

    /**
     * Get applyLimit
     *
     * @return applyLimit
     */


    @JsonProperty("applyLimit")
    public Integer getApplyLimit() {
        return applyLimit;
    }

    public void setApplyLimit(Integer applyLimit) {
        this.applyLimit = applyLimit;
    }

    public Job billRates(List<BillRate> billRates) {
        this.billRates = billRates;
        return this;
    }

    public Job addBillRatesItem(BillRate billRatesItem) {
        if (this.billRates == null) {
            this.billRates = new ArrayList<>();
        }
        this.billRates.add(billRatesItem);
        return this;
    }

    /**
     * Get billRates
     *
     * @return billRates
     */


    @JsonProperty("billRates")
    public List<BillRate> getBillRates() {
        return billRates;
    }

    public void setBillRates(List<BillRate> billRates) {
        this.billRates = billRates;
    }

    public Job certifications(List<JobCertification> certifications) {
        this.certifications = certifications;
        return this;
    }

    public Job addCertificationsItem(JobCertification certificationsItem) {
        if (this.certifications == null) {
            this.certifications = new ArrayList<>();
        }
        this.certifications.add(certificationsItem);
        return this;
    }

    /**
     * Get certifications
     *
     * @return certifications
     */


    @JsonProperty("certifications")
    public List<JobCertification> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<JobCertification> certifications) {
        this.certifications = certifications;
    }

    public Job createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get createdDate
     *
     * @return createdDate
     */


    @JsonProperty("createdDate")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Job deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     *
     * @return deleted
     */


    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Job educationRequirements(List<EducationRequirement> educationRequirements) {
        this.educationRequirements = educationRequirements;
        return this;
    }

    public Job addEducationRequirementsItem(EducationRequirement educationRequirementsItem) {
        if (this.educationRequirements == null) {
            this.educationRequirements = new ArrayList<>();
        }
        this.educationRequirements.add(educationRequirementsItem);
        return this;
    }

    /**
     * Get educationRequirements
     *
     * @return educationRequirements
     */


    @JsonProperty("educationRequirements")
    public List<EducationRequirement> getEducationRequirements() {
        return educationRequirements;
    }

    public void setEducationRequirements(List<EducationRequirement> educationRequirements) {
        this.educationRequirements = educationRequirements;
    }

    public Job employeeTypes(List<EmployeeTypesEnum> employeeTypes) {
        this.employeeTypes = employeeTypes;
        return this;
    }

    public Job addEmployeeTypesItem(EmployeeTypesEnum employeeTypesItem) {
        if (this.employeeTypes == null) {
            this.employeeTypes = new ArrayList<>();
        }
        this.employeeTypes.add(employeeTypesItem);
        return this;
    }

    /**
     * Get employeeTypes
     *
     * @return employeeTypes
     */


    @JsonProperty("employeeTypes")
    public List<EmployeeTypesEnum> getEmployeeTypes() {
        return employeeTypes;
    }

    public void setEmployeeTypes(List<EmployeeTypesEnum> employeeTypes) {
        this.employeeTypes = employeeTypes;
    }

    public Job employmentCategories(List<EmploymentCategoriesEnum> employmentCategories) {
        this.employmentCategories = employmentCategories;
        return this;
    }

    public Job addEmploymentCategoriesItem(EmploymentCategoriesEnum employmentCategoriesItem) {
        if (this.employmentCategories == null) {
            this.employmentCategories = new ArrayList<>();
        }
        this.employmentCategories.add(employmentCategoriesItem);
        return this;
    }

    /**
     * Get employmentCategories
     *
     * @return employmentCategories
     */


    @JsonProperty("employmentCategories")
    public List<EmploymentCategoriesEnum> getEmploymentCategories() {
        return employmentCategories;
    }

    public void setEmploymentCategories(List<EmploymentCategoriesEnum> employmentCategories) {
        this.employmentCategories = employmentCategories;
    }

    public Job estimatedEndDate(OffsetDateTime estimatedEndDate) {
        this.estimatedEndDate = estimatedEndDate;
        return this;
    }

    /**
     * Get estimatedEndDate
     *
     * @return estimatedEndDate
     */


    @JsonProperty("estimatedEndDate")
    public OffsetDateTime getEstimatedEndDate() {
        return estimatedEndDate;
    }

    public void setEstimatedEndDate(OffsetDateTime estimatedEndDate) {
        this.estimatedEndDate = estimatedEndDate;
    }

    public Job estimatedStartDate(OffsetDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
        return this;
    }

    /**
     * Get estimatedStartDate
     *
     * @return estimatedStartDate
     */


    @JsonProperty("estimatedStartDate")
    public OffsetDateTime getEstimatedStartDate() {
        return estimatedStartDate;
    }

    public void setEstimatedStartDate(OffsetDateTime estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }

    public Job expectedHoursOfService(List<ExpectedHoursOfServiceEnum> expectedHoursOfService) {
        this.expectedHoursOfService = expectedHoursOfService;
        return this;
    }

    public Job addExpectedHoursOfServiceItem(ExpectedHoursOfServiceEnum expectedHoursOfServiceItem) {
        if (this.expectedHoursOfService == null) {
            this.expectedHoursOfService = new ArrayList<>();
        }
        this.expectedHoursOfService.add(expectedHoursOfServiceItem);
        return this;
    }

    /**
     * Get expectedHoursOfService
     *
     * @return expectedHoursOfService
     */


    @JsonProperty("expectedHoursOfService")
    public List<ExpectedHoursOfServiceEnum> getExpectedHoursOfService() {
        return expectedHoursOfService;
    }

    public void setExpectedHoursOfService(List<ExpectedHoursOfServiceEnum> expectedHoursOfService) {
        this.expectedHoursOfService = expectedHoursOfService;
    }

    public Job groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get groupId
     *
     * @return groupId
     */


    @JsonProperty("groupId")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Job internalConsultants(List<InternalConsultant> internalConsultants) {
        this.internalConsultants = internalConsultants;
        return this;
    }

    public Job addInternalConsultantsItem(InternalConsultant internalConsultantsItem) {
        if (this.internalConsultants == null) {
            this.internalConsultants = new ArrayList<>();
        }
        this.internalConsultants.add(internalConsultantsItem);
        return this;
    }

    /**
     * Get internalConsultants
     *
     * @return internalConsultants
     */


    @JsonProperty("internalConsultants")
    public List<InternalConsultant> getInternalConsultants() {
        return internalConsultants;
    }

    public void setInternalConsultants(List<InternalConsultant> internalConsultants) {
        this.internalConsultants = internalConsultants;
    }

    public Job isBucketJobOrder(Boolean isBucketJobOrder) {
        this.isBucketJobOrder = isBucketJobOrder;
        return this;
    }

    /**
     * Get isBucketJobOrder
     *
     * @return isBucketJobOrder
     */


    @JsonProperty("isBucketJobOrder")
    public Boolean getIsBucketJobOrder() {
        return isBucketJobOrder;
    }

    public void setIsBucketJobOrder(Boolean isBucketJobOrder) {
        this.isBucketJobOrder = isBucketJobOrder;
    }

    public Job jobClassification(JobClassification jobClassification) {
        this.jobClassification = jobClassification;
        return this;
    }

    /**
     * Get jobClassification
     *
     * @return jobClassification
     */


    @JsonProperty("jobClassification")
    public JobClassification getJobClassification() {
        return jobClassification;
    }

    public void setJobClassification(JobClassification jobClassification) {
        this.jobClassification = jobClassification;
    }

    public Job jobDescriptions(List<JobDescription> jobDescriptions) {
        this.jobDescriptions = jobDescriptions;
        return this;
    }

    public Job addJobDescriptionsItem(JobDescription jobDescriptionsItem) {
        if (this.jobDescriptions == null) {
            this.jobDescriptions = new ArrayList<>();
        }
        this.jobDescriptions.add(jobDescriptionsItem);
        return this;
    }

    /**
     * Get jobDescriptions
     *
     * @return jobDescriptions
     */


    @JsonProperty("jobDescriptions")
    public List<JobDescription> getJobDescriptions() {
        return jobDescriptions;
    }

    public void setJobDescriptions(List<JobDescription> jobDescriptions) {
        this.jobDescriptions = jobDescriptions;
    }

    public Job jobLevel(JobLevelEnum jobLevel) {
        this.jobLevel = jobLevel;
        return this;
    }

    /**
     * Get jobLevel
     *
     * @return jobLevel
     */


    @JsonProperty("jobLevel")
    public JobLevelEnum getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(JobLevelEnum jobLevel) {
        this.jobLevel = jobLevel;
    }

    public Job jobRequirements(List<JobRequirement> jobRequirements) {
        this.jobRequirements = jobRequirements;
        return this;
    }

    public Job addJobRequirementsItem(JobRequirement jobRequirementsItem) {
        if (this.jobRequirements == null) {
            this.jobRequirements = new ArrayList<>();
        }
        this.jobRequirements.add(jobRequirementsItem);
        return this;
    }

    /**
     * Get jobRequirements
     *
     * @return jobRequirements
     */


    @JsonProperty("jobRequirements")
    public List<JobRequirement> getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(List<JobRequirement> jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    public Job jobTitles(List<JobTitle> jobTitles) {
        this.jobTitles = jobTitles;
        return this;
    }

    public Job addJobTitlesItem(JobTitle jobTitlesItem) {
        if (this.jobTitles == null) {
            this.jobTitles = new ArrayList<>();
        }
        this.jobTitles.add(jobTitlesItem);
        return this;
    }

    /**
     * Get jobTitles
     *
     * @return jobTitles
     */


    @JsonProperty("jobTitles")
    public List<JobTitle> getJobTitles() {
        return jobTitles;
    }

    public void setJobTitles(List<JobTitle> jobTitles) {
        this.jobTitles = jobTitles;
    }

    public Job languageCode(JobLanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Get languageCode
     *
     * @return languageCode
     */


    @JsonProperty("languageCode")
    public JobLanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(JobLanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public Job localIds(List<LocalId> localIds) {
        this.localIds = localIds;
        return this;
    }

    public Job addLocalIdsItem(LocalId localIdsItem) {
        if (this.localIds == null) {
            this.localIds = new ArrayList<>();
        }
        this.localIds.add(localIdsItem);
        return this;
    }

    /**
     * Get localIds
     *
     * @return localIds
     */


    @JsonProperty("localIds")
    public List<LocalId> getLocalIds() {
        return localIds;
    }

    public void setLocalIds(List<LocalId> localIds) {
        this.localIds = localIds;
    }

    public Job modifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Get modifiedDate
     *
     * @return modifiedDate
     */


    @JsonProperty("modifiedDate")
    public OffsetDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Job openDate(OffsetDateTime openDate) {
        this.openDate = openDate;
        return this;
    }

    /**
     * Get openDate
     *
     * @return openDate
     */


    @JsonProperty("openDate")
    public OffsetDateTime getOpenDate() {
        return openDate;
    }

    public void setOpenDate(OffsetDateTime openDate) {
        this.openDate = openDate;
    }

    public Job orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     */


    @JsonProperty("orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Job payRates(List<PayRate> payRates) {
        this.payRates = payRates;
        return this;
    }

    public Job addPayRatesItem(PayRate payRatesItem) {
        if (this.payRates == null) {
            this.payRates = new ArrayList<>();
        }
        this.payRates.add(payRatesItem);
        return this;
    }

    /**
     * Get payRates
     *
     * @return payRates
     */


    @JsonProperty("payRates")
    public List<PayRate> getPayRates() {
        return payRates;
    }

    public void setPayRates(List<PayRate> payRates) {
        this.payRates = payRates;
    }

    public Job reasonForOpening(ReasonForOpeningEnum reasonForOpening) {
        this.reasonForOpening = reasonForOpening;
        return this;
    }

    /**
     * Get reasonForOpening
     *
     * @return reasonForOpening
     */


    @JsonProperty("reasonForOpening")
    public ReasonForOpeningEnum getReasonForOpening() {
        return reasonForOpening;
    }

    public void setReasonForOpening(ReasonForOpeningEnum reasonForOpening) {
        this.reasonForOpening = reasonForOpening;
    }

    public Job remoteWorkAllowed(Boolean remoteWorkAllowed) {
        this.remoteWorkAllowed = remoteWorkAllowed;
        return this;
    }

    /**
     * Get remoteWorkAllowed
     *
     * @return remoteWorkAllowed
     */


    @JsonProperty("remoteWorkAllowed")
    public Boolean getRemoteWorkAllowed() {
        return remoteWorkAllowed;
    }

    public void setRemoteWorkAllowed(Boolean remoteWorkAllowed) {
        this.remoteWorkAllowed = remoteWorkAllowed;
    }

    public Job sbiCode(String sbiCode) {
        this.sbiCode = sbiCode;
        return this;
    }

    /**
     * Get sbiCode
     *
     * @return sbiCode
     */


    @JsonProperty("sbiCode")
    public String getSbiCode() {
        return sbiCode;
    }

    public void setSbiCode(String sbiCode) {
        this.sbiCode = sbiCode;
    }

    public Job sbiLabel(String sbiLabel) {
        this.sbiLabel = sbiLabel;
        return this;
    }

    /**
     * Get sbiLabel
     *
     * @return sbiLabel
     */


    @JsonProperty("sbiLabel")
    public String getSbiLabel() {
        return sbiLabel;
    }

    public void setSbiLabel(String sbiLabel) {
        this.sbiLabel = sbiLabel;
    }

    public Job skills(List<Skill> skills) {
        this.skills = skills;
        return this;
    }

    public Job addSkillsItem(Skill skillsItem) {
        if (this.skills == null) {
            this.skills = new ArrayList<>();
        }
        this.skills.add(skillsItem);
        return this;
    }

    /**
     * Get skills
     *
     * @return skills
     */


    @JsonProperty("skills")
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Job workHours(List<WorkHours> workHours) {
        this.workHours = workHours;
        return this;
    }

    public Job addWorkHoursItem(WorkHours workHoursItem) {
        if (this.workHours == null) {
            this.workHours = new ArrayList<>();
        }
        this.workHours.add(workHoursItem);
        return this;
    }

    /**
     * Get workHours
     *
     * @return workHours
     */


    @JsonProperty("workHours")
    public List<WorkHours> getWorkHours() {
        return workHours;
    }

    public void setWorkHours(List<WorkHours> workHours) {
        this.workHours = workHours;
    }

    public Job clientContacts(List<ClientContactResponse> clientContacts) {
        this.clientContacts = clientContacts;
        return this;
    }

    public Job addClientContactsItem(ClientContactResponse clientContactsItem) {
        if (this.clientContacts == null) {
            this.clientContacts = new ArrayList<>();
        }
        this.clientContacts.add(clientContactsItem);
        return this;
    }

    /**
     * Get clientContacts
     *
     * @return clientContacts
     */


    @JsonProperty("clientContacts")
    public List<ClientContactResponse> getClientContacts() {
        return clientContacts;
    }

    public void setClientContacts(List<ClientContactResponse> clientContacts) {
        this.clientContacts = clientContacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return Objects.equals(this.jobId, job.jobId) &&
                Objects.equals(this.status, job.status) &&
                Objects.equals(this.opco, job.opco) &&
                Objects.equals(this.jobStartDate, job.jobStartDate) &&
                Objects.equals(this.jobEndDate, job.jobEndDate) &&
                Objects.equals(this.maxApplicants, job.maxApplicants) &&
                Objects.equals(this.contractTypes, job.contractTypes) &&
                Objects.equals(this.clientId, job.clientId) &&
                Objects.equals(this.clientName, job.clientName) &&
                Objects.equals(this.jobTitle, job.jobTitle) &&
                Objects.equals(this.jobClassificationIndustryLabel, job.jobClassificationIndustryLabel) &&
                Objects.equals(this.workLocations, job.workLocations) &&
                Objects.equals(this.educationalLabel, job.educationalLabel) &&
                Objects.equals(this.nightShift, job.nightShift) &&
                Objects.equals(this.applyLimit, job.applyLimit) &&
                Objects.equals(this.billRates, job.billRates) &&
                Objects.equals(this.certifications, job.certifications) &&
                Objects.equals(this.createdDate, job.createdDate) &&
                Objects.equals(this.deleted, job.deleted) &&
                Objects.equals(this.educationRequirements, job.educationRequirements) &&
                Objects.equals(this.employeeTypes, job.employeeTypes) &&
                Objects.equals(this.employmentCategories, job.employmentCategories) &&
                Objects.equals(this.estimatedEndDate, job.estimatedEndDate) &&
                Objects.equals(this.estimatedStartDate, job.estimatedStartDate) &&
                Objects.equals(this.expectedHoursOfService, job.expectedHoursOfService) &&
                Objects.equals(this.groupId, job.groupId) &&
                Objects.equals(this.internalConsultants, job.internalConsultants) &&
                Objects.equals(this.isBucketJobOrder, job.isBucketJobOrder) &&
                Objects.equals(this.jobClassification, job.jobClassification) &&
                Objects.equals(this.jobDescriptions, job.jobDescriptions) &&
                Objects.equals(this.jobLevel, job.jobLevel) &&
                Objects.equals(this.jobRequirements, job.jobRequirements) &&
                Objects.equals(this.jobTitles, job.jobTitles) &&
                Objects.equals(this.languageCode, job.languageCode) &&
                Objects.equals(this.localIds, job.localIds) &&
                Objects.equals(this.modifiedDate, job.modifiedDate) &&
                Objects.equals(this.openDate, job.openDate) &&
                Objects.equals(this.orderId, job.orderId) &&
                Objects.equals(this.payRates, job.payRates) &&
                Objects.equals(this.reasonForOpening, job.reasonForOpening) &&
                Objects.equals(this.remoteWorkAllowed, job.remoteWorkAllowed) &&
                Objects.equals(this.sbiCode, job.sbiCode) &&
                Objects.equals(this.sbiLabel, job.sbiLabel) &&
                Objects.equals(this.skills, job.skills) &&
                Objects.equals(this.workHours, job.workHours) &&
                Objects.equals(this.clientContacts, job.clientContacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, opco, jobStartDate, jobEndDate, maxApplicants, contractTypes, clientId, clientName, jobTitle, jobClassificationIndustryLabel, workLocations, educationalLabel, nightShift, applyLimit, billRates, certifications, createdDate, deleted, educationRequirements, employeeTypes, employmentCategories, estimatedEndDate, estimatedStartDate, expectedHoursOfService, groupId, internalConsultants, isBucketJobOrder, jobClassification, jobDescriptions, jobLevel, jobRequirements, jobTitles, languageCode, localIds, modifiedDate, openDate, orderId, payRates, reasonForOpening, remoteWorkAllowed, sbiCode, sbiLabel, skills, workHours, clientContacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    opco: ").append(toIndentedString(opco)).append("\n");
        sb.append("    jobStartDate: ").append(toIndentedString(jobStartDate)).append("\n");
        sb.append("    jobEndDate: ").append(toIndentedString(jobEndDate)).append("\n");
        sb.append("    maxApplicants: ").append(toIndentedString(maxApplicants)).append("\n");
        sb.append("    contractTypes: ").append(toIndentedString(contractTypes)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
        sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
        sb.append("    jobClassificationIndustryLabel: ").append(toIndentedString(jobClassificationIndustryLabel)).append("\n");
        sb.append("    workLocations: ").append(toIndentedString(workLocations)).append("\n");
        sb.append("    educationalLabel: ").append(toIndentedString(educationalLabel)).append("\n");
        sb.append("    nightShift: ").append(toIndentedString(nightShift)).append("\n");
        sb.append("    applyLimit: ").append(toIndentedString(applyLimit)).append("\n");
        sb.append("    billRates: ").append(toIndentedString(billRates)).append("\n");
        sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    educationRequirements: ").append(toIndentedString(educationRequirements)).append("\n");
        sb.append("    employeeTypes: ").append(toIndentedString(employeeTypes)).append("\n");
        sb.append("    employmentCategories: ").append(toIndentedString(employmentCategories)).append("\n");
        sb.append("    estimatedEndDate: ").append(toIndentedString(estimatedEndDate)).append("\n");
        sb.append("    estimatedStartDate: ").append(toIndentedString(estimatedStartDate)).append("\n");
        sb.append("    expectedHoursOfService: ").append(toIndentedString(expectedHoursOfService)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    internalConsultants: ").append(toIndentedString(internalConsultants)).append("\n");
        sb.append("    isBucketJobOrder: ").append(toIndentedString(isBucketJobOrder)).append("\n");
        sb.append("    jobClassification: ").append(toIndentedString(jobClassification)).append("\n");
        sb.append("    jobDescriptions: ").append(toIndentedString(jobDescriptions)).append("\n");
        sb.append("    jobLevel: ").append(toIndentedString(jobLevel)).append("\n");
        sb.append("    jobRequirements: ").append(toIndentedString(jobRequirements)).append("\n");
        sb.append("    jobTitles: ").append(toIndentedString(jobTitles)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    localIds: ").append(toIndentedString(localIds)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    payRates: ").append(toIndentedString(payRates)).append("\n");
        sb.append("    reasonForOpening: ").append(toIndentedString(reasonForOpening)).append("\n");
        sb.append("    remoteWorkAllowed: ").append(toIndentedString(remoteWorkAllowed)).append("\n");
        sb.append("    sbiCode: ").append(toIndentedString(sbiCode)).append("\n");
        sb.append("    sbiLabel: ").append(toIndentedString(sbiLabel)).append("\n");
        sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
        sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
        sb.append("    clientContacts: ").append(toIndentedString(clientContacts)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Gets or Sets contractTypes
     */
    public enum ContractTypesEnum {
        T("T"),

        U("U"),

        V("V");

        private final String value;

        ContractTypesEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ContractTypesEnum fromValue(String value) {
            for (ContractTypesEnum b : ContractTypesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Gets or Sets employeeTypes
     */
    public enum EmployeeTypesEnum {
        INTERNAL("Internal"),

        VALUE_UNSPECIFIED("Value unspecified"),

        VENDOR("Vendor"),

        W2("W2");

        private final String value;

        EmployeeTypesEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static EmployeeTypesEnum fromValue(String value) {
            for (EmployeeTypesEnum b : EmployeeTypesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Gets or Sets employmentCategories
     */
    public enum EmploymentCategoriesEnum {
        TEMP("Temp"),

        TEMP_TO_PERM("Temp to Perm"),

        CONTINGENT("Contingent"),

        PERM("Perm"),

        VALUE_UNSPECIFIED("Value unspecified");

        private final String value;

        EmploymentCategoriesEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static EmploymentCategoriesEnum fromValue(String value) {
            for (EmploymentCategoriesEnum b : EmploymentCategoriesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Gets or Sets expectedHoursOfService
     */
    public enum ExpectedHoursOfServiceEnum {
        PART_TIME("Part-Time"),

        FULL_TIME("Full-Time"),

        VALUE_UNSPECIFIED("Value unspecified");

        private final String value;

        ExpectedHoursOfServiceEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ExpectedHoursOfServiceEnum fromValue(String value) {
            for (ExpectedHoursOfServiceEnum b : ExpectedHoursOfServiceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Gets or Sets jobLevel
     */
    public enum JobLevelEnum {
        JUNIOR("Junior"),

        MEDIOR("Medior"),

        SENIOR("Senior");

        private final String value;

        JobLevelEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static JobLevelEnum fromValue(String value) {
            for (JobLevelEnum b : JobLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Gets or Sets reasonForOpening
     */
    public enum ReasonForOpeningEnum {
        BACKFILL_TERMINATION("Backfill - Termination"),

        BACKFILL_RESIGNATION("Backfill - Resignation"),

        BACKFILL_INTERNAL_TRANSFER("Backfill - Internal Transfer"),

        BACKFILL_PROMOTION("Backfill - Promotion"),

        BACKFILL_OTHER("Backfill - Other"),

        LEAVE_OF_ABSENCE_DISABILITY("Leave of Absence - Disability"),

        LEAVE_OF_ABSENCE_ILLNESS("Leave of Absence - Illness"),

        LEAVE_OF_ABSENCE_MATERNITY_PATERNITY_LEAVE("Leave of Absence - Maternity/Paternity Leave"),

        LEAVE_OF_ABSENCE_VACATION("Leave of Absence - Vacation"),

        LEAVE_OF_ABSENCE_OTHER("Leave of Absence - Other"),

        NET_NEW_POSITION("Net New Position"),

        NEW_PROJECT("New Project"),

        EXISTING_PROJECT("Existing Project"),

        SEASONAL("Seasonal");

        private final String value;

        ReasonForOpeningEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ReasonForOpeningEnum fromValue(String value) {
            for (ReasonForOpeningEnum b : ReasonForOpeningEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

