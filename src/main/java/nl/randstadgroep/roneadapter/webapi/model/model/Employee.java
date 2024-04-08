package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Employee
 */


public class Employee {

    private EmployeeNummer employeeNummer;

    private OrganisatieNummerType unitNummer;

    private OrganisatieNummerType labelNummer;

    private OrganisatieNummerType groepwerkmaatschappijNummer;

    public Employee employeeNummer(EmployeeNummer employeeNummer) {
        this.employeeNummer = employeeNummer;
        return this;
    }

    /**
     * Get employeeNummer
     *
     * @return employeeNummer
     */


    @JsonProperty("employeeNummer")
    public EmployeeNummer getEmployeeNummer() {
        return employeeNummer;
    }

    public void setEmployeeNummer(EmployeeNummer employeeNummer) {
        this.employeeNummer = employeeNummer;
    }

    public Employee unitNummer(OrganisatieNummerType unitNummer) {
        this.unitNummer = unitNummer;
        return this;
    }

    /**
     * Get unitNummer
     *
     * @return unitNummer
     */


    @JsonProperty("unitNummer")
    public OrganisatieNummerType getUnitNummer() {
        return unitNummer;
    }

    public void setUnitNummer(OrganisatieNummerType unitNummer) {
        this.unitNummer = unitNummer;
    }

    public Employee labelNummer(OrganisatieNummerType labelNummer) {
        this.labelNummer = labelNummer;
        return this;
    }

    /**
     * Get labelNummer
     *
     * @return labelNummer
     */


    @JsonProperty("labelNummer")
    public OrganisatieNummerType getLabelNummer() {
        return labelNummer;
    }

    public void setLabelNummer(OrganisatieNummerType labelNummer) {
        this.labelNummer = labelNummer;
    }

    public Employee groepwerkmaatschappijNummer(OrganisatieNummerType groepwerkmaatschappijNummer) {
        this.groepwerkmaatschappijNummer = groepwerkmaatschappijNummer;
        return this;
    }

    /**
     * Get groepwerkmaatschappijNummer
     *
     * @return groepwerkmaatschappijNummer
     */


    @JsonProperty("groepwerkmaatschappijNummer")
    public OrganisatieNummerType getGroepwerkmaatschappijNummer() {
        return groepwerkmaatschappijNummer;
    }

    public void setGroepwerkmaatschappijNummer(OrganisatieNummerType groepwerkmaatschappijNummer) {
        this.groepwerkmaatschappijNummer = groepwerkmaatschappijNummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(this.employeeNummer, employee.employeeNummer) &&
                Objects.equals(this.unitNummer, employee.unitNummer) &&
                Objects.equals(this.labelNummer, employee.labelNummer) &&
                Objects.equals(this.groepwerkmaatschappijNummer, employee.groepwerkmaatschappijNummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNummer, unitNummer, labelNummer, groepwerkmaatschappijNummer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Employee {\n");
        sb.append("    employeeNummer: ").append(toIndentedString(employeeNummer)).append("\n");
        sb.append("    unitNummer: ").append(toIndentedString(unitNummer)).append("\n");
        sb.append("    labelNummer: ").append(toIndentedString(labelNummer)).append("\n");
        sb.append("    groepwerkmaatschappijNummer: ").append(toIndentedString(groepwerkmaatschappijNummer)).append("\n");
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

