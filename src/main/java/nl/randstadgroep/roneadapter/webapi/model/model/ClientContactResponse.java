package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * ClientContactResponse
 */


public class ClientContactResponse {

    private String contactId;
    private ContactTypeEnum contactType;
    private String id;

    /**
     * Default constructor
     *
     * @deprecated Use {@link ClientContactResponse#ClientContactResponse(String)}
     */
    @Deprecated
    public ClientContactResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ClientContactResponse(String contactId) {
        this.contactId = contactId;
    }

    public ClientContactResponse contactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * Client contact id
     *
     * @return contactId
     */


    @JsonProperty("contactId")
    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public ClientContactResponse contactType(ContactTypeEnum contactType) {
        this.contactType = contactType;
        return this;
    }

    /**
     * Client contact type
     *
     * @return contactType
     */


    @JsonProperty("contactType")
    public ContactTypeEnum getContactType() {
        return contactType;
    }

    public void setContactType(ContactTypeEnum contactType) {
        this.contactType = contactType;
    }

    public ClientContactResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier that enables updates to specific instances of the repeated object
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientContactResponse clientContactResponse = (ClientContactResponse) o;
        return Objects.equals(this.contactId, clientContactResponse.contactId) &&
                Objects.equals(this.contactType, clientContactResponse.contactType) &&
                Objects.equals(this.id, clientContactResponse.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, contactType, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientContactResponse {\n");
        sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
        sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
     * Client contact type
     */
    public enum ContactTypeEnum {
        HIRING_MANAGER("Hiring manager"),

        INTERVIEWER("Interviewer"),

        PROCUREMENT_BUYER("Procurement / Buyer"),

        BILLING_APPROVER("Billing Approver"),

        TIMESHEET_APPROVER("Timesheet Approver"),

        HR("HR"),

        REPORT_TO_SUPERVISOR("Report to / Supervisor"),

        ON_SITE_THIRD_PARTY_PERSON("On site / Third party person"),

        VMS_MANAGER_BROKER("VMS Manager/Broker");

        private final String value;

        ContactTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ContactTypeEnum fromValue(String value) {
            for (ContactTypeEnum b : ContactTypeEnum.values()) {
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

