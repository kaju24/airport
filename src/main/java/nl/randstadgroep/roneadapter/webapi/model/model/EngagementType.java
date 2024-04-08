package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EngagementType
 */


public class EngagementType {

    private String id;

    private String clientOrgId;

    private EngagementTypeEnum type;

    private String clientName;

    public EngagementType id(String id) {
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

    public EngagementType clientOrgId(String clientOrgId) {
        this.clientOrgId = clientOrgId;
        return this;
    }

    /**
     * Get clientOrgId
     *
     * @return clientOrgId
     */


    @JsonProperty("clientOrgId")
    public String getClientOrgId() {
        return clientOrgId;
    }

    public void setClientOrgId(String clientOrgId) {
        this.clientOrgId = clientOrgId;
    }

    public EngagementType type(EngagementTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */


    @JsonProperty("type")
    public EngagementTypeEnum getType() {
        return type;
    }

    public void setType(EngagementTypeEnum type) {
        this.type = type;
    }

    public EngagementType clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Get clientName
     *
     * @return clientName
     */


    @JsonProperty("clientName")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EngagementType engagementType = (EngagementType) o;
        return Objects.equals(this.id, engagementType.id) &&
                Objects.equals(this.clientOrgId, engagementType.clientOrgId) &&
                Objects.equals(this.type, engagementType.type) &&
                Objects.equals(this.clientName, engagementType.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientOrgId, type, clientName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngagementType {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clientOrgId: ").append(toIndentedString(clientOrgId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
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

