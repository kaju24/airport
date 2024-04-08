package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApplicationRequest
 */


public class ApplicationRequest {

    private String globalTalentId;

    private Application application;

    private Resume resume;


    private List<EducationRecord> educationRecords;


    private List<WorkExperience> workExperiences;

    private PhoneNumber phoneNumber;

    private OperatingCompany operatingCompany;


    private List<CommuteMethod> commuteMethods;

    private SourceEnum source;

    /**
     * Default constructor
     *
     * @deprecated Use {@link ApplicationRequest#ApplicationRequest(String, Application, OperatingCompany)}
     */
    @Deprecated
    public ApplicationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ApplicationRequest(String globalTalentId, Application application, OperatingCompany operatingCompany) {
        this.globalTalentId = globalTalentId;
        this.application = application;
        this.operatingCompany = operatingCompany;
    }

    public ApplicationRequest globalTalentId(String globalTalentId) {
        this.globalTalentId = globalTalentId;
        return this;
    }

    /**
     * global talent id
     *
     * @return globalTalentId
     */


    @JsonProperty("globalTalentId")
    public String getGlobalTalentId() {
        return globalTalentId;
    }

    public void setGlobalTalentId(String globalTalentId) {
        this.globalTalentId = globalTalentId;
    }

    public ApplicationRequest application(Application application) {
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

    public ApplicationRequest resume(Resume resume) {
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

    public ApplicationRequest educationRecords(List<EducationRecord> educationRecords) {
        this.educationRecords = educationRecords;
        return this;
    }

    public ApplicationRequest addEducationRecordsItem(EducationRecord educationRecordsItem) {
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

    public ApplicationRequest workExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
        return this;
    }

    public ApplicationRequest addWorkExperiencesItem(WorkExperience workExperiencesItem) {
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

    public ApplicationRequest phoneNumber(PhoneNumber phoneNumber) {
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

    public ApplicationRequest operatingCompany(OperatingCompany operatingCompany) {
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

    public ApplicationRequest commuteMethods(List<CommuteMethod> commuteMethods) {
        this.commuteMethods = commuteMethods;
        return this;
    }

    public ApplicationRequest addCommuteMethodsItem(CommuteMethod commuteMethodsItem) {
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

    public ApplicationRequest source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */


    @JsonProperty("source")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationRequest applicationRequest = (ApplicationRequest) o;
        return Objects.equals(this.globalTalentId, applicationRequest.globalTalentId) &&
                Objects.equals(this.application, applicationRequest.application) &&
                Objects.equals(this.resume, applicationRequest.resume) &&
                Objects.equals(this.educationRecords, applicationRequest.educationRecords) &&
                Objects.equals(this.workExperiences, applicationRequest.workExperiences) &&
                Objects.equals(this.phoneNumber, applicationRequest.phoneNumber) &&
                Objects.equals(this.operatingCompany, applicationRequest.operatingCompany) &&
                Objects.equals(this.commuteMethods, applicationRequest.commuteMethods) &&
                Objects.equals(this.source, applicationRequest.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalTalentId, application, resume, educationRecords, workExperiences, phoneNumber, operatingCompany, commuteMethods, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationRequest {\n");
        sb.append("    globalTalentId: ").append(toIndentedString(globalTalentId)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
        sb.append("    educationRecords: ").append(toIndentedString(educationRecords)).append("\n");
        sb.append("    workExperiences: ").append(toIndentedString(workExperiences)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    operatingCompany: ").append(toIndentedString(operatingCompany)).append("\n");
        sb.append("    commuteMethods: ").append(toIndentedString(commuteMethods)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

