package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets JobStatus
 */


public enum JobStatus {

    CLOSED("CLOSED"),

    FULFILLED("FULFILLED"),

    NEW("NEW"),

    ON_HOLD("ON_HOLD"),

    OPEN("OPEN"),

    VALIDATED("VALIDATED"),

    NOT_SUPPORTED("NOT_SUPPORTED");

    private final String value;

    JobStatus(String value) {
        this.value = value;
    }

    @JsonCreator
    public static JobStatus fromValue(String value) {
        for (JobStatus b : JobStatus.values()) {
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

