package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CoCMndResponses
 */


public class CoCMndResponses {

    private StatusEnum status = StatusEnum.SUCCESS;
    private String error = "";
    private String message = "";
    private List<CocMnd> cocMnds;

    public CoCMndResponses status(StatusEnum status) {
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

    public CoCMndResponses error(String error) {
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

    public CoCMndResponses message(String message) {
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

    public CoCMndResponses cocMnds(List<CocMnd> cocMnds) {
        this.cocMnds = cocMnds;
        return this;
    }

    public CoCMndResponses addCocMndsItem(CocMnd cocMndsItem) {
        if (this.cocMnds == null) {
            this.cocMnds = new ArrayList<>();
        }
        this.cocMnds.add(cocMndsItem);
        return this;
    }

    /**
     * Get cocMnds
     *
     * @return cocMnds
     */


    @JsonProperty("cocMnds")
    public List<CocMnd> getCocMnds() {
        return cocMnds;
    }

    public void setCocMnds(List<CocMnd> cocMnds) {
        this.cocMnds = cocMnds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoCMndResponses coCMndResponses = (CoCMndResponses) o;
        return Objects.equals(this.status, coCMndResponses.status) &&
                Objects.equals(this.error, coCMndResponses.error) &&
                Objects.equals(this.message, coCMndResponses.message) &&
                Objects.equals(this.cocMnds, coCMndResponses.cocMnds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, error, message, cocMnds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoCMndResponses {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    cocMnds: ").append(toIndentedString(cocMnds)).append("\n");
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

