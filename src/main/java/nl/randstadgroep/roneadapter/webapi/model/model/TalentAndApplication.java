package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TalentAndApplication
 */


public class TalentAndApplication {

    private Long accountNumber;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate availabilityDate;

    private OperatingCompany operatingCompany;

    private PersonalDetails personalDetails;

    private Address address;

    private Resume resume;

    private Application application;

    private Certification certification;


    private List<EducationRecord> educationRecords;

    private EmailAddress emailAddress;


    private List<WorkExperience> workExperiences;

    private PhoneNumber phoneNumber;


    private List<EngagementTypeEnum> engagementTypes = new ArrayList<>();


    private List<CommuteMethod> commuteMethods;

    /**
     * Default constructor
     *
     * @deprecated Use {@link TalentAndApplication#TalentAndApplication(Long, OperatingCompany, PersonalDetails, Application, EmailAddress, PhoneNumber, List<EngagementTypeEnum>)}
     */
    @Deprecated
    public TalentAndApplication() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TalentAndApplication(Long accountNumber, OperatingCompany operatingCompany, PersonalDetails personalDetails, Application application, EmailAddress emailAddress, PhoneNumber phoneNumber, List<EngagementTypeEnum> engagementTypes) {
        this.accountNumber = accountNumber;
        this.operatingCompany = operatingCompany;
        this.personalDetails = personalDetails;
        this.application = application;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.engagementTypes = engagementTypes;
    }

    public TalentAndApplication accountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * local account number of talent
     *
     * @return accountNumber
     */


    @JsonProperty("accountNumber")
    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public TalentAndApplication createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * The timestamp of the talent creation date.
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

    public TalentAndApplication availabilityDate(LocalDate availabilityDate) {
        this.availabilityDate = availabilityDate;
        return this;
    }

    /**
     * The talent available date.
     *
     * @return availabilityDate
     */


    @JsonProperty("availabilityDate")
    public LocalDate getAvailabilityDate() {
        return availabilityDate;
    }

    public void setAvailabilityDate(LocalDate availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    public TalentAndApplication operatingCompany(OperatingCompany operatingCompany) {
        this.operatingCompany = operatingCompany;
        return this;
    }

    /**
     * Get operatingCompany
     *
     * @return operatingCompany
     */


    @JsonProperty("operatingCompany")
    public OperatingCompany getOperatingCompany() {
        return operatingCompany;
    }

    public void setOperatingCompany(OperatingCompany operatingCompany) {
        this.operatingCompany = operatingCompany;
    }

    public TalentAndApplication personalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
        return this;
    }

    /**
     * Get personalDetails
     *
     * @return personalDetails
     */


    @JsonProperty("personalDetails")
    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public TalentAndApplication address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     */


    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public TalentAndApplication resume(Resume resume) {
        this.resume = resume;
        return this;
    }

    /**
     * Get resume
     *
     * @return resume
     */


    @JsonProperty("resume")
    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public TalentAndApplication application(Application application) {
        this.application = application;
        return this;
    }

    /**
     * Get application
     *
     * @return application
     */


    @JsonProperty("application")
    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public TalentAndApplication certification(Certification certification) {
        this.certification = certification;
        return this;
    }

    /**
     * Get certification
     *
     * @return certification
     */


    @JsonProperty("certification")
    public Certification getCertification() {
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    public TalentAndApplication educationRecords(List<EducationRecord> educationRecords) {
        this.educationRecords = educationRecords;
        return this;
    }

    public TalentAndApplication addEducationRecordsItem(EducationRecord educationRecordsItem) {
        if (this.educationRecords == null) {
            this.educationRecords = new ArrayList<>();
        }
        this.educationRecords.add(educationRecordsItem);
        return this;
    }

    /**
     * Get educationRecords
     *
     * @return educationRecords
     */


    @JsonProperty("educationRecords")
    public List<EducationRecord> getEducationRecords() {
        return educationRecords;
    }

    public void setEducationRecords(List<EducationRecord> educationRecords) {
        this.educationRecords = educationRecords;
    }

    public TalentAndApplication emailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get emailAddress
     *
     * @return emailAddress
     */


    @JsonProperty("emailAddress")
    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public TalentAndApplication workExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
        return this;
    }

