package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * JobTitle
 */


public class JobTitle {

    private CategoryEnum category;
    private TypeEnum type;
    private String title;
    private String id;
    private String rascoOccupationCode;

    public JobTitle category(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     *
     * @return category
     */


    @JsonProperty("category")
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public JobTitle type(TypeEnum type) {
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

    public JobTitle title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     */


    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JobTitle id(String id) {
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

    public JobTitle rascoOccupationCode(String rascoOccupationCode) {
        this.rascoOccupationCode = rascoOccupationCode;
        return this;
    }

    /**
     * Get rascoOccupationCode
     *
     * @return rascoOccupationCode
     */


    @JsonProperty("rascoOccupationCode")
    public String getRascoOccupationCode() {
        return rascoOccupationCode;
    }

    public void setRascoOccupationCode(String rascoOccupationCode) {
        this.rascoOccupationCode = rascoOccupationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobTitle jobTitle = (JobTitle) o;
        return Objects.equals(this.category, jobTitle.category) &&
                Objects.equals(this.type, jobTitle.type) &&
                Objects.equals(this.title, jobTitle.title) &&
                Objects.equals(this.id, jobTitle.id) &&
                Objects.equals(this.rascoOccupationCode, jobTitle.rascoOccupationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, type, title, id, rascoOccupationCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobTitle {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    rascoOccupationCode: ").append(toIndentedString(rascoOccupationCode)).append("\n");
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
     * Gets or Sets category
     */
    public enum CategoryEnum {
        ONET("ONET"),

        OSHA("OSHA"),

        RANDSTAD("Randstad"),

        ISCO("ISCO"),

        VALUE_UNSPECIFIED("Value unspecified");

        private final String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            for (CategoryEnum b : CategoryEnum.values()) {
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

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        INTERNAL("Internal"),

        CLIENT("Client"),

        NORMALIZED("Normalized");

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

