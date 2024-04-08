package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobRequirement
 */


public class JobRequirement {

    private String jobRequirementId;

    private Boolean shiftWork;

    private Boolean nightShift;

    private Boolean weekendShift;

    private String context;

    private Importance importance;

    public JobRequirement jobRequirementId(String jobRequirementId) {
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

    public JobRequirement shiftWork(Boolean shiftWork) {
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

    public JobRequirement nightShift(Boolean nightShift) {
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

    public JobRequirement weekendShift(Boolean weekendShift) {
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

    public JobRequirement context(String context) {
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

    public JobRequirement importance(Importance importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get importance
     *
     * @return importance
     */


    @JsonProperty("importance")
    public Importance getImportance() {
        return importance;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobRequirement jobRequirement = (JobRequirement) o;
        return Objects.equals(this.jobRequirementId, jobRequirement.jobRequirementId) &&
                Objects.equals(this.shiftWork, jobRequirement.shiftWork) &&
                Objects.equals(this.nightShift, jobRequirement.nightShift) &&
                Objects.equals(this.weekendShift, jobRequirement.weekendShift) &&
                Objects.equals(this.context, jobRequirement.context) &&
                Objects.equals(this.importance, jobRequirement.importance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobRequirementId, shiftWork, nightShift, weekendShift, context, importance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobRequirement {\n");
        sb.append("    jobRequirementId: ").append(toIndentedString(jobRequirementId)).append("\n");
        sb.append("    shiftWork: ").append(toIndentedString(shiftWork)).append("\n");
        sb.append("    nightShift: ").append(toIndentedString(nightShift)).append("\n");
        sb.append("    weekendShift: ").append(toIndentedString(weekendShift)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
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

