package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ConfigValuesListResponse
 */


public class ConfigValuesListResponse {

    private StatusEnum status = StatusEnum.SUCCESS;
    private String error = "";
    private String message = "";
    private List<ConfigValues> values;

    public ConfigValuesListResponse status(StatusEnum status) {
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

    public ConfigValuesListResponse error(String error) {
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

    public ConfigValuesListResponse message(String message) {
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

    public ConfigValuesListResponse values(List<ConfigValues> values) {
        this.values = values;
        return this;
    }

    public ConfigValuesListResponse addValuesItem(ConfigValues valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     *
     * @return values
     */


    @JsonProperty("values")
    public List<ConfigValues> getValues() {
        return values;
    }

    public void setValues(List<ConfigValues> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigValuesListResponse configValuesListResponse = (ConfigValuesListResponse) o;
        return Objects.equals(this.status, configValuesListResponse.status) &&
                Objects.equals(this.error, configValuesListResponse.error) &&
                Objects.equals(this.message, configValuesListResponse.message) &&
                Objects.equals(this.values, configValuesListResponse.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, error, message, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigValuesListResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

