package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ColdConfiguration
 */


public class ColdConfiguration {

    private String objectType;

    private String system;

    private String label;

    private OperatingCompany owningType;

    public ColdConfiguration objectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get objectType
     *
     * @return objectType
     */


    @JsonProperty("objectType")
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ColdConfiguration system(String system) {
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

    public ColdConfiguration label(String label) {
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

    public ColdConfiguration owningType(OperatingCompany owningType) {
        this.owningType = owningType;
        return this;
    }

    /**
     * Get owningType
     *
     * @return owningType
     */


    @JsonProperty("owningType")
    public OperatingCompany getOwningType() {
        return owningType;
    }

    public void setOwningType(OperatingCompany owningType) {
        this.owningType = owningType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColdConfiguration coldConfiguration = (ColdConfiguration) o;
        return Objects.equals(this.objectType, coldConfiguration.objectType) &&
                Objects.equals(this.system, coldConfiguration.system) &&
                Objects.equals(this.label, coldConfiguration.label) &&
                Objects.equals(this.owningType, coldConfiguration.owningType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType, system, label, owningType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColdConfiguration {\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    owningType: ").append(toIndentedString(owningType)).append("\n");
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

