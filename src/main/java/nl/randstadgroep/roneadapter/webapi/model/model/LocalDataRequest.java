package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LocalDataRequest
 */


public class LocalDataRequest {

    private String system;

    private String label;

    private String value;

    /**
     * Default constructor
     *
     * @deprecated Use {@link LocalDataRequest#LocalDataRequest(String, String, String)}
     */
    @Deprecated
    public LocalDataRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public LocalDataRequest(String system, String label, String value) {
        this.system = system;
        this.label = label;
        this.value = value;
    }

    public LocalDataRequest system(String system) {
        this.system = system;
        return this;
    }

    /**
     * Get system
     *
     * @return system
     */


    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public LocalDataRequest label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     */


    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public LocalDataRequest value(String value) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalDataRequest localDataRequest = (LocalDataRequest) o;
        return Objects.equals(this.system, localDataRequest.system) &&
                Objects.equals(this.label, localDataRequest.label) &&
                Objects.equals(this.value, localDataRequest.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(system, label, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalDataRequest {\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

