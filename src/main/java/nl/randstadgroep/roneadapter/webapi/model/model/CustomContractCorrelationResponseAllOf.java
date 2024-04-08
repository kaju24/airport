package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CustomContractCorrelationResponseAllOf
 */

@JsonTypeName("CustomContractCorrelationResponse_allOf")

public class CustomContractCorrelationResponseAllOf {


    private List<CustomContractCorrelation> customContracts;

    public CustomContractCorrelationResponseAllOf customContracts(List<CustomContractCorrelation> customContracts) {
        this.customContracts = customContracts;
        return this;
    }

    public CustomContractCorrelationResponseAllOf addCustomContractsItem(CustomContractCorrelation customContractsItem) {
        if (this.customContracts == null) {
            this.customContracts = new ArrayList<>();
        }
        this.customContracts.add(customContractsItem);
        return this;
    }

    /**
     * Get customContracts
     *
     * @return customContracts
     */


    @JsonProperty("customContracts")
    public List<CustomContractCorrelation> getCustomContracts() {
        return customContracts;
    }

    public void setCustomContracts(List<CustomContractCorrelation> customContracts) {
        this.customContracts = customContracts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomContractCorrelationResponseAllOf customContractCorrelationResponseAllOf = (CustomContractCorrelationResponseAllOf) o;
        return Objects.equals(this.customContracts, customContractCorrelationResponseAllOf.customContracts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customContracts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomContractCorrelationResponseAllOf {\n");
        sb.append("    customContracts: ").append(toIndentedString(customContracts)).append("\n");
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

