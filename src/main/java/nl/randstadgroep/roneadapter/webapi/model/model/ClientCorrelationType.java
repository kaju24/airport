package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ClientCorrelationType
 */


public enum ClientCorrelationType {

    STANDARD("STANDARD"),

    SPECIAL_INVOICING_CREDIT("SPECIAL_INVOICING_CREDIT"),

    SPECIAL_INVOICING_DEBIT("SPECIAL_INVOICING_DEBIT"),

    LEGACY_WORKLOCATION_SETUP("LEGACY_WORKLOCATION_SETUP"),

    MSP_SETUP("MSP_SETUP"),

    DEPARTMENT("DEPARTMENT"),

    LEGACY_UNKNOWN("LEGACY_UNKNOWN");

    private final String value;

    ClientCorrelationType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static ClientCorrelationType fromValue(String value) {
        for (ClientCorrelationType b : ClientCorrelationType.values()) {
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

