package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BesDataTalentGrouping
 */


public class BesDataTalentGrouping implements BesData {

    private String processId;

    private String employeeNumber;

    private String newTalentId;

    public BesDataTalentGrouping processId(String processId) {
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

    public BesDataTalentGrouping employeeNumber(String employeeNumber) {
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

    public BesDataTalentGrouping newTalentId(String newTalentId) {
        this.newTalentId = newTalentId;
        return this;
    }

    /**
     * Get newTalentId
     *
     * @return newTalentId
     */


    @JsonProperty("newTalentId")
    public String getNewTalentId() {
        return newTalentId;
    }

    public void setNewTalentId(String newTalentId) {
        this.newTalentId = newTalentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BesDataTalentGrouping besDataTalentGrouping = (BesDataTalentGrouping) o;
        return Objects.equals(this.processId, besDataTalentGrouping.processId) &&
                Objects.equals(this.employeeNumber, besDataTalentGrouping.employeeNumber) &&
                Objects.equals(this.newTalentId, besDataTalentGrouping.newTalentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processId, employeeNumber, newTalentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BesDataTalentGrouping {\n");
        sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
        sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
        sb.append("    newTalentId: ").append(toIndentedString(newTalentId)).append("\n");
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