    public TalentAndApplication addWorkExperiencesItem(WorkExperience workExperiencesItem) {
        if (this.workExperiences == null) {
            this.workExperiences = new ArrayList<>();
        }
        this.workExperiences.add(workExperiencesItem);
        return this;
    }

    /**
     * Get workExperiences
     *
     * @return workExperiences
     */


    @JsonProperty("workExperiences")
    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public TalentAndApplication phoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     *
     * @return phoneNumber
     */


    @JsonProperty("phoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TalentAndApplication engagementTypes(List<EngagementTypeEnum> engagementTypes) {
        this.engagementTypes = engagementTypes;
        return this;
    }

    public TalentAndApplication addEngagementTypesItem(EngagementTypeEnum engagementTypesItem) {
        if (this.engagementTypes == null) {
            this.engagementTypes = new ArrayList<>();
        }
        this.engagementTypes.add(engagementTypesItem);
        return this;
    }

    /**
     * Get engagementTypes
     *
     * @return engagementTypes
     */


    @JsonProperty("engagementTypes")
    public List<EngagementTypeEnum> getEngagementTypes() {
        return engagementTypes;
    }

    public void setEngagementTypes(List<EngagementTypeEnum> engagementTypes) {
        this.engagementTypes = engagementTypes;
    }

    public TalentAndApplication commuteMethods(List<CommuteMethod> commuteMethods) {
        this.commuteMethods = commuteMethods;
        return this;
    }

    public TalentAndApplication addCommuteMethodsItem(CommuteMethod commuteMethodsItem) {
        if (this.commuteMethods == null) {
            this.commuteMethods = new ArrayList<>();
        }
        this.commuteMethods.add(commuteMethodsItem);
        return this;
    }

    /**
     * Get commuteMethods
     *
     * @return commuteMethods
     */


    @JsonProperty("commuteMethods")
    public List<CommuteMethod> getCommuteMethods() {
        return commuteMethods;
    }

    public void setCommuteMethods(List<CommuteMethod> commuteMethods) {
        this.commuteMethods = commuteMethods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TalentAndApplication talentAndApplication = (TalentAndApplication) o;
        return Objects.equals(this.accountNumber, talentAndApplication.accountNumber) &&
                Objects.equals(this.createdDate, talentAndApplication.createdDate) &&
                Objects.equals(this.availabilityDate, talentAndApplication.availabilityDate) &&
                Objects.equals(this.operatingCompany, talentAndApplication.operatingCompany) &&
                Objects.equals(this.personalDetails, talentAndApplication.personalDetails) &&
                Objects.equals(this.address, talentAndApplication.address) &&
                Objects.equals(this.resume, talentAndApplication.resume) &&
                Objects.equals(this.application, talentAndApplication.application) &&
                Objects.equals(this.certification, talentAndApplication.certification) &&
                Objects.equals(this.educationRecords, talentAndApplication.educationRecords) &&
                Objects.equals(this.emailAddress, talentAndApplication.emailAddress) &&
                Objects.equals(this.workExperiences, talentAndApplication.workExperiences) &&
                Objects.equals(this.phoneNumber, talentAndApplication.phoneNumber) &&
                Objects.equals(this.engagementTypes, talentAndApplication.engagementTypes) &&
                Objects.equals(this.commuteMethods, talentAndApplication.commuteMethods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, createdDate, availabilityDate, operatingCompany, personalDetails, address, resume, application, certification, educationRecords, emailAddress, workExperiences, phoneNumber, engagementTypes, commuteMethods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TalentAndApplication {\n");
        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    availabilityDate: ").append(toIndentedString(availabilityDate)).append("\n");
        sb.append("    operatingCompany: ").append(toIndentedString(operatingCompany)).append("\n");
        sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    certification: ").append(toIndentedString(certification)).append("\n");
        sb.append("    educationRecords: ").append(toIndentedString(educationRecords)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    workExperiences: ").append(toIndentedString(workExperiences)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    engagementTypes: ").append(toIndentedString(engagementTypes)).append("\n");
        sb.append("    commuteMethods: ").append(toIndentedString(commuteMethods)).append("\n");
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
}

