package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LocalId
 */


public class LocalId {

    private String sourceSystemId;

    private String sourceSystem;

    private String id;

    private String updateTime;

    public LocalId sourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
        return this;
    }

    /**
     * Get sourceSystemId
     *
     * @return sourceSystemId
     */


    @JsonProperty("sourceSystemId")
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    public void setSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    public LocalId sourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }

    /**
     * Get sourceSystem
     *
     * @return sourceSystem
     */


    @JsonProperty("sourceSystem")
    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public LocalId id(String id) {
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

    public LocalId updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     *
     * @return updateTime
     */


    @JsonProperty("updateTime")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalId localId = (LocalId) o;
        return Objects.equals(this.sourceSystemId, localId.sourceSystemId) &&
                Objects.equals(this.sourceSystem, localId.sourceSystem) &&
                Objects.equals(this.id, localId.id) &&
                Objects.equals(this.updateTime, localId.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceSystemId, sourceSystem, id, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalId {\n");
        sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
        sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

