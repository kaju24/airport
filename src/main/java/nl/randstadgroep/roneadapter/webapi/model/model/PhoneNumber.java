package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * PhoneNumber
 */


public class PhoneNumber {

    private String extension = null;

    private Boolean isActive = null;

    private Boolean isPrimary = null;

    private String number;
    private TypeEnum type = null;
    private UsageEnum usage = null;

    /**
     * Default constructor
     *
     * @deprecated Use {@link PhoneNumber#PhoneNumber(String)}
     */
    @Deprecated
    public PhoneNumber() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PhoneNumber(String number) {
        this.number = number;
    }

    public PhoneNumber extension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Extension used for the particular number
     *
     * @return extension
     */


    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public PhoneNumber isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Flag if the phone number is active
     *
     * @return isActive
     */


    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public PhoneNumber isPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Is this the primary phone number for the profile. true/false. Default - Null
     *
     * @return isPrimary
     */


    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public PhoneNumber number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Phone number.
     *
     * @return number
     */


    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneNumber type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of number this represents. e.g. Fax, landline, mobile, pager etc
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

    public PhoneNumber usage(UsageEnum usage) {
        this.usage = usage;
        return this;
    }

    /**
     * The usage of this phone number, e.g. PERSONAL.
     *
     * @return usage
     */


    @JsonProperty("usage")
    public UsageEnum getUsage() {
        return usage;
    }

    public void setUsage(UsageEnum usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) o;
        return Objects.equals(this.extension, phoneNumber.extension) &&
                Objects.equals(this.isActive, phoneNumber.isActive) &&
                Objects.equals(this.isPrimary, phoneNumber.isPrimary) &&
                Objects.equals(this.number, phoneNumber.number) &&
                Objects.equals(this.type, phoneNumber.type) &&
                Objects.equals(this.usage, phoneNumber.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extension, isActive, isPrimary, number, type, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneNumber {\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
     * The type of number this represents. e.g. Fax, landline, mobile, pager etc
     */
    public enum TypeEnum {
        FAX("Fax"),

        LANDLINE("Landline"),

        MOBILE("Mobile"),

        PAGER("Pager"),

        TDD("TDD"),

        TT("TT"),

        TTY("TTY"),

        VALUE_UNSPECIFIED("Value unspecified"),

        VIRTUAL("Virtual"),

        VOICEMAIL("Voicemail"),

        VOIP("Voip");

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
            return null;
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
     * The usage of this phone number, e.g. PERSONAL.
     */
    public enum UsageEnum {
        PERSONAL("Personal"),

        VALUE_UNSPECIFIED("Value unspecified"),

        WORK("Work");

        private final String value;

        UsageEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static UsageEnum fromValue(String value) {
            for (UsageEnum b : UsageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
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

