package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AddressType
 */


public enum AddressType {

    MAILING("MAILING"),

    PERSONAL("PERSONAL"),

    SCHOOL("SCHOOL"),

    WORK("WORK"),

    VALUE_UNSPECIFIED("VALUE_UNSPECIFIED"),

    NOT_SUPPORTED("NOT_SUPPORTED");

    private final String value;

    AddressType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static AddressType fromValue(String value) {
        for (AddressType b : AddressType.values()) {
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

