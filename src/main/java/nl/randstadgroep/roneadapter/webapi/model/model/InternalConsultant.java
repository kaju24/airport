package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * InternalConsultant
 */


public class InternalConsultant {

    private String consultantId;
    private ResponsibilityEnum responsibility;
    private String id;
    private String orgUnitId;

    public InternalConsultant consultantId(String consultantId) {
        this.consultantId = consultantId;
        return this;
    }

    /**
     * Get consultantId
     *
     * @return consultantId
     */


    @JsonProperty("consultantId")
    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public InternalConsultant responsibility(ResponsibilityEnum responsibility) {
        this.responsibility = responsibility;
        return this;
    }

    /**
     * Get responsibility
     *
     * @return responsibility
     */


    @JsonProperty("responsibility")
    public ResponsibilityEnum getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(ResponsibilityEnum responsibility) {
        this.responsibility = responsibility;
    }

    public InternalConsultant id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */


    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InternalConsultant orgUnitId(String orgUnitId) {
        this.orgUnitId = orgUnitId;
        return this;
    }

    /**
     * Get orgUnitId
     *
     * @return orgUnitId
     */


    @JsonProperty("orgUnitId")
    public String getOrgUnitId() {
        return orgUnitId;
    }

    public void setOrgUnitId(String orgUnitId) {
        this.orgUnitId = orgUnitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InternalConsultant internalConsultant = (InternalConsultant) o;
        return Objects.equals(this.consultantId, internalConsultant.consultantId) &&
                Objects.equals(this.responsibility, internalConsultant.responsibility) &&
                Objects.equals(this.id, internalConsultant.id) &&
                Objects.equals(this.orgUnitId, internalConsultant.orgUnitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consultantId, responsibility, id, orgUnitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InternalConsultant {\n");
        sb.append("    consultantId: ").append(toIndentedString(consultantId)).append("\n");
        sb.append("    responsibility: ").append(toIndentedString(responsibility)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    orgUnitId: ").append(toIndentedString(orgUnitId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Gets or Sets responsibility
     */
    public enum ResponsibilityEnum {
        OPERATIONS_ADMINISTRATION("Operations administration"),

        IMMIGRATION_ADMINISTRATION("Immigration administration"),

        CLIENT_RELATIONSHIP_MANAGEMENT("Client relationship management"),

        SOURCING("Sourcing"),

        RECRUITING_OWNER("Recruiting Owner"),

        LEADER("Leader"),

        CREATOR("Creator"),

        SALES_CONSULTANT("Sales Consultant"),

        VALUE_UNSPECIFIED("Value unspecified");

        private final String value;

        ResponsibilityEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ResponsibilityEnum fromValue(String value) {
            for (ResponsibilityEnum b : ResponsibilityEnum.values()) {
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
}

