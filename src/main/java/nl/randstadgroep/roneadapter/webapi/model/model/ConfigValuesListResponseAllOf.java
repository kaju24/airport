package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ConfigValuesListResponseAllOf
 */

@JsonTypeName("ConfigValuesListResponse_allOf")

public class ConfigValuesListResponseAllOf {


    private List<ConfigValues> values;

    public ConfigValuesListResponseAllOf values(List<ConfigValues> values) {
        this.values = values;
        return this;
    }

    public ConfigValuesListResponseAllOf addValuesItem(ConfigValues valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     *
     * @return values
     */


    @JsonProperty("values")
    public List<ConfigValues> getValues() {
        return values;
    }

    public void setValues(List<ConfigValues> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigValuesListResponseAllOf configValuesListResponseAllOf = (ConfigValuesListResponseAllOf) o;
        return Objects.equals(this.values, configValuesListResponseAllOf.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigValuesListResponseAllOf {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

