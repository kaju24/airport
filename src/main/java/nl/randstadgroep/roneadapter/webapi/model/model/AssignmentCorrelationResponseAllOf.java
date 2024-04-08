package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * AssignmentCorrelationResponseAllOf
 */

@JsonTypeName("AssignmentCorrelationResponse_allOf")

public class AssignmentCorrelationResponseAllOf {

    private AssignmentCorrelation globalAssignment;

    public AssignmentCorrelationResponseAllOf globalAssignment(AssignmentCorrelation globalAssignment) {
        this.globalAssignment = globalAssignment;
        return this;
    }

    /**
     * Get globalAssignment
     *
     * @return globalAssignment
     */


    @JsonProperty("globalAssignment")
    public AssignmentCorrelation getGlobalAssignment() {
        return globalAssignment;
    }

    public void setGlobalAssignment(AssignmentCorrelation globalAssignment) {
        this.globalAssignment = globalAssignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignmentCorrelationResponseAllOf assignmentCorrelationResponseAllOf = (AssignmentCorrelationResponseAllOf) o;
        return Objects.equals(this.globalAssignment, assignmentCorrelationResponseAllOf.globalAssignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalAssignment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignmentCorrelationResponseAllOf {\n");
        sb.append("    globalAssignment: ").append(toIndentedString(globalAssignment)).append("\n");
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

