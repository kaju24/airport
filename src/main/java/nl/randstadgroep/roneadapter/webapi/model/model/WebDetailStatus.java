package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets WebDetailStatus
 */


public enum WebDetailStatus {

    UNPUBLISHED("Unpublished"),

    UNPUBLISHED_MANUAL("UnpublishedManual"),

    UNPUBLISHED_MAX("UnpublishedMax"),

    UNPUBLISHED_DATE("UnpublishedDate"),

    PUBLISHED("Published"),

    ARCHIVED("Archived"),

    NOT_SUPPORTED("Not supported");

    private final String value;

    WebDetailStatus(String value) {
        this.value = value;
    }

    @JsonCreator
    public static WebDetailStatus fromValue(String value) {
        for (WebDetailStatus b : WebDetailStatus.values()) {
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

