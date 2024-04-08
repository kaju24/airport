package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EmployeeCorrelation
 */


public class EmployeeCorrelation {

    private String globalTalentId;

    private String employeeNumber;

    private OperatingCompany owningEntity;

    private EngagementTypeEnum engagementType;

    private String relatedGlobalClientId;

    /**
     * Default constructor
     *
     * @deprecated Use {@link EmployeeCorrelation#EmployeeCorrelation(String, String, OperatingCompany, EngagementTypeEnum)}
     */
    @Deprecated
    public EmployeeCorrelation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EmployeeCorrelation(String globalTalentId, String employeeNumber, OperatingCompany owningEntity, EngagementTypeEnum engagementType) {
        this.globalTalentId = globalTalentId;
        this.employeeNumber = employeeNumber;
        this.owningEntity = owningEntity;
        this.engagementType = engagementType;
    }

    public EmployeeCorrelation globalTalentId(String globalTalentId) {
        this.globalTalentId = globalTalentId;
        return this;
    }

    /**
     * Get globalTalentId
     *
     * @return globalTalentId
     */


    @JsonProperty("globalTalentId")
    public String getGlobalTalentId() {
        return globalTalentId;
    }

    public void setGlobalTalentId(String globalTalentId) {
        this.globalTalentId = globalTalentId;
    }

    public EmployeeCorrelation employeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    /**
     * Get employeeNumber
     *
     * @return employeeNumber
     */


    @JsonProperty("employeeNumber")
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public EmployeeCorrelation owningEntity(OperatingCompany owningEntity) {
        this.owningEntity = owningEntity;
        return this;
    }

    /**
     * Get owningEntity
     *
     * @return owningEntity
     */


    @JsonProperty("owningEntity")
    public OperatingCompany getOwningEntity() {
        return owningEntity;
    }

    public void setOwningEntity(OperatingCompany owningEntity) {
        this.owningEntity = owningEntity;
    }

    public EmployeeCorrelation engagementType(EngagementTypeEnum engagementType) {
        this.engagementType = engagementType;
        return this;
    }

    /**
     * Get engagementType
     *
     * @return engagementType
     */


    @JsonProperty("engagementType")
    public EngagementTypeEnum getEngagementType() {
        return engagementType;
    }

    public void setEngagementType(EngagementTypeEnum engagementType) {
        this.engagementType = engagementType;
    }

    public EmployeeCorrelation relatedGlobalClientId(String relatedGlobalClientId) {
        this.relatedGlobalClientId = relatedGlobalClientId;
        return this;
    }

    /**
     * Get relatedGlobalClientId
     *
     * @return relatedGlobalClientId
     */


    @JsonProperty("relatedGlobalClientId")
    public String getRelatedGlobalClientId() {
        return relatedGlobalClientId;
    }

    public void setRelatedGlobalClientId(String relatedGlobalClientId) {
        this.relatedGlobalClientId = relatedGlobalClientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeCorrelation employeeCorrelation = (EmployeeCorrelation) o;
        return Objects.equals(this.globalTalentId, employeeCorrelation.globalTalentId) &&
                Objects.equals(this.employeeNumber, employeeCorrelation.employeeNumber) &&
                Objects.equals(this.owningEntity, employeeCorrelation.owningEntity) &&
                Objects.equals(this.engagementType, employeeCorrelation.engagementType) &&
                Objects.equals(this.relatedGlobalClientId, employeeCorrelation.relatedGlobalClientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalTalentId, employeeNumber, owningEntity, engagementType, relatedGlobalClientId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmployeeCorrelation {\n");
        sb.append("    globalTalentId: ").append(toIndentedString(globalTalentId)).append("\n");
        sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
        sb.append("    owningEntity: ").append(toIndentedString(owningEntity)).append("\n");
        sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
        sb.append("    relatedGlobalClientId: ").append(toIndentedString(relatedGlobalClientId)).append("\n");
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

