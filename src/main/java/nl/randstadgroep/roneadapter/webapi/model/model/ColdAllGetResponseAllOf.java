package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ColdAllGetResponseAllOf
 */

@JsonTypeName("ColdAllGetResponse_allOf")

public class ColdAllGetResponseAllOf {

    private OpcoDataPostResponse opcoDataPostResponse;

    public ColdAllGetResponseAllOf opcoDataPostResponse(OpcoDataPostResponse opcoDataPostResponse) {
        this.opcoDataPostResponse = opcoDataPostResponse;
        return this;
    }

    /**
     * Get opcoDataPostResponse
     *
     * @return opcoDataPostResponse
     */


    @JsonProperty("opcoDataPostResponse")
    public OpcoDataPostResponse getOpcoDataPostResponse() {
        return opcoDataPostResponse;
    }

    public void setOpcoDataPostResponse(OpcoDataPostResponse opcoDataPostResponse) {
        this.opcoDataPostResponse = opcoDataPostResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColdAllGetResponseAllOf coldAllGetResponseAllOf = (ColdAllGetResponseAllOf) o;
        return Objects.equals(this.opcoDataPostResponse, coldAllGetResponseAllOf.opcoDataPostResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opcoDataPostResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColdAllGetResponseAllOf {\n");
        sb.append("    opcoDataPostResponse: ").append(toIndentedString(opcoDataPostResponse)).append("\n");
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

