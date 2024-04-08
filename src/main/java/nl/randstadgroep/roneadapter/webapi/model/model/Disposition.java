package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Disposition
 */


public class Disposition {

    private String dispositionedBy;

    private String method;

    private String reason;

    public Disposition dispositionedBy(String dispositionedBy) {
        this.dispositionedBy = dispositionedBy;
        return this;
    }

    /**
     * Get dispositionedBy
     *
     * @return dispositionedBy
     */


    @JsonProperty("dispositionedBy")
    public String getDispositionedBy() {
        return dispositionedBy;
    }

    public void setDispositionedBy(String dispositionedBy) {
        this.dispositionedBy = dispositionedBy;
    }

    public Disposition method(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get method
     *
     * @return method
     */


    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Disposition reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     */


    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Disposition disposition = (Disposition) o;
        return Objects.equals(this.dispositionedBy, disposition.dispositionedBy) &&
                Objects.equals(this.method, disposition.method) &&
                Objects.equals(this.reason, disposition.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dispositionedBy, method, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Disposition {\n");
        sb.append("    dispositionedBy: ").append(toIndentedString(dispositionedBy)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

