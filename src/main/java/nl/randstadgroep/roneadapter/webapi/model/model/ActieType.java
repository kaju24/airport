package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ActieType
 */


public enum ActieType {

    INS("INS"),

    UPD("UPD"),

    DEL("DEL");

    private final String value;

    ActieType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static ActieType fromValue(String value) {
        for (ActieType b : ActieType.values()) {
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

