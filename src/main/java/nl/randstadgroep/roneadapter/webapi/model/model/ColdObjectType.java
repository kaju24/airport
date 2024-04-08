package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ColdObjectType
 */


public enum ColdObjectType {

    ASSIGNMENT("ASSIGNMENT"),

    CLIENT_CONTACT("CLIENT_CONTACT"),

    CLIENT_ORG("CLIENT_ORG"),

    TALENT("TALENT"),

    JOB_LEAD("JOB_LEAD");

    private final String value;

    ColdObjectType(String value) {
        this.value = value;
    }

    @JsonCreator
    public static ColdObjectType fromValue(String value) {
        for (ColdObjectType b : ColdObjectType.values()) {
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

