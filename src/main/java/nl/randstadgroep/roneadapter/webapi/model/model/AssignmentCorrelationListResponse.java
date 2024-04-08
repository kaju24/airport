package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AssignmentCorrelationListResponse
 */


public class AssignmentCorrelationListResponse {

    private StatusEnum status = StatusEnum.SUCCESS;
    private String error = "";
    private String message = "";
    private List<AssignmentCorrelation> globalAssignments;

    public AssignmentCorrelationListResponse status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */


    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AssignmentCorrelationListResponse error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     */


    @JsonProperty("error")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public AssignmentCorrelationListResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */


    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AssignmentCorrelationListResponse globalAssignments(List<AssignmentCorrelation> globalAssignments) {
        this.globalAssignments = globalAssignments;
        return this;
    }

    public AssignmentCorrelationListResponse addGlobalAssignmentsItem(AssignmentCorrelation globalAssignmentsItem) {
        if (this.globalAssignments == null) {
            this.globalAssignments = new ArrayList<>();
        }
        this.globalAssignments.add(globalAssignmentsItem);
        return this;
    }

    /**
     * Get globalAssignments
     *
     * @return globalAssignments
     */


    @JsonProperty("globalAssignments")
    public List<AssignmentCorrelation> getGlobalAssignments() {
        return globalAssignments;
    }

    public void setGlobalAssignments(List<AssignmentCorrelation> globalAssignments) {
        this.globalAssignments = globalAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignmentCorrelationListResponse assignmentCorrelationListResponse = (AssignmentCorrelationListResponse) o;
        return Objects.equals(this.status, assignmentCorrelationListResponse.status) &&
                Objects.equals(this.error, assignmentCorrelationListResponse.error) &&
                Objects.equals(this.message, assignmentCorrelationListResponse.message) &&
                Objects.equals(this.globalAssignments, assignmentCorrelationListResponse.globalAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, error, message, globalAssignments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignmentCorrelationListResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    globalAssignments: ").append(toIndentedString(globalAssignments)).append("\n");
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
     * Gets or Sets status
     */
    public enum StatusEnum {
        SUCCESS("success"),

        ERROR("error");

        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
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

