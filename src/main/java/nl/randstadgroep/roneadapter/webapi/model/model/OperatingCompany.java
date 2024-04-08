package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OperatingCompany
 */


public enum OperatingCompany {

    RNL("RNL"),

    TTG("TTG"),

    YGN("YGN"),

    BMC("BMC"),

    RGN("RGN");

    private final String value;

    OperatingCompany(String value) {
        this.value = value;
    }

    @JsonCreator
    public static OperatingCompany fromValue(String value) {
        for (OperatingCompany b : OperatingCompany.values()) {
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

