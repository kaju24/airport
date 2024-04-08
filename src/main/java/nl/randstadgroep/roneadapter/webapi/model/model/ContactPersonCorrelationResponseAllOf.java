package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ContactPersonCorrelationResponseAllOf
 */

@JsonTypeName("ContactPersonCorrelationResponse_allOf")

public class ContactPersonCorrelationResponseAllOf {

    private ContactPersonCorrelation globalContactPerson;

    public ContactPersonCorrelationResponseAllOf globalContactPerson(ContactPersonCorrelation globalContactPerson) {
        this.globalContactPerson = globalContactPerson;
        return this;
    }

    /**
     * Get globalContactPerson
     *
     * @return globalContactPerson
     */


    @JsonProperty("globalContactPerson")
    public ContactPersonCorrelation getGlobalContactPerson() {
        return globalContactPerson;
    }

    public void setGlobalContactPerson(ContactPersonCorrelation globalContactPerson) {
        this.globalContactPerson = globalContactPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactPersonCorrelationResponseAllOf contactPersonCorrelationResponseAllOf = (ContactPersonCorrelationResponseAllOf) o;
        return Objects.equals(this.globalContactPerson, contactPersonCorrelationResponseAllOf.globalContactPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalContactPerson);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactPersonCorrelationResponseAllOf {\n");
        sb.append("    globalContactPerson: ").append(toIndentedString(globalContactPerson)).append("\n");
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

