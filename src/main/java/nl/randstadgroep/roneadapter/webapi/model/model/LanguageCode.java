package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets LanguageCode
 */


public enum LanguageCode {

    EN("en"),

    PL("pl"),

    NL("nl"),

    NOT_SUPPORTED("Not supported");

    private final String value;

    LanguageCode(String value) {
        this.value = value;
    }

    @JsonCreator
    public static LanguageCode fromValue(String value) {
        for (LanguageCode b : LanguageCode.values()) {
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

