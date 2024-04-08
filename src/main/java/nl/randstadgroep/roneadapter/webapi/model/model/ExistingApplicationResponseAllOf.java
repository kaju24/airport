package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ExistingApplicationResponseAllOf
 */

@JsonTypeName("ExistingApplicationResponse_allOf")

public class ExistingApplicationResponseAllOf {

    private ExistingApplication existingApplication;

    public ExistingApplicationResponseAllOf existingApplication(ExistingApplication existingApplication) {
        this.existingApplication = existingApplication;
        return this;
    }

    /**
     * Get existingApplication
     *
     * @return existingApplication
     */


    @JsonProperty("existingApplication")
    public ExistingApplication getExistingApplication() {
        return existingApplication;
    }

    public void setExistingApplication(ExistingApplication existingApplication) {
        this.existingApplication = existingApplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExistingApplicationResponseAllOf existingApplicationResponseAllOf = (ExistingApplicationResponseAllOf) o;
        return Objects.equals(this.existingApplication, existingApplicationResponseAllOf.existingApplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(existingApplication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExistingApplicationResponseAllOf {\n");
        sb.append("    existingApplication: ").append(toIndentedString(existingApplication)).append("\n");
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

