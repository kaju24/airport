package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CustomContractCorrelationCreateRequest
 */


public class CustomContractCorrelationCreateRequest {

    private String localContractId;


    private List<String> globalContractIds = new ArrayList<>();

    /**
     * Default constructor
     *
     * @deprecated Use {@link CustomContractCorrelationCreateRequest#CustomContractCorrelationCreateRequest(String, List<String>)}
     */
    @Deprecated
    public CustomContractCorrelationCreateRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CustomContractCorrelationCreateRequest(String localContractId, List<String> globalContractIds) {
        this.localContractId = localContractId;
        this.globalContractIds = globalContractIds;
    }

    public CustomContractCorrelationCreateRequest localContractId(String localContractId) {
        this.localContractId = localContractId;
        return this;
    }

    /**
     * Get localContractId
     *
     * @return localContractId
     */


    @JsonProperty("localContractId")
    public String getLocalContractId() {
        return localContractId;
    }

    public void setLocalContractId(String localContractId) {
        this.localContractId = localContractId;
    }

    public CustomContractCorrelationCreateRequest globalContractIds(List<String> globalContractIds) {
        this.globalContractIds = globalContractIds;
        return this;
    }

    public CustomContractCorrelationCreateRequest addGlobalContractIdsItem(String globalContractIdsItem) {
        if (this.globalContractIds == null) {
            this.globalContractIds = new ArrayList<>();
        }
        this.globalContractIds.add(globalContractIdsItem);
        return this;
    }

    /**
     * Get globalContractIds
     *
     * @return globalContractIds
     */


    @JsonProperty("globalContractIds")
    public List<String> getGlobalContractIds() {
        return globalContractIds;
    }

    public void setGlobalContractIds(List<String> globalContractIds) {
        this.globalContractIds = globalContractIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomContractCorrelationCreateRequest customContractCorrelationCreateRequest = (CustomContractCorrelationCreateRequest) o;
        return Objects.equals(this.localContractId, customContractCorrelationCreateRequest.localContractId) &&
                Objects.equals(this.globalContractIds, customContractCorrelationCreateRequest.globalContractIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localContractId, globalContractIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomContractCorrelationCreateRequest {\n");
        sb.append("    localContractId: ").append(toIndentedString(localContractId)).append("\n");
        sb.append("    globalContractIds: ").append(toIndentedString(globalContractIds)).append("\n");
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

