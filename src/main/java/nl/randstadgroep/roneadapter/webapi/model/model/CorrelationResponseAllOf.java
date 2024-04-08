package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CorrelationResponseAllOf
 */

@JsonTypeName("CorrelationResponse_allOf")

public class CorrelationResponseAllOf {

    private String id;


    private List<String> ids;

    public CorrelationResponseAllOf id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */


    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CorrelationResponseAllOf ids(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public CorrelationResponseAllOf addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    /**
     * Get ids
     *
     * @return ids
     */


    @JsonProperty("ids")
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorrelationResponseAllOf correlationResponseAllOf = (CorrelationResponseAllOf) o;
        return Objects.equals(this.id, correlationResponseAllOf.id) &&
                Objects.equals(this.ids, correlationResponseAllOf.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorrelationResponseAllOf {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

