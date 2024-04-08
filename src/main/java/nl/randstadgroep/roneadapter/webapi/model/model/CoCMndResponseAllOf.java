package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * CoCMndResponseAllOf
 */

@JsonTypeName("CoCMndResponse_allOf")

public class CoCMndResponseAllOf {

    private CocMnd cocMnd;

    public CoCMndResponseAllOf cocMnd(CocMnd cocMnd) {
        this.cocMnd = cocMnd;
        return this;
    }

    /**
     * Get cocMnd
     *
     * @return cocMnd
     */


    @JsonProperty("cocMnd")
    public CocMnd getCocMnd() {
        return cocMnd;
    }

    public void setCocMnd(CocMnd cocMnd) {
        this.cocMnd = cocMnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoCMndResponseAllOf coCMndResponseAllOf = (CoCMndResponseAllOf) o;
        return Objects.equals(this.cocMnd, coCMndResponseAllOf.cocMnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cocMnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoCMndResponseAllOf {\n");
        sb.append("    cocMnd: ").append(toIndentedString(cocMnd)).append("\n");
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

