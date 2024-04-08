package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ColdConfigurationResponseAllOf
 */

@JsonTypeName("ColdConfigurationResponse_allOf")

public class ColdConfigurationResponseAllOf {


    private List<ColdConfiguration> coldConfigs;

    public ColdConfigurationResponseAllOf coldConfigs(List<ColdConfiguration> coldConfigs) {
        this.coldConfigs = coldConfigs;
        return this;
    }

    public ColdConfigurationResponseAllOf addColdConfigsItem(ColdConfiguration coldConfigsItem) {
        if (this.coldConfigs == null) {
            this.coldConfigs = new ArrayList<>();
        }
        this.coldConfigs.add(coldConfigsItem);
        return this;
    }

    /**
     * Get coldConfigs
     *
     * @return coldConfigs
     */


    @JsonProperty("coldConfigs")
    public List<ColdConfiguration> getColdConfigs() {
        return coldConfigs;
    }

    public void setColdConfigs(List<ColdConfiguration> coldConfigs) {
        this.coldConfigs = coldConfigs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColdConfigurationResponseAllOf coldConfigurationResponseAllOf = (ColdConfigurationResponseAllOf) o;
        return Objects.equals(this.coldConfigs, coldConfigurationResponseAllOf.coldConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coldConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColdConfigurationResponseAllOf {\n");
        sb.append("    coldConfigs: ").append(toIndentedString(coldConfigs)).append("\n");
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

