package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Talent
 */


public class Talent {

    private Long accountNumber;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate availabilityDate;

    private OperatingCompany operatingCompany;

    private PersonalDetails personalDetails;

    private Address address;

    private Resume resume;

    private Certification certification;


    private List<EducationRecord> educationRecords;

    private EmailAddress emailAddress;


    private List<WorkExperience> workExperiences;

    private PhoneNumber phoneNumber;


    private List<EngagementTypeEnum> engagementTypes = new ArrayList<>();

    private WorkPreference workPreference;

    private String kenId;

    /**
     * Default constructor
     *
     * @deprecated Use {@link Talent#Talent(Long, OperatingCompany, PersonalDetails, EmailAddress, PhoneNumber, List<EngagementTypeEnum>)}
     */
    @Deprecated
    public Talent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Talent(Long accountNumber, OperatingCompany operatingCompany, PersonalDetails personalDetails, EmailAddress emailAddress, PhoneNumber phoneNumber, List<EngagementTypeEnum> engagementTypes) {
        this.accountNumber = accountNumber;
        this.operatingCompany = operatingCompany;
        this.personalDetails = personalDetails;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.engagementTypes = engagementTypes;
    }

    public Talent accountNumber(Long accountNumber) {
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

    public Talent createdDate(OffsetDateTime createdDate) {
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

    public Talent availabilityDate(LocalDate availabilityDate) {
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

    public Talent operatingCompany(OperatingCompany operatingCompany) {
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

    public Talent personalDetails(PersonalDetails personalDetails) {
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

    public Talent address(Address address) {
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

    public Talent resume(Resume resume) {
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

    public Talent certification(Certification certification) {
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

    public Talent educationRecords(List<EducationRecord> educationRecords) {
        this.educationRecords = educationRecords;
        return this;
    }

    public Talent addEducationRecordsItem(EducationRecord educationRecordsItem) {
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

    public Talent emailAddress(EmailAddress emailAddress) {
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

    public Talent workExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
        return this;
    }

    public Talent addWorkExperiencesItem(WorkExperience workExperiencesItem) {
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

    public Talent phoneNumber(PhoneNumber phoneNumber) {
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

    public Talent engagementTypes(List<EngagementTypeEnum> engagementTypes) {
        this.engagementTypes = engagementTypes;
        return this;
    }

    public Talent addEngagementTypesItem(EngagementTypeEnum engagementTypesItem) {
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

    public Talent workPreference(WorkPreference workPreference) {
        this.workPreference = workPreference;
        return this;
    }

    /**
     * Get workPreference
     *
     * @return workPreference
     */


    @JsonProperty("workPreference")
    public WorkPreference getWorkPreference() {
        return workPreference;
    }

    public void setWorkPreference(WorkPreference workPreference) {
        this.workPreference = workPreference;
    }

    public Talent kenId(String kenId) {
        this.kenId = kenId;
        return this;
    }

    /**
     * Get kenId
     *
     * @return kenId
     */


    @JsonProperty("kenId")
    public String getKenId() {
        return kenId;
    }

    public void setKenId(String kenId) {
        this.kenId = kenId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Talent talent = (Talent) o;
        return Objects.equals(this.accountNumber, talent.accountNumber) &&
                Objects.equals(this.createdDate, talent.createdDate) &&
                Objects.equals(this.availabilityDate, talent.availabilityDate) &&
                Objects.equals(this.operatingCompany, talent.operatingCompany) &&
                Objects.equals(this.personalDetails, talent.personalDetails) &&
                Objects.equals(this.address, talent.address) &&
                Objects.equals(this.resume, talent.resume) &&
                Objects.equals(this.certification, talent.certification) &&
                Objects.equals(this.educationRecords, talent.educationRecords) &&
                Objects.equals(this.emailAddress, talent.emailAddress) &&
                Objects.equals(this.workExperiences, talent.workExperiences) &&
                Objects.equals(this.phoneNumber, talent.phoneNumber) &&
                Objects.equals(this.engagementTypes, talent.engagementTypes) &&
                Objects.equals(this.workPreference, talent.workPreference) &&
                Objects.equals(this.kenId, talent.kenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, createdDate, availabilityDate, operatingCompany, personalDetails, address, resume, certification, educationRecords, emailAddress, workExperiences, phoneNumber, engagementTypes, workPreference, kenId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Talent {\n");
        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    availabilityDate: ").append(toIndentedString(availabilityDate)).append("\n");
        sb.append("    operatingCompany: ").append(toIndentedString(operatingCompany)).append("\n");
        sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
        sb.append("    certification: ").append(toIndentedString(certification)).append("\n");
        sb.append("    educationRecords: ").append(toIndentedString(educationRecords)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    workExperiences: ").append(toIndentedString(workExperiences)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    engagementTypes: ").append(toIndentedString(engagementTypes)).append("\n");
        sb.append("    workPreference: ").append(toIndentedString(workPreference)).append("\n");
        sb.append("    kenId: ").append(toIndentedString(kenId)).append("\n");
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

