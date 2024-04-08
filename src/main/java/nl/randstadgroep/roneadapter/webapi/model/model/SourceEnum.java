package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets SourceEnum
 */


public enum SourceEnum {

    EVENT_OR_JOB_FAIR("Event or job fair"),

    REFERRAL("Referral"),

    DIRECT_MOBILE_APP("Direct mobile app"),

    DIRECT_MOBILE_WEB("Direct mobile web"),

    DIRECT_WEB("Direct web"),

    RECRUITER_SOURCED("Recruiter sourced"),

    SEARCH_AND_MATCH("Search and match"),

    MARKETING_CAMPAIGN("Marketing campaign"),

    WEB_SEARCH("Web search"),

    PROFESSIONAL_ASSOCIATION_OR_ORG("Professional association or org"),

    NON_JOB_BOARD_AD("Non-job board ad"),

    SOCIAL_MEDIA_NETWORKING("Social media networking"),

    RECRUITER_MARKETING_EMAIL("Recruiter marketing email"),

    RECRUITING_PARTNERS_DIVISIONS("Recruiting partners/divisions"),

    REFERENCE_CHECK("Reference check"),

    VIA_CLIENT("Via client"),

    AVE("AVE"),

    VALUE_UNSPECIFIED("Value unspecified"),

    NOT_SUPPORTED("Not supported");

    private final String value;

    SourceEnum(String value) {
        this.value = value;
    }

    @JsonCreator
    public static SourceEnum fromValue(String value) {
        for (SourceEnum b : SourceEnum.values()) {
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

