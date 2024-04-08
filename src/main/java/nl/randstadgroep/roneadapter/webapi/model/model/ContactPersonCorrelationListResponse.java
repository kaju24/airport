package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ContactPersonCorrelationListResponse
 */


public class ContactPersonCorrelationListResponse {

    private StatusEnum status = StatusEnum.SUCCESS;
    private String error = "";
    private String message = "";
    private List<ContactPersonCorrelation> globalContactPersons;

    public ContactPersonCorrelationListResponse status(StatusEnum status) {
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

    public ContactPersonCorrelationListResponse error(String error) {
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

    public ContactPersonCorrelationListResponse message(String message) {
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

    public ContactPersonCorrelationListResponse globalContactPersons(List<ContactPersonCorrelation> globalContactPersons) {
        this.globalContactPersons = globalContactPersons;
        return this;
    }

    public ContactPersonCorrelationListResponse addGlobalContactPersonsItem(ContactPersonCorrelation globalContactPersonsItem) {
        if (this.globalContactPersons == null) {
            this.globalContactPersons = new ArrayList<>();
        }
        this.globalContactPersons.add(globalContactPersonsItem);
        return this;
    }

    /**
     * Get globalContactPersons
     *
     * @return globalContactPersons
     */


    @JsonProperty("globalContactPersons")
    public List<ContactPersonCorrelation> getGlobalContactPersons() {
        return globalContactPersons;
    }

    public void setGlobalContactPersons(List<ContactPersonCorrelation> globalContactPersons) {
        this.globalContactPersons = globalContactPersons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactPersonCorrelationListResponse contactPersonCorrelationListResponse = (ContactPersonCorrelationListResponse) o;
        return Objects.equals(this.status, contactPersonCorrelationListResponse.status) &&
                Objects.equals(this.error, contactPersonCorrelationListResponse.error) &&
                Objects.equals(this.message, contactPersonCorrelationListResponse.message) &&
                Objects.equals(this.globalContactPersons, contactPersonCorrelationListResponse.globalContactPersons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, error, message, globalContactPersons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactPersonCorrelationListResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    globalContactPersons: ").append(toIndentedString(globalContactPersons)).append("\n");
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

