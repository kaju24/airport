package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BatchState
 */


public enum BatchState {

    NEW("NEW"),

    COMPLETED("COMPLETED"),

    STARTING("STARTING"),

    STARTED("STARTED"),

    STOPPING("STOPPING"),

    STOPPED("STOPPED"),

    FAILED("FAILED"),

    ABANDONED("ABANDONED"),

    UNKNOWN("UNKNOWN");

    private final String value;

    BatchState(String value) {
        this.value = value;
    }

    @JsonCreator
    public static BatchState fromValue(String value) {
        for (BatchState b : BatchState.values()) {
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

