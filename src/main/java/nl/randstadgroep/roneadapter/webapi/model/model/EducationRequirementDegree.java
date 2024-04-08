package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EducationRequirementDegree
 */

@JsonTypeName("EducationRequirement_degree")

public class EducationRequirementDegree {


    private List<String> fieldsOfStudy;
    private TypeEnum type;

    public EducationRequirementDegree fieldsOfStudy(List<String> fieldsOfStudy) {
        this.fieldsOfStudy = fieldsOfStudy;
        return this;
    }

    public EducationRequirementDegree addFieldsOfStudyItem(String fieldsOfStudyItem) {
        if (this.fieldsOfStudy == null) {
            this.fieldsOfStudy = new ArrayList<>();
        }
        this.fieldsOfStudy.add(fieldsOfStudyItem);
        return this;
    }

    /**
     * Get fieldsOfStudy
     *
     * @return fieldsOfStudy
     */


    @JsonProperty("fieldsOfStudy")
    public List<String> getFieldsOfStudy() {
        return fieldsOfStudy;
    }

    public void setFieldsOfStudy(List<String> fieldsOfStudy) {
        this.fieldsOfStudy = fieldsOfStudy;
    }

    public EducationRequirementDegree type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */


    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EducationRequirementDegree educationRequirementDegree = (EducationRequirementDegree) o;
        return Objects.equals(this.fieldsOfStudy, educationRequirementDegree.fieldsOfStudy) &&
                Objects.equals(this.type, educationRequirementDegree.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldsOfStudy, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EducationRequirementDegree {\n");
        sb.append("    fieldsOfStudy: ").append(toIndentedString(fieldsOfStudy)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        POST_SECONDARY_NON_TERTIARY_EDUCATION("Post-secondary non-tertiary education"),

        SHORT_CYCLE_TERTIARY_EDUCATION("Short-cycle tertiary education"),

        PRIMARY_EDUCATION("Primary education"),

        LOWER_SECONDARY_EDUCATION("Lower secondary education"),

        UPPER_SECONDARY_EDUCATION("Upper secondary education"),

        BACHELORS_OR_EQUIVALENT("Bachelors or equivalent"),

        MASTERS_OR_EQUIVALENT("Masters or equivalent"),

        DOCTORAL_OR_EQUIVALENT("Doctoral or equivalent"),

        VALUE_UNSPECIFIED("Value unspecified");

        private final String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

