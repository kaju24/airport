package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CommuteMethod
 */


public enum CommuteMethod {

    CYCLING("CYCLING"),

    DRIVING("DRIVING"),

    TRANSIT("TRANSIT"),

    WALKING("WALKING"),

    VALUE_UNSPECIFIED("VALUE_UNSPECIFIED"),

    NOT_SUPPORTED("NOT_SUPPORTED");

    private final String value;

    CommuteMethod(String value) {
        this.value = value;
    }

    @JsonCreator
    public static CommuteMethod fromValue(String value) {
        for (CommuteMethod b : CommuteMethod.values()) {
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

