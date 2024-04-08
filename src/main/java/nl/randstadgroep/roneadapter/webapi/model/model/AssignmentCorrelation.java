package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AssignmentCorrelation
 */


public class AssignmentCorrelation {

    private String localPlacementId;

    private String globalAssignmentId;

    private String globalJobId;

    private EngagementTypeEnum engagementType;

    /**
     * Default constructor
     *
     * @deprecated Use {@link AssignmentCorrelation#AssignmentCorrelation(String, String, String)}
     */
    @Deprecated
    public AssignmentCorrelation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AssignmentCorrelation(String localPlacementId, String globalAssignmentId, String globalJobId) {
        this.localPlacementId = localPlacementId;
        this.globalAssignmentId = globalAssignmentId;
        this.globalJobId = globalJobId;
    }

    public AssignmentCorrelation localPlacementId(String localPlacementId) {
        this.localPlacementId = localPlacementId;
        return this;
    }

    /**
     * Get localPlacementId
     *
     * @return localPlacementId
     */


    @JsonProperty("localPlacementId")
    public String getLocalPlacementId() {
        return localPlacementId;
    }

    public void setLocalPlacementId(String localPlacementId) {
        this.localPlacementId = localPlacementId;
    }

    public AssignmentCorrelation globalAssignmentId(String globalAssignmentId) {
        this.globalAssignmentId = globalAssignmentId;
        return this;
    }

    /**
     * Get globalAssignmentId
     *
     * @return globalAssignmentId
     */


    @JsonProperty("globalAssignmentId")
    public String getGlobalAssignmentId() {
        return globalAssignmentId;
    }

    public void setGlobalAssignmentId(String globalAssignmentId) {
        this.globalAssignmentId = globalAssignmentId;
    }

    public AssignmentCorrelation globalJobId(String globalJobId) {
        this.globalJobId = globalJobId;
        return this;
    }

    /**
     * Get globalJobId
     *
     * @return globalJobId
     */


    @JsonProperty("globalJobId")
    public String getGlobalJobId() {
        return globalJobId;
    }

    public void setGlobalJobId(String globalJobId) {
        this.globalJobId = globalJobId;
    }

    public AssignmentCorrelation engagementType(EngagementTypeEnum engagementType) {
        this.engagementType = engagementType;
        return this;
    }

    /**
     * Get engagementType
     *
     * @return engagementType
     */


    @JsonProperty("engagementType")
    public EngagementTypeEnum getEngagementType() {
        return engagementType;
    }

    public void setEngagementType(EngagementTypeEnum engagementType) {
        this.engagementType = engagementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignmentCorrelation assignmentCorrelation = (AssignmentCorrelation) o;
        return Objects.equals(this.localPlacementId, assignmentCorrelation.localPlacementId) &&
                Objects.equals(this.globalAssignmentId, assignmentCorrelation.globalAssignmentId) &&
                Objects.equals(this.globalJobId, assignmentCorrelation.globalJobId) &&
                Objects.equals(this.engagementType, assignmentCorrelation.engagementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localPlacementId, globalAssignmentId, globalJobId, engagementType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignmentCorrelation {\n");
        sb.append("    localPlacementId: ").append(toIndentedString(localPlacementId)).append("\n");
        sb.append("    globalAssignmentId: ").append(toIndentedString(globalAssignmentId)).append("\n");
        sb.append("    globalJobId: ").append(toIndentedString(globalJobId)).append("\n");
        sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
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

