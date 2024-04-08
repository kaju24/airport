package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CorrelationType
 */


public enum CorrelationType {

    JOBPOSTING("JOBPOSTING");

    private final String value;

    CorrelationType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static CorrelationType fromValue(String value) {
        for (CorrelationType b : CorrelationType.values()) {
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

