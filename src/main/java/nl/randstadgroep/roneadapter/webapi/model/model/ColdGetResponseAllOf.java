package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ColdGetResponseAllOf
 */

@JsonTypeName("ColdGetResponse_allOf")

public class ColdGetResponseAllOf {

    private LocalDataResponse localDataResponse;

    public ColdGetResponseAllOf localDataResponse(LocalDataResponse localDataResponse) {
        this.localDataResponse = localDataResponse;
        return this;
    }

    /**
     * Get localDataResponse
     *
     * @return localDataResponse
     */


    @JsonProperty("localDataResponse")
    public LocalDataResponse getLocalDataResponse() {
        return localDataResponse;
    }

    public void setLocalDataResponse(LocalDataResponse localDataResponse) {
        this.localDataResponse = localDataResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColdGetResponseAllOf coldGetResponseAllOf = (ColdGetResponseAllOf) o;
        return Objects.equals(this.localDataResponse, coldGetResponseAllOf.localDataResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localDataResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColdGetResponseAllOf {\n");
        sb.append("    localDataResponse: ").append(toIndentedString(localDataResponse)).append("\n");
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

