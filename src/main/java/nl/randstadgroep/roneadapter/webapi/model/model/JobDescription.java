package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * JobDescription
 */


public class JobDescription {

    private String id;


    private List<Benefit> benefits;

    private String description;

    private String qualifications;

    private String responsibilities;
    private TypeEnum type;

    public JobDescription id(String id) {
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

    public JobDescription benefits(List<Benefit> benefits) {
        this.benefits = benefits;
        return this;
    }

    public JobDescription addBenefitsItem(Benefit benefitsItem) {
        if (this.benefits == null) {
            this.benefits = new ArrayList<>();
        }
        this.benefits.add(benefitsItem);
        return this;
    }

    /**
     * Get benefits
     *
     * @return benefits
     */


    @JsonProperty("benefits")
    public List<Benefit> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<Benefit> benefits) {
        this.benefits = benefits;
    }

    public JobDescription description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */


    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobDescription qualifications(String qualifications) {
        this.qualifications = qualifications;
        return this;
    }

    /**
     * Get qualifications
     *
     * @return qualifications
     */


    @JsonProperty("qualifications")
    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public JobDescription responsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
        return this;
    }

    /**
     * Get responsibilities
     *
     * @return responsibilities
     */


    @JsonProperty("responsibilities")
    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public JobDescription type(TypeEnum type) {
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
        JobDescription jobDescription = (JobDescription) o;
        return Objects.equals(this.id, jobDescription.id) &&
                Objects.equals(this.benefits, jobDescription.benefits) &&
                Objects.equals(this.description, jobDescription.description) &&
                Objects.equals(this.qualifications, jobDescription.qualifications) &&
                Objects.equals(this.responsibilities, jobDescription.responsibilities) &&
                Objects.equals(this.type, jobDescription.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, benefits, description, qualifications, responsibilities, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDescription {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
        sb.append("    responsibilities: ").append(toIndentedString(responsibilities)).append("\n");
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
        INTERNAL("Internal"),

        CLIENT("Client"),

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

