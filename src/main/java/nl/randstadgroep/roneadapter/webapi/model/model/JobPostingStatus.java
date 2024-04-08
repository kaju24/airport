package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets JobPostingStatus
 */


public enum JobPostingStatus {

    DRAFT("Draft"),

    UNPUBLISHED_MANUAL("UnpublishedManual"),

    UNPUBLISHED_MAX("UnpublishedMax"),

    UNPUBLISHED_DATE("UnpublishedDate"),

    PUBLISHED("Published"),

    ARCHIVED("Archived"),

    NOT_SUPPORTED("Not supported");

    private final String value;

    JobPostingStatus(String value) {
        this.value = value;
    }

    @JsonCreator
    public static JobPostingStatus fromValue(String value) {
        for (JobPostingStatus b : JobPostingStatus.values()) {
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

