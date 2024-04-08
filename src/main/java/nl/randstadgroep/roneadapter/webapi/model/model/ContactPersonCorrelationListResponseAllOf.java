package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ContactPersonCorrelationListResponseAllOf
 */

@JsonTypeName("ContactPersonCorrelationListResponse_allOf")

public class ContactPersonCorrelationListResponseAllOf {


    private List<ContactPersonCorrelation> globalContactPersons;

    public ContactPersonCorrelationListResponseAllOf globalContactPersons(List<ContactPersonCorrelation> globalContactPersons) {
        this.globalContactPersons = globalContactPersons;
        return this;
    }

    public ContactPersonCorrelationListResponseAllOf addGlobalContactPersonsItem(ContactPersonCorrelation globalContactPersonsItem) {
        if (this.globalContactPersons == null) {
            this.globalContactPersons = new ArrayList<>();
        }
        this.globalContactPersons.add(globalContactPersonsItem);
        return this;
    }

    /**
     * Get globalContactPersons
     *
     * @return globalContactPersons
     */


    @JsonProperty("globalContactPersons")
    public List<ContactPersonCorrelation> getGlobalContactPersons() {
        return globalContactPersons;
    }

    public void setGlobalContactPersons(List<ContactPersonCorrelation> globalContactPersons) {
        this.globalContactPersons = globalContactPersons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactPersonCorrelationListResponseAllOf contactPersonCorrelationListResponseAllOf = (ContactPersonCorrelationListResponseAllOf) o;
        return Objects.equals(this.globalContactPersons, contactPersonCorrelationListResponseAllOf.globalContactPersons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalContactPersons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactPersonCorrelationListResponseAllOf {\n");
        sb.append("    globalContactPersons: ").append(toIndentedString(globalContactPersons)).append("\n");
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

