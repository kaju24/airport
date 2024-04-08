package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TalentGrouping
 */


public class TalentGrouping {

    private String processId;

    private String employeeNumber;

    private String newGlobalTalentId;

    /**
     * Default constructor
     *
     * @deprecated Use {@link TalentGrouping#TalentGrouping(String, String, String)}
     */
    @Deprecated
    public TalentGrouping() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TalentGrouping(String processId, String employeeNumber, String newGlobalTalentId) {
        this.processId = processId;
        this.employeeNumber = employeeNumber;
        this.newGlobalTalentId = newGlobalTalentId;
    }

    public TalentGrouping processId(String processId) {
        this.processId = processId;
        return this;
    }

    /**
     * Get processId
     *
     * @return processId
     */


    @JsonProperty("processId")
    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public TalentGrouping employeeNumber(String employeeNumber) {
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

    public TalentGrouping newGlobalTalentId(String newGlobalTalentId) {
        this.newGlobalTalentId = newGlobalTalentId;
        return this;
    }

    /**
     * Get newGlobalTalentId
     *
     * @return newGlobalTalentId
     */


    @JsonProperty("newGlobalTalentId")
    public String getNewGlobalTalentId() {
        return newGlobalTalentId;
    }

    public void setNewGlobalTalentId(String newGlobalTalentId) {
        this.newGlobalTalentId = newGlobalTalentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TalentGrouping talentGrouping = (TalentGrouping) o;
        return Objects.equals(this.processId, talentGrouping.processId) &&
                Objects.equals(this.employeeNumber, talentGrouping.employeeNumber) &&
                Objects.equals(this.newGlobalTalentId, talentGrouping.newGlobalTalentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processId, employeeNumber, newGlobalTalentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TalentGrouping {\n");
        sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
        sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
        sb.append("    newGlobalTalentId: ").append(toIndentedString(newGlobalTalentId)).append("\n");
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

