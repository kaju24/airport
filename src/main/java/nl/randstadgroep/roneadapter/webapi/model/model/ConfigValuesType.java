package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ConfigValuesType
 */


public enum ConfigValuesType {

    CLIENT_CORRELATION_TYPE("CLIENT_CORRELATION_TYPE"),

    CLIENT_CORRELATION_TYPE_LEGACY("CLIENT_CORRELATION_TYPE_LEGACY");

    private final String value;

    ConfigValuesType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static ConfigValuesType fromValue(String value) {
        for (ConfigValuesType b : ConfigValuesType.values()) {
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

