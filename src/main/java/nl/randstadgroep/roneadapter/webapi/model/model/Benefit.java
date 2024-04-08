package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * Benefit
 */


public class Benefit {

    private String context;
    private TypeEnum type;

    public Benefit context(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     *
     * @return context
     */


    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Benefit type(TypeEnum type) {
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
        Benefit benefit = (Benefit) o;
        return Objects.equals(this.context, benefit.context) &&
                Objects.equals(this.type, benefit.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Benefit {\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
        CHILD_CARE("Child care"),

        DENTAL("Dental"),

        DOMESTIC_PARTNER("Domestic partner"),

        FLEXIBLE_HOURS("Flexible hours"),

        LIFE_INSURANCE("Life insurance"),

        MEDICAL("Medical"),

        PARENTAL_LEAVE("Parental leave"),

        RETIREMENT_PLAN("Retirement plan"),

        SICK_DAYS("Sick days"),

        VACATION("Vacation"),

        VISION("Vision"),

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

