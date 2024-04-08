package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomContractCorrelation
 */


public class CustomContractCorrelation {

    private String localContractId;

    private String globalContractId;

    /**
     * Default constructor
     *
     * @deprecated Use {@link CustomContractCorrelation#CustomContractCorrelation(String, String)}
     */
    @Deprecated
    public CustomContractCorrelation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CustomContractCorrelation(String localContractId, String globalContractId) {
        this.localContractId = localContractId;
        this.globalContractId = globalContractId;
    }

    public CustomContractCorrelation localContractId(String localContractId) {
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

    public CustomContractCorrelation globalContractId(String globalContractId) {
        this.globalContractId = globalContractId;
        return this;
    }

    /**
     * Get globalContractId
     *
     * @return globalContractId
     */


    @JsonProperty("globalContractId")
    public String getGlobalContractId() {
        return globalContractId;
    }

    public void setGlobalContractId(String globalContractId) {
        this.globalContractId = globalContractId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomContractCorrelation customContractCorrelation = (CustomContractCorrelation) o;
        return Objects.equals(this.localContractId, customContractCorrelation.localContractId) &&
                Objects.equals(this.globalContractId, customContractCorrelation.globalContractId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localContractId, globalContractId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomContractCorrelation {\n");
        sb.append("    localContractId: ").append(toIndentedString(localContractId)).append("\n");
        sb.append("    globalContractId: ").append(toIndentedString(globalContractId)).append("\n");
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

