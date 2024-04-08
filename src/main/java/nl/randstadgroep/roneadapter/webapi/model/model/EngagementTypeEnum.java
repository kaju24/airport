package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EngagementTypeEnum
 */


public enum EngagementTypeEnum {

    AFFILIATE_VENDOR_EMPLOYEE("AFFILIATE_VENDOR_EMPLOYEE"),

    INDEPENDENT_CONTRACTOR_COMPANY("INDEPENDENT_CONTRACTOR_COMPANY"),

    INDEPENDENT_CONTRACTOR_NO_COMPANY("INDEPENDENT_CONTRACTOR_NO_COMPANY"),

    INTERNAL("INTERNAL"),

    VALUE_UNSPECIFIED("VALUE_UNSPECIFIED"),

    NOT_SUPPORTED("NOT_SUPPORTED");

    private final String value;

    EngagementTypeEnum(String value) {
        this.value = value;
    }

    @JsonCreator
    public static EngagementTypeEnum fromValue(String value) {
        for (EngagementTypeEnum b : EngagementTypeEnum.values()) {
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

