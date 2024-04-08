package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClientCorrelationRequest
 */


public class ClientCorrelationRequest {

    private String globalClientId;

    private String localClientId;

    private String relatedGlobalId;

    private Boolean isPreferred;

    private ClientCorrelationType correlationType;

    private String note;

    /**
     * Default constructor
     *
     * @deprecated Use {@link ClientCorrelationRequest#ClientCorrelationRequest(String, String, Boolean, ClientCorrelationType)}
     */
    @Deprecated
    public ClientCorrelationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ClientCorrelationRequest(String globalClientId, String localClientId, Boolean isPreferred, ClientCorrelationType correlationType) {
        this.globalClientId = globalClientId;
        this.localClientId = localClientId;
        this.isPreferred = isPreferred;
        this.correlationType = correlationType;
    }

    public ClientCorrelationRequest globalClientId(String globalClientId) {
        this.globalClientId = globalClientId;
        return this;
    }

    /**
     * Get globalClientId
     *
     * @return globalClientId
     */


    @JsonProperty("globalClientId")
    public String getGlobalClientId() {
        return globalClientId;
    }

    public void setGlobalClientId(String globalClientId) {
        this.globalClientId = globalClientId;
    }

    public ClientCorrelationRequest localClientId(String localClientId) {
        this.localClientId = localClientId;
        return this;
    }

    /**
     * Get localClientId
     *
     * @return localClientId
     */


    @JsonProperty("localClientId")
    public String getLocalClientId() {
        return localClientId;
    }

    public void setLocalClientId(String localClientId) {
        this.localClientId = localClientId;
    }

    public ClientCorrelationRequest relatedGlobalId(String relatedGlobalId) {
        this.relatedGlobalId = relatedGlobalId;
        return this;
    }

    /**
     * Get relatedGlobalId
     *
     * @return relatedGlobalId
     */


    @JsonProperty("relatedGlobalId")
    public String getRelatedGlobalId() {
        return relatedGlobalId;
    }

    public void setRelatedGlobalId(String relatedGlobalId) {
        this.relatedGlobalId = relatedGlobalId;
    }

    public ClientCorrelationRequest isPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
        return this;
    }

    /**
     * Get isPreferred
     *
     * @return isPreferred
     */


    @JsonProperty("isPreferred")
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    public ClientCorrelationRequest correlationType(ClientCorrelationType correlationType) {
        this.correlationType = correlationType;
        return this;
    }

    /**
     * Get correlationType
     *
     * @return correlationType
     */


    @JsonProperty("correlationType")
    public ClientCorrelationType getCorrelationType() {
        return correlationType;
    }

    public void setCorrelationType(ClientCorrelationType correlationType) {
        this.correlationType = correlationType;
    }

    public ClientCorrelationRequest note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get note
     *
     * @return note
     */


    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientCorrelationRequest clientCorrelationRequest = (ClientCorrelationRequest) o;
        return Objects.equals(this.globalClientId, clientCorrelationRequest.globalClientId) &&
                Objects.equals(this.localClientId, clientCorrelationRequest.localClientId) &&
                Objects.equals(this.relatedGlobalId, clientCorrelationRequest.relatedGlobalId) &&
                Objects.equals(this.isPreferred, clientCorrelationRequest.isPreferred) &&
                Objects.equals(this.correlationType, clientCorrelationRequest.correlationType) &&
                Objects.equals(this.note, clientCorrelationRequest.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalClientId, localClientId, relatedGlobalId, isPreferred, correlationType, note);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientCorrelationRequest {\n");
        sb.append("    globalClientId: ").append(toIndentedString(globalClientId)).append("\n");
        sb.append("    localClientId: ").append(toIndentedString(localClientId)).append("\n");
        sb.append("    relatedGlobalId: ").append(toIndentedString(relatedGlobalId)).append("\n");
        sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
        sb.append("    correlationType: ").append(toIndentedString(correlationType)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

