package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EmployeeNummer
 */


public class EmployeeNummer {

    private String value;

    private String epeId;

    private String esaId;

    public EmployeeNummer value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */


    @JsonProperty("_value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EmployeeNummer epeId(String epeId) {
        this.epeId = epeId;
        return this;
    }

    /**
     * Get epeId
     *
     * @return epeId
     */


    @JsonProperty("epeId")
    public String getEpeId() {
        return epeId;
    }

    public void setEpeId(String epeId) {
        this.epeId = epeId;
    }

    public EmployeeNummer esaId(String esaId) {
        this.esaId = esaId;
        return this;
    }

    /**
     * Get esaId
     *
     * @return esaId
     */


    @JsonProperty("esaId")
    public String getEsaId() {
        return esaId;
    }

    public void setEsaId(String esaId) {
        this.esaId = esaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeNummer employeeNummer = (EmployeeNummer) o;
        return Objects.equals(this.value, employeeNummer.value) &&
                Objects.equals(this.epeId, employeeNummer.epeId) &&
                Objects.equals(this.esaId, employeeNummer.esaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, epeId, esaId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmployeeNummer {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    epeId: ").append(toIndentedString(epeId)).append("\n");
        sb.append("    esaId: ").append(toIndentedString(esaId)).append("\n");
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

