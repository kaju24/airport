package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AssignmentCorrelationListResponseAllOf
 */

@JsonTypeName("AssignmentCorrelationListResponse_allOf")

public class AssignmentCorrelationListResponseAllOf {


    private List<AssignmentCorrelation> globalAssignments;

    public AssignmentCorrelationListResponseAllOf globalAssignments(List<AssignmentCorrelation> globalAssignments) {
        this.globalAssignments = globalAssignments;
        return this;
    }

    public AssignmentCorrelationListResponseAllOf addGlobalAssignmentsItem(AssignmentCorrelation globalAssignmentsItem) {
        if (this.globalAssignments == null) {
            this.globalAssignments = new ArrayList<>();
        }
        this.globalAssignments.add(globalAssignmentsItem);
        return this;
    }

    /**
     * Get globalAssignments
     *
     * @return globalAssignments
     */


    @JsonProperty("globalAssignments")
    public List<AssignmentCorrelation> getGlobalAssignments() {
        return globalAssignments;
    }

    public void setGlobalAssignments(List<AssignmentCorrelation> globalAssignments) {
        this.globalAssignments = globalAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignmentCorrelationListResponseAllOf assignmentCorrelationListResponseAllOf = (AssignmentCorrelationListResponseAllOf) o;
        return Objects.equals(this.globalAssignments, assignmentCorrelationListResponseAllOf.globalAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalAssignments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignmentCorrelationListResponseAllOf {\n");
        sb.append("    globalAssignments: ").append(toIndentedString(globalAssignments)).append("\n");
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

