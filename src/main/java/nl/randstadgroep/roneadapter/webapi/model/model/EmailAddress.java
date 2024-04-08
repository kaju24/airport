package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * EmailAddress
 */


public class EmailAddress {

    private String email;

    private Boolean isPrimary = null;

    private Boolean isVerified = null;
    private UsageEnum usage = null;

    /**
     * Default constructor
     *
     * @deprecated Use {@link EmailAddress#EmailAddress(String)}
     */
    @Deprecated
    public EmailAddress() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EmailAddress(String email) {
        this.email = email;
    }

    public EmailAddress email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The email address.
     *
     * @return email
     */


    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmailAddress isPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Is this the primary email address for the profile.true/false. Default - Null
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

    public EmailAddress isVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Flag if the email address is verified
     *
     * @return isVerified
     */


    @JsonProperty("isVerified")
    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public EmailAddress usage(UsageEnum usage) {
        this.usage = usage;
        return this;
    }

    /**
     * The usage of this email address, e.g. PERSONAL.
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
        EmailAddress emailAddress = (EmailAddress) o;
        return Objects.equals(this.email, emailAddress.email) &&
                Objects.equals(this.isPrimary, emailAddress.isPrimary) &&
                Objects.equals(this.isVerified, emailAddress.isVerified) &&
                Objects.equals(this.usage, emailAddress.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, isPrimary, isVerified, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailAddress {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
        sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
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
     * The usage of this email address, e.g. PERSONAL.
     */
    public enum UsageEnum {
        PERSONAL("Personal"),

        SCHOOL("School"),

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

