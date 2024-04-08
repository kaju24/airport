package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Stage
 */


public class Stage {

    private String assigneeInternalResourceId;

    private String stageType;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedDate;

    private String status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime statusUpdatedDate;

    public Stage assigneeInternalResourceId(String assigneeInternalResourceId) {
        this.assigneeInternalResourceId = assigneeInternalResourceId;
        return this;
    }

    /**
     * Get assigneeInternalResourceId
     *
     * @return assigneeInternalResourceId
     */


    @JsonProperty("assigneeInternalResourceId")
    public String getAssigneeInternalResourceId() {
        return assigneeInternalResourceId;
    }

    public void setAssigneeInternalResourceId(String assigneeInternalResourceId) {
        this.assigneeInternalResourceId = assigneeInternalResourceId;
    }

    public Stage stageType(String stageType) {
        this.stageType = stageType;
        return this;
    }

    /**
     * Get stageType
     *
     * @return stageType
     */


    @JsonProperty("stageType")
    public String getStageType() {
        return stageType;
    }

    public void setStageType(String stageType) {
        this.stageType = stageType;
    }

    public Stage startedDate(OffsetDateTime startedDate) {
        this.startedDate = startedDate;
        return this;
    }

    /**
     * Get startedDate
     *
     * @return startedDate
     */


    @JsonProperty("startedDate")
    public OffsetDateTime getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(OffsetDateTime startedDate) {
        this.startedDate = startedDate;
    }

    public Stage status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */


    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Stage statusUpdatedDate(OffsetDateTime statusUpdatedDate) {
        this.statusUpdatedDate = statusUpdatedDate;
        return this;
    }

    /**
     * Get statusUpdatedDate
     *
     * @return statusUpdatedDate
     */


    @JsonProperty("statusUpdatedDate")
    public OffsetDateTime getStatusUpdatedDate() {
        return statusUpdatedDate;
    }

    public void setStatusUpdatedDate(OffsetDateTime statusUpdatedDate) {
        this.statusUpdatedDate = statusUpdatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stage stage = (Stage) o;
        return Objects.equals(this.assigneeInternalResourceId, stage.assigneeInternalResourceId) &&
                Objects.equals(this.stageType, stage.stageType) &&
                Objects.equals(this.startedDate, stage.startedDate) &&
                Objects.equals(this.status, stage.status) &&
                Objects.equals(this.statusUpdatedDate, stage.statusUpdatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assigneeInternalResourceId, stageType, startedDate, status, statusUpdatedDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stage {\n");
        sb.append("    assigneeInternalResourceId: ").append(toIndentedString(assigneeInternalResourceId)).append("\n");
        sb.append("    stageType: ").append(toIndentedString(stageType)).append("\n");
        sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdatedDate: ").append(toIndentedString(statusUpdatedDate)).append("\n");
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

