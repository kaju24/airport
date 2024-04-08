package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployeeCorrelationResponseAllOf
 */

@JsonTypeName("EmployeeCorrelationResponse_allOf")

public class EmployeeCorrelationResponseAllOf {


    private List<String> employeeNumbers;

    private String globalTalentId;

    public EmployeeCorrelationResponseAllOf employeeNumbers(List<String> employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
        return this;
    }

    public EmployeeCorrelationResponseAllOf addEmployeeNumbersItem(String employeeNumbersItem) {
        if (this.employeeNumbers == null) {
            this.employeeNumbers = new ArrayList<>();
        }
        this.employeeNumbers.add(employeeNumbersItem);
        return this;
    }

    /**
     * Get employeeNumbers
     *
     * @return employeeNumbers
     */


    @JsonProperty("employeeNumbers")
    public List<String> getEmployeeNumbers() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(List<String> employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
    }

    public EmployeeCorrelationResponseAllOf globalTalentId(String globalTalentId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeCorrelationResponseAllOf employeeCorrelationResponseAllOf = (EmployeeCorrelationResponseAllOf) o;
        return Objects.equals(this.employeeNumbers, employeeCorrelationResponseAllOf.employeeNumbers) &&
                Objects.equals(this.globalTalentId, employeeCorrelationResponseAllOf.globalTalentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumbers, globalTalentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmployeeCorrelationResponseAllOf {\n");
        sb.append("    employeeNumbers: ").append(toIndentedString(employeeNumbers)).append("\n");
        sb.append("    globalTalentId: ").append(toIndentedString(globalTalentId)).append("\n");
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

