package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Gender
 */


public enum Gender {

    MALE("MALE"),

    FEMALE("FEMALE"),

    NOT_SUPPORTED("NOT_SUPPORTED");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Gender fromValue(String value) {
        for (Gender b : Gender.values()) {
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

