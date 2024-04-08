package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Importance
 */


public enum Importance {

    REQUIRED("Required"),

    PREFERRED("Preferred"),

    NOT_REQUIRED("Not required"),

    VALUE_UNSPECIFIED("Value unspecified"),

    NOT_SUPPORTED("Not supported");

    private final String value;

    Importance(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Importance fromValue(String value) {
        for (Importance b : Importance.values()) {
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

