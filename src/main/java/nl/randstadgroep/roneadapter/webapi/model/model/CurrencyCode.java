package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CurrencyCode
 */


public enum CurrencyCode {

    EUR("EUR"),

    USD("USD"),

    VALUE_UNSPECIFIED("VALUE_UNSPECIFIED"),

    NOT_SUPPORTED("NOT_SUPPORTED");

    private final String value;

    CurrencyCode(String value) {
        this.value = value;
    }

    @JsonCreator
    public static CurrencyCode fromValue(String value) {
        for (CurrencyCode b : CurrencyCode.values()) {
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

