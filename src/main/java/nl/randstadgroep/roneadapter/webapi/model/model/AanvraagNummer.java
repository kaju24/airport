package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AanvraagNummer
 */


public class AanvraagNummer {

    private String value;

    private String avrId;

    public AanvraagNummer value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */


    @JsonProperty("_value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AanvraagNummer avrId(String avrId) {
        this.avrId = avrId;
        return this;
    }

    /**
     * Get avrId
     *
     * @return avrId
     */


    @JsonProperty("avrId")
    public String getAvrId() {
        return avrId;
    }

    public void setAvrId(String avrId) {
        this.avrId = avrId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AanvraagNummer aanvraagNummer = (AanvraagNummer) o;
        return Objects.equals(this.value, aanvraagNummer.value) &&
                Objects.equals(this.avrId, aanvraagNummer.avrId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, avrId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AanvraagNummer {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    avrId: ").append(toIndentedString(avrId)).append("\n");
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
}

