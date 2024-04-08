package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;

/**
 * WorkExperience
 */


public class WorkExperience {

    private String employerName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate endDate;

    private Boolean isCurrent;

    private String description;

    private String function;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;

    private String employerLocality;

    private RegionCode regionCode;

    public WorkExperience employerName(String employerName) {
        this.employerName = employerName;
        return this;
    }

    /**
     * The name of the employer company/organization. For example, \"Google\", \"Alphabet\", etc.
     *
     * @return employerName
     */


    @JsonProperty("employerName")
    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public WorkExperience endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * End date of the employment.
     *
     * @return endDate
     */


    @JsonProperty("endDate")
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public WorkExperience isCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    /**
     * Indicates if this employment is current. true/false. Default - Null
     *
     * @return isCurrent
     */


    @JsonProperty("isCurrent")
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public WorkExperience description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of job content.
     *
     * @return description
     */


    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkExperience function(String function) {
        this.function = function;
        return this;
    }

    /**
     * The job title of the employment.
     *
     * @return function
     */


    @JsonProperty("function")
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public WorkExperience startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Start date of employment.
     *
     * @return startDate
     */


    @JsonProperty("startDate")
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public WorkExperience employerLocality(String employerLocality) {
        this.employerLocality = employerLocality;
        return this;
    }

    /**
     * Get employerLocality
     *
     * @return employerLocality
     */


    @JsonProperty("employerLocality")
    public String getEmployerLocality() {
        return employerLocality;
    }

    public void setEmployerLocality(String employerLocality) {
        this.employerLocality = employerLocality;
    }

    public WorkExperience regionCode(RegionCode regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get regionCode
     *
     * @return regionCode
     */


    @JsonProperty("regionCode")
    public RegionCode getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(RegionCode regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkExperience workExperience = (WorkExperience) o;
        return Objects.equals(this.employerName, workExperience.employerName) &&
                Objects.equals(this.endDate, workExperience.endDate) &&
                Objects.equals(this.isCurrent, workExperience.isCurrent) &&
                Objects.equals(this.description, workExperience.description) &&
                Objects.equals(this.function, workExperience.function) &&
                Objects.equals(this.startDate, workExperience.startDate) &&
                Objects.equals(this.employerLocality, workExperience.employerLocality) &&
                Objects.equals(this.regionCode, workExperience.regionCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employerName, endDate, isCurrent, description, function, startDate, employerLocality, regionCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkExperience {\n");
        sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    employerLocality: ").append(toIndentedString(employerLocality)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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

