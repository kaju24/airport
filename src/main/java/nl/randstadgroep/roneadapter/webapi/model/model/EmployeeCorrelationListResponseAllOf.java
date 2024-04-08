package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployeeCorrelationListResponseAllOf
 */

@JsonTypeName("EmployeeCorrelationListResponse_allOf")

public class EmployeeCorrelationListResponseAllOf {


    private List<EmployeeCorrelation> globalEmployees;

    public EmployeeCorrelationListResponseAllOf globalEmployees(List<EmployeeCorrelation> globalEmployees) {
        this.globalEmployees = globalEmployees;
        return this;
    }

    public EmployeeCorrelationListResponseAllOf addGlobalEmployeesItem(EmployeeCorrelation globalEmployeesItem) {
        if (this.globalEmployees == null) {
            this.globalEmployees = new ArrayList<>();
        }
        this.globalEmployees.add(globalEmployeesItem);
        return this;
    }

    /**
     * Get globalEmployees
     *
     * @return globalEmployees
     */


    @JsonProperty("globalEmployees")
    public List<EmployeeCorrelation> getGlobalEmployees() {
        return globalEmployees;
    }

    public void setGlobalEmployees(List<EmployeeCorrelation> globalEmployees) {
        this.globalEmployees = globalEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeCorrelationListResponseAllOf employeeCorrelationListResponseAllOf = (EmployeeCorrelationListResponseAllOf) o;
        return Objects.equals(this.globalEmployees, employeeCorrelationListResponseAllOf.globalEmployees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEmployees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmployeeCorrelationListResponseAllOf {\n");
        sb.append("    globalEmployees: ").append(toIndentedString(globalEmployees)).append("\n");
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

