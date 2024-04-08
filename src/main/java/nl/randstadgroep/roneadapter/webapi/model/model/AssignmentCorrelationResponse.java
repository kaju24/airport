package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * AssignmentCorrelationResponse
 */


public class AssignmentCorrelationResponse {

    private StatusEnum status = StatusEnum.SUCCESS;
    private String error = "";
    private String message = "";
    private AssignmentCorrelation globalAssignment;

    public AssignmentCorrelationResponse status(StatusEnum status) {
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

    public AssignmentCorrelationResponse error(String error) {
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

    public AssignmentCorrelationResponse message(String message) {
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

    public AssignmentCorrelationResponse globalAssignment(AssignmentCorrelation globalAssignment) {
        this.globalAssignment = globalAssignment;
        return this;
    }

    /**
     * Get globalAssignment
     *
     * @return globalAssignment
     */


    @JsonProperty("globalAssignment")
    public AssignmentCorrelation getGlobalAssignment() {
        return globalAssignment;
    }

    public void setGlobalAssignment(AssignmentCorrelation globalAssignment) {
        this.globalAssignment = globalAssignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignmentCorrelationResponse assignmentCorrelationResponse = (AssignmentCorrelationResponse) o;
        return Objects.equals(this.status, assignmentCorrelationResponse.status) &&
                Objects.equals(this.error, assignmentCorrelationResponse.error) &&
                Objects.equals(this.message, assignmentCorrelationResponse.message) &&
                Objects.equals(this.globalAssignment, assignmentCorrelationResponse.globalAssignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, error, message, globalAssignment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignmentCorrelationResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    globalAssignment: ").append(toIndentedString(globalAssignment)).append("\n");
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

