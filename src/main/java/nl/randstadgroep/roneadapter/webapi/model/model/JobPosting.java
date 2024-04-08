package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * JobPosting
 */


public class JobPosting {

    private String jobPostingId;

    private String jobId;

    private LanguageCode languageCode;

    private JobPostingStatus status;

    private Boolean showClientName;

    private Boolean hideSalary;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime publishStartDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime publishEndDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime modifyDate;


    private List<WebDetail> webDetails;

    private JobPostingTitle jobTitle;


    private List<JobPostingRequirement> jobRequirements;


    private List<JobPostingPayRate> payRates;


    private List<JobPostingWorkLocationAddress> workLocationAddresses;

    public JobPosting jobPostingId(String jobPostingId) {
        this.jobPostingId = jobPostingId;
        return this;
    }

    /**
     * Get jobPostingId
     *
     * @return jobPostingId
     */


    @JsonProperty("jobPostingId")
    public String getJobPostingId() {
        return jobPostingId;
    }

    public void setJobPostingId(String jobPostingId) {
        this.jobPostingId = jobPostingId;
    }

    public JobPosting jobId(String jobId) {
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

    public JobPosting languageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Get languageCode
     *
     * @return languageCode
     */


    @JsonProperty("languageCode")
    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public JobPosting status(JobPostingStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */


    @JsonProperty("status")
    public JobPostingStatus getStatus() {
        return status;
    }

    public void setStatus(JobPostingStatus status) {
        this.status = status;
    }

    public JobPosting showClientName(Boolean showClientName) {
        this.showClientName = showClientName;
        return this;
    }

    /**
     * Get showClientName
     *
     * @return showClientName
     */


    @JsonProperty("showClientName")
    public Boolean getShowClientName() {
        return showClientName;
    }

    public void setShowClientName(Boolean showClientName) {
        this.showClientName = showClientName;
    }

    public JobPosting hideSalary(Boolean hideSalary) {
        this.hideSalary = hideSalary;
        return this;
    }

    /**
     * Get hideSalary
     *
     * @return hideSalary
     */


    @JsonProperty("hideSalary")
    public Boolean getHideSalary() {
        return hideSalary;
    }

    public void setHideSalary(Boolean hideSalary) {
        this.hideSalary = hideSalary;
    }

    public JobPosting publishStartDate(OffsetDateTime publishStartDate) {
        this.publishStartDate = publishStartDate;
        return this;
    }

    /**
     * The timestamp of the job posting publish start date
     *
     * @return publishStartDate
     */


    @JsonProperty("publishStartDate")
    public OffsetDateTime getPublishStartDate() {
        return publishStartDate;
    }

    public void setPublishStartDate(OffsetDateTime publishStartDate) {
        this.publishStartDate = publishStartDate;
    }

    public JobPosting publishEndDate(OffsetDateTime publishEndDate) {
        this.publishEndDate = publishEndDate;
        return this;
    }

    /**
     * The timestamp of the job posting publishing end date
     *
     * @return publishEndDate
     */


    @JsonProperty("publishEndDate")
    public OffsetDateTime getPublishEndDate() {
        return publishEndDate;
    }

    public void setPublishEndDate(OffsetDateTime publishEndDate) {
        this.publishEndDate = publishEndDate;
    }

    public JobPosting modifyDate(OffsetDateTime modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    /**
     * The timestamp of the job posting last modified date
     *
     * @return modifyDate
     */


    @JsonProperty("modifyDate")
    public OffsetDateTime getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(OffsetDateTime modifyDate) {
        this.modifyDate = modifyDate;
    }

    public JobPosting webDetails(List<WebDetail> webDetails) {
        this.webDetails = webDetails;
        return this;
    }

    public JobPosting addWebDetailsItem(WebDetail webDetailsItem) {
        if (this.webDetails == null) {
            this.webDetails = new ArrayList<>();
        }
        this.webDetails.add(webDetailsItem);
        return this;
    }

    /**
     * Get webDetails
     *
     * @return webDetails
     */


    @JsonProperty("webDetails")
    public List<WebDetail> getWebDetails() {
        return webDetails;
    }

    public void setWebDetails(List<WebDetail> webDetails) {
        this.webDetails = webDetails;
    }

    public JobPosting jobTitle(JobPostingTitle jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get jobTitle
     *
     * @return jobTitle
     */


    @JsonProperty("jobTitle")
    public JobPostingTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobPostingTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public JobPosting jobRequirements(List<JobPostingRequirement> jobRequirements) {
        this.jobRequirements = jobRequirements;
        return this;
    }

    public JobPosting addJobRequirementsItem(JobPostingRequirement jobRequirementsItem) {
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
    public List<JobPostingRequirement> getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(List<JobPostingRequirement> jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    public JobPosting payRates(List<JobPostingPayRate> payRates) {
        this.payRates = payRates;
        return this;
    }

    public JobPosting addPayRatesItem(JobPostingPayRate payRatesItem) {
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
    public List<JobPostingPayRate> getPayRates() {
        return payRates;
    }

    public void setPayRates(List<JobPostingPayRate> payRates) {
        this.payRates = payRates;
    }

    public JobPosting workLocationAddresses(List<JobPostingWorkLocationAddress> workLocationAddresses) {
        this.workLocationAddresses = workLocationAddresses;
        return this;
    }

    public JobPosting addWorkLocationAddressesItem(JobPostingWorkLocationAddress workLocationAddressesItem) {
        if (this.workLocationAddresses == null) {
            this.workLocationAddresses = new ArrayList<>();
        }
        this.workLocationAddresses.add(workLocationAddressesItem);
        return this;
    }

    /**
     * Get workLocationAddresses
     *
     * @return workLocationAddresses
     */


    @JsonProperty("workLocationAddresses")
    public List<JobPostingWorkLocationAddress> getWorkLocationAddresses() {
        return workLocationAddresses;
    }

    public void setWorkLocationAddresses(List<JobPostingWorkLocationAddress> workLocationAddresses) {
        this.workLocationAddresses = workLocationAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobPosting jobPosting = (JobPosting) o;
        return Objects.equals(this.jobPostingId, jobPosting.jobPostingId) &&
                Objects.equals(this.jobId, jobPosting.jobId) &&
                Objects.equals(this.languageCode, jobPosting.languageCode) &&
                Objects.equals(this.status, jobPosting.status) &&
                Objects.equals(this.showClientName, jobPosting.showClientName) &&
                Objects.equals(this.hideSalary, jobPosting.hideSalary) &&
                Objects.equals(this.publishStartDate, jobPosting.publishStartDate) &&
                Objects.equals(this.publishEndDate, jobPosting.publishEndDate) &&
                Objects.equals(this.modifyDate, jobPosting.modifyDate) &&
                Objects.equals(this.webDetails, jobPosting.webDetails) &&
                Objects.equals(this.jobTitle, jobPosting.jobTitle) &&
                Objects.equals(this.jobRequirements, jobPosting.jobRequirements) &&
                Objects.equals(this.payRates, jobPosting.payRates) &&
                Objects.equals(this.workLocationAddresses, jobPosting.workLocationAddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobPostingId, jobId, languageCode, status, showClientName, hideSalary, publishStartDate, publishEndDate, modifyDate, webDetails, jobTitle, jobRequirements, payRates, workLocationAddresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobPosting {\n");
        sb.append("    jobPostingId: ").append(toIndentedString(jobPostingId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    showClientName: ").append(toIndentedString(showClientName)).append("\n");
        sb.append("    hideSalary: ").append(toIndentedString(hideSalary)).append("\n");
        sb.append("    publishStartDate: ").append(toIndentedString(publishStartDate)).append("\n");
        sb.append("    publishEndDate: ").append(toIndentedString(publishEndDate)).append("\n");
        sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
        sb.append("    webDetails: ").append(toIndentedString(webDetails)).append("\n");
        sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
        sb.append("    jobRequirements: ").append(toIndentedString(jobRequirements)).append("\n");
        sb.append("    payRates: ").append(toIndentedString(payRates)).append("\n");
        sb.append("    workLocationAddresses: ").append(toIndentedString(workLocationAddresses)).append("\n");
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

