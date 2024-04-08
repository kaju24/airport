package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EducationRequirement
 */


public class EducationRequirement {

    private String id;

    private EducationRequirementDegree degree;

    private Importance importance;

    public EducationRequirement id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */


    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EducationRequirement degree(EducationRequirementDegree degree) {
        this.degree = degree;
        return this;
    }

    /**
     * Get degree
     *
     * @return degree
     */


    @JsonProperty("degree")
    public EducationRequirementDegree getDegree() {
        return degree;
    }

    public void setDegree(EducationRequirementDegree degree) {
        this.degree = degree;
    }

    public EducationRequirement importance(Importance importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get importance
     *
     * @return importance
     */


    @JsonProperty("importance")
    public Importance getImportance() {
        return importance;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EducationRequirement educationRequirement = (EducationRequirement) o;
        return Objects.equals(this.id, educationRequirement.id) &&
                Objects.equals(this.degree, educationRequirement.degree) &&
                Objects.equals(this.importance, educationRequirement.importance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, degree, importance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EducationRequirement {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
        sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
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

