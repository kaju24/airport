package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ContactPersonCorrelation
 */


public class ContactPersonCorrelation {

    private String localBcpId;

    private String globalContactPersonId;

    private String localClientNumber;

    /**
     * Default constructor
     *
     * @deprecated Use {@link ContactPersonCorrelation#ContactPersonCorrelation(String, String, String)}
     */
    @Deprecated
    public ContactPersonCorrelation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ContactPersonCorrelation(String localBcpId, String globalContactPersonId, String localClientNumber) {
        this.localBcpId = localBcpId;
        this.globalContactPersonId = globalContactPersonId;
        this.localClientNumber = localClientNumber;
    }

    public ContactPersonCorrelation localBcpId(String localBcpId) {
        this.localBcpId = localBcpId;
        return this;
    }

    /**
     * Get localBcpId
     *
     * @return localBcpId
     */


    @JsonProperty("localBcpId")
    public String getLocalBcpId() {
        return localBcpId;
    }

    public void setLocalBcpId(String localBcpId) {
        this.localBcpId = localBcpId;
    }

    public ContactPersonCorrelation globalContactPersonId(String globalContactPersonId) {
        this.globalContactPersonId = globalContactPersonId;
        return this;
    }

    /**
     * Get globalContactPersonId
     *
     * @return globalContactPersonId
     */


    @JsonProperty("globalContactPersonId")
    public String getGlobalContactPersonId() {
        return globalContactPersonId;
    }

    public void setGlobalContactPersonId(String globalContactPersonId) {
        this.globalContactPersonId = globalContactPersonId;
    }

    public ContactPersonCorrelation localClientNumber(String localClientNumber) {
        this.localClientNumber = localClientNumber;
        return this;
    }

    /**
     * Get localClientNumber
     *
     * @return localClientNumber
     */


    @JsonProperty("localClientNumber")
    public String getLocalClientNumber() {
        return localClientNumber;
    }

    public void setLocalClientNumber(String localClientNumber) {
        this.localClientNumber = localClientNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactPersonCorrelation contactPersonCorrelation = (ContactPersonCorrelation) o;
        return Objects.equals(this.localBcpId, contactPersonCorrelation.localBcpId) &&
                Objects.equals(this.globalContactPersonId, contactPersonCorrelation.globalContactPersonId) &&
                Objects.equals(this.localClientNumber, contactPersonCorrelation.localClientNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localBcpId, globalContactPersonId, localClientNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactPersonCorrelation {\n");
        sb.append("    localBcpId: ").append(toIndentedString(localBcpId)).append("\n");
        sb.append("    globalContactPersonId: ").append(toIndentedString(globalContactPersonId)).append("\n");
        sb.append("    localClientNumber: ").append(toIndentedString(localClientNumber)).append("\n");
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

