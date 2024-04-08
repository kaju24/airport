package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigValues
 */


public class ConfigValues {

    private String value;

    private String description;

    /**
     * Default constructor
     *
     * @deprecated Use {@link ConfigValues#ConfigValues(String, String)}
     */
    @Deprecated
    public ConfigValues() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ConfigValues(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public ConfigValues value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */


    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ConfigValues description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */


    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigValues configValues = (ConfigValues) o;
        return Objects.equals(this.value, configValues.value) &&
                Objects.equals(this.description, configValues.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigValues {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

