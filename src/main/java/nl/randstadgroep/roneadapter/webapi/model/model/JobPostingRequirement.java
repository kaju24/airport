package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobPostingRequirement
 */


public class JobPostingRequirement {

    private String jobRequirementId;

    private Boolean shiftWork;

    private Boolean nightShift;

    private Boolean weekendShift;

    private String context;

    public JobPostingRequirement jobRequirementId(String jobRequirementId) {
        this.jobRequirementId = jobRequirementId;
        return this;
    }

    /**
     * Get jobRequirementId
     *
     * @return jobRequirementId
     */


    @JsonProperty("jobRequirementId")
    public String getJobRequirementId() {
        return jobRequirementId;
    }

    public void setJobRequirementId(String jobRequirementId) {
        this.jobRequirementId = jobRequirementId;
    }

    public JobPostingRequirement shiftWork(Boolean shiftWork) {
        this.shiftWork = shiftWork;
        return this;
    }

    /**
     * Get shiftWork
     *
     * @return shiftWork
     */


    @JsonProperty("shiftWork")
    public Boolean getShiftWork() {
        return shiftWork;
    }

    public void setShiftWork(Boolean shiftWork) {
        this.shiftWork = shiftWork;
    }

    public JobPostingRequirement nightShift(Boolean nightShift) {
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

    public JobPostingRequirement weekendShift(Boolean weekendShift) {
        this.weekendShift = weekendShift;
        return this;
    }

    /**
     * Get weekendShift
     *
     * @return weekendShift
     */


    @JsonProperty("weekendShift")
    public Boolean getWeekendShift() {
        return weekendShift;
    }

    public void setWeekendShift(Boolean weekendShift) {
        this.weekendShift = weekendShift;
    }

    public JobPostingRequirement context(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     *
     * @return context
     */


    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobPostingRequirement jobPostingRequirement = (JobPostingRequirement) o;
        return Objects.equals(this.jobRequirementId, jobPostingRequirement.jobRequirementId) &&
                Objects.equals(this.shiftWork, jobPostingRequirement.shiftWork) &&
                Objects.equals(this.nightShift, jobPostingRequirement.nightShift) &&
                Objects.equals(this.weekendShift, jobPostingRequirement.weekendShift) &&
                Objects.equals(this.context, jobPostingRequirement.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobRequirementId, shiftWork, nightShift, weekendShift, context);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobPostingRequirement {\n");
        sb.append("    jobRequirementId: ").append(toIndentedString(jobRequirementId)).append("\n");
        sb.append("    shiftWork: ").append(toIndentedString(shiftWork)).append("\n");
        sb.append("    nightShift: ").append(toIndentedString(nightShift)).append("\n");
        sb.append("    weekendShift: ").append(toIndentedString(weekendShift)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

