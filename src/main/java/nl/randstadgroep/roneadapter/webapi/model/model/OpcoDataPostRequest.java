package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpcoDataPostRequest
 */


public class OpcoDataPostRequest {

    private String globalId;

    private LocalDataRequest localData;

    /**
     * Default constructor
     *
     * @deprecated Use {@link OpcoDataPostRequest#OpcoDataPostRequest(String)}
     */
    @Deprecated
    public OpcoDataPostRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OpcoDataPostRequest(String globalId) {
        this.globalId = globalId;
    }

    public OpcoDataPostRequest globalId(String globalId) {
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

    public OpcoDataPostRequest localData(LocalDataRequest localData) {
        this.localData = localData;
        return this;
    }

    /**
     * Get localData
     *
     * @return localData
     */


    @JsonProperty("localData")
    public LocalDataRequest getLocalData() {
        return localData;
    }

    public void setLocalData(LocalDataRequest localData) {
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
        OpcoDataPostRequest opcoDataPostRequest = (OpcoDataPostRequest) o;
        return Objects.equals(this.globalId, opcoDataPostRequest.globalId) &&
                Objects.equals(this.localData, opcoDataPostRequest.localData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalId, localData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpcoDataPostRequest {\n");
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

