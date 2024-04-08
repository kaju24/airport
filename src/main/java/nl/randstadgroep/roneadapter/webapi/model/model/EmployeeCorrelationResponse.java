package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployeeCorrelationResponse
 */


public class EmployeeCorrelationResponse {

    private StatusEnum status = StatusEnum.SUCCESS;
    private String error = "";
    private String message = "";
    private List<String> employeeNumbers;
    private String globalTalentId;

    public EmployeeCorrelationResponse status(StatusEnum status) {
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

    public EmployeeCorrelationResponse error(String error) {
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

    public EmployeeCorrelationResponse message(String message) {
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

    public EmployeeCorrelationResponse employeeNumbers(List<String> employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
        return this;
    }

    public EmployeeCorrelationResponse addEmployeeNumbersItem(String employeeNumbersItem) {
        if (this.employeeNumbers == null) {
            this.employeeNumbers = new ArrayList<>();
        }
        this.employeeNumbers.add(employeeNumbersItem);
        return this;
    }

    /**
     * Get employeeNumbers
     *
     * @return employeeNumbers
     */


    @JsonProperty("employeeNumbers")
    public List<String> getEmployeeNumbers() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(List<String> employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
    }

    public EmployeeCorrelationResponse globalTalentId(String globalTalentId) {
        this.globalTalentId = globalTalentId;
        return this;
    }

    /**
     * Get globalTalentId
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeCorrelationResponse employeeCorrelationResponse = (EmployeeCorrelationResponse) o;
        return Objects.equals(this.status, employeeCorrelationResponse.status) &&
                Objects.equals(this.error, employeeCorrelationResponse.error) &&
                Objects.equals(this.message, employeeCorrelationResponse.message) &&
                Objects.equals(this.employeeNumbers, employeeCorrelationResponse.employeeNumbers) &&
                Objects.equals(this.globalTalentId, employeeCorrelationResponse.globalTalentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, error, message, employeeNumbers, globalTalentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmployeeCorrelationResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    employeeNumbers: ").append(toIndentedString(employeeNumbers)).append("\n");
        sb.append("    globalTalentId: ").append(toIndentedString(globalTalentId)).append("\n");
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

