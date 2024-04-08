package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ColdConfigurationRequest
 */


public class ColdConfigurationRequest {

    private String objectType;

    private String system;

    private String label;

    private OperatingCompany owningType;

    /**
     * Default constructor
     *
     * @deprecated Use {@link ColdConfigurationRequest#ColdConfigurationRequest(String, String, String, OperatingCompany)}
     */
    @Deprecated
    public ColdConfigurationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ColdConfigurationRequest(String objectType, String system, String label, OperatingCompany owningType) {
        this.objectType = objectType;
        this.system = system;
        this.label = label;
        this.owningType = owningType;
    }

    public ColdConfigurationRequest objectType(String objectType) {
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

    public ColdConfigurationRequest system(String system) {
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

    public ColdConfigurationRequest label(String label) {
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

    public ColdConfigurationRequest owningType(OperatingCompany owningType) {
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
        ColdConfigurationRequest coldConfigurationRequest = (ColdConfigurationRequest) o;
        return Objects.equals(this.objectType, coldConfigurationRequest.objectType) &&
                Objects.equals(this.system, coldConfigurationRequest.system) &&
                Objects.equals(this.label, coldConfigurationRequest.label) &&
                Objects.equals(this.owningType, coldConfigurationRequest.owningType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType, system, label, owningType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColdConfigurationRequest {\n");
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

