package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DossierType
 */


public enum DossierType {

    AVR("AVR"),

    BDF("BDF"),

    EPE("EPE"),

    PSG("PSG"),

    DCE("DCE"),

    BRT("BRT"),

    AOT("AOT");

    private final String value;

    DossierType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static DossierType fromValue(String value) {
        for (DossierType b : DossierType.values()) {
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

