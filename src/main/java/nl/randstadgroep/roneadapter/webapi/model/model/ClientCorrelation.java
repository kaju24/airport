package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ClientCorrelation
 */


public class ClientCorrelation {

    private String id;

    private String globalClientId;

    private String localClientId;

    private String relatedGlobalId;

    private Boolean isPreferred;

    private ClientCorrelationType correlationType;


    private List<String> notes;

    public ClientCorrelation id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */


    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientCorrelation globalClientId(String globalClientId) {
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

    public ClientCorrelation localClientId(String localClientId) {
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

    public ClientCorrelation relatedGlobalId(String relatedGlobalId) {
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

    public ClientCorrelation isPreferred(Boolean isPreferred) {
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

    public ClientCorrelation correlationType(ClientCorrelationType correlationType) {
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

    public ClientCorrelation notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public ClientCorrelation addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     */


    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientCorrelation clientCorrelation = (ClientCorrelation) o;
        return Objects.equals(this.id, clientCorrelation.id) &&
                Objects.equals(this.globalClientId, clientCorrelation.globalClientId) &&
                Objects.equals(this.localClientId, clientCorrelation.localClientId) &&
                Objects.equals(this.relatedGlobalId, clientCorrelation.relatedGlobalId) &&
                Objects.equals(this.isPreferred, clientCorrelation.isPreferred) &&
                Objects.equals(this.correlationType, clientCorrelation.correlationType) &&
                Objects.equals(this.notes, clientCorrelation.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, globalClientId, localClientId, relatedGlobalId, isPreferred, correlationType, notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientCorrelation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    globalClientId: ").append(toIndentedString(globalClientId)).append("\n");
        sb.append("    localClientId: ").append(toIndentedString(localClientId)).append("\n");
        sb.append("    relatedGlobalId: ").append(toIndentedString(relatedGlobalId)).append("\n");
        sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
        sb.append("    correlationType: ").append(toIndentedString(correlationType)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

