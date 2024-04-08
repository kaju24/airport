package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EntityName
 */


public enum EntityName {

    GLOBAL_ASSIGNMENT_CORRELATION("GLOBAL_ASSIGNMENT_CORRELATION"),

    GLOBAL_CLIENT_CORRELATION("GLOBAL_CLIENT_CORRELATION"),

    GLOBAL_COMPETITOR_CORRELATION("GLOBAL_COMPETITOR_CORRELATION"),

    GLOBAL_CONTACT_PERSON_CORRELATION("GLOBAL_CONTACT_PERSON_CORRELATION"),

    GLOBAL_CUSTOM_CONTRACT_CORRELATION("GLOBAL_CUSTOM_CONTRACT_CORRELATION"),

    GLOBAL_JOB_POSTING_CORRELATION("GLOBAL_JOB_POSTING_CORRELATION"),

    GLOBAL_TALENT_CORRELATION("GLOBAL_TALENT_CORRELATION"),

    GLOBAL_TALENT_GROUP("GLOBAL_TALENT_GROUP");

    private final String value;

    EntityName(String value) {
        this.value = value;
    }

    @JsonCreator
    public static EntityName fromValue(String value) {
        for (EntityName b : EntityName.values()) {
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

