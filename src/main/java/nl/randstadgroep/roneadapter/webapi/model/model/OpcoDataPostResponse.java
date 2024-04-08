package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OpcoDataPostResponse
 */


public class OpcoDataPostResponse {

    private String owningEntity;

    private String objectType;

    private String globalId;


    private List<LocalDataResponse> localData = new ArrayList<>();

    /**
     * Default constructor
     *
     * @deprecated Use {@link OpcoDataPostResponse#OpcoDataPostResponse(String, String, String, List< LocalDataResponse>)}
     */
    @Deprecated
    public OpcoDataPostResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OpcoDataPostResponse(String owningEntity, String objectType, String globalId, List<LocalDataResponse> localData) {
        this.owningEntity = owningEntity;
        this.objectType = objectType;
        this.globalId = globalId;
        this.localData = localData;
    }

    public OpcoDataPostResponse owningEntity(String owningEntity) {
        this.owningEntity = owningEntity;
        return this;
    }

    /**
     * Get owningEntity
     *
     * @return owningEntity
     */


    @JsonProperty("owningEntity")
    public String getOwningEntity() {
        return owningEntity;
    }

    public void setOwningEntity(String owningEntity) {
        this.owningEntity = owningEntity;
    }

    public OpcoDataPostResponse objectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get objectType
     *
     * @return objectType
     */


    @JsonProperty("objectType")
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public OpcoDataPostResponse globalId(String globalId) {
        this.globalId = globalId;
        return this;
    }

    /**
     * Get globalId
     *
     * @return globalId
     */


    @JsonProperty("globalId")
    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public OpcoDataPostResponse localData(List<LocalDataResponse> localData) {
        this.localData = localData;
        return this;
    }

    public OpcoDataPostResponse addLocalDataItem(LocalDataResponse localDataItem) {
        if (this.localData == null) {
            this.localData = new ArrayList<>();
        }
        this.localData.add(localDataItem);
        return this;
    }

    /**
     * Get localData
     *
     * @return localData
     */


    @JsonProperty("localData")
    public List<LocalDataResponse> getLocalData() {
        return localData;
    }

    public void setLocalData(List<LocalDataResponse> localData) {
        this.localData = localData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpcoDataPostResponse opcoDataPostResponse = (OpcoDataPostResponse) o;
        return Objects.equals(this.owningEntity, opcoDataPostResponse.owningEntity) &&
                Objects.equals(this.objectType, opcoDataPostResponse.objectType) &&
                Objects.equals(this.globalId, opcoDataPostResponse.globalId) &&
                Objects.equals(this.localData, opcoDataPostResponse.localData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owningEntity, objectType, globalId, localData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpcoDataPostResponse {\n");
        sb.append("    owningEntity: ").append(toIndentedString(owningEntity)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
        sb.append("    localData: ").append(toIndentedString(localData)).append("\n");
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

