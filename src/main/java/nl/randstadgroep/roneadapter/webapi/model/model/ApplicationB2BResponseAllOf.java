package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ApplicationB2BResponseAllOf
 */

@JsonTypeName("ApplicationB2BResponse_allOf")

public class ApplicationB2BResponseAllOf {

    private ApplicationB2B applicationB2B;

    public ApplicationB2BResponseAllOf applicationB2B(ApplicationB2B applicationB2B) {
        this.applicationB2B = applicationB2B;
        return this;
    }

    /**
     * Get applicationB2B
     *
     * @return applicationB2B
     */


    @JsonProperty("applicationB2B")
    public ApplicationB2B getApplicationB2B() {
        return applicationB2B;
    }

    public void setApplicationB2B(ApplicationB2B applicationB2B) {
        this.applicationB2B = applicationB2B;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationB2BResponseAllOf applicationB2BResponseAllOf = (ApplicationB2BResponseAllOf) o;
        return Objects.equals(this.applicationB2B, applicationB2BResponseAllOf.applicationB2B);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationB2B);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationB2BResponseAllOf {\n");
        sb.append("    applicationB2B: ").append(toIndentedString(applicationB2B)).append("\n");
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

