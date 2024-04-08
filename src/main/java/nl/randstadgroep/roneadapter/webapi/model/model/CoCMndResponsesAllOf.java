package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CoCMndResponsesAllOf
 */

@JsonTypeName("CoCMndResponses_allOf")

public class CoCMndResponsesAllOf {


    private List<CocMnd> cocMnds;

    public CoCMndResponsesAllOf cocMnds(List<CocMnd> cocMnds) {
        this.cocMnds = cocMnds;
        return this;
    }

    public CoCMndResponsesAllOf addCocMndsItem(CocMnd cocMndsItem) {
        if (this.cocMnds == null) {
            this.cocMnds = new ArrayList<>();
        }
        this.cocMnds.add(cocMndsItem);
        return this;
    }

    /**
     * Get cocMnds
     *
     * @return cocMnds
     */


    @JsonProperty("cocMnds")
    public List<CocMnd> getCocMnds() {
        return cocMnds;
    }

    public void setCocMnds(List<CocMnd> cocMnds) {
        this.cocMnds = cocMnds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoCMndResponsesAllOf coCMndResponsesAllOf = (CoCMndResponsesAllOf) o;
        return Objects.equals(this.cocMnds, coCMndResponsesAllOf.cocMnds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cocMnds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoCMndResponsesAllOf {\n");
        sb.append("    cocMnds: ").append(toIndentedString(cocMnds)).append("\n");
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

