package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets JobLanguageCode
 */


public enum JobLanguageCode {

    EN_US("en-US"),

    EN_GB("en-GB"),

    PL_PL("pl-PL"),

    NL_BE("nl-BE"),

    NL_NL("nl-NL"),

    VALUE_UNSPECIFIED("Value unspecified"),

    NOT_SUPPORTED("Not supported");

    private final String value;

    JobLanguageCode(String value) {
        this.value = value;
    }

    @JsonCreator
    public static JobLanguageCode fromValue(String value) {
        for (JobLanguageCode b : JobLanguageCode.values()) {
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

