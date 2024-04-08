package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PlaatsingNummer
 */


public class PlaatsingNummer {

    private String value;

    private String psgId;

    public PlaatsingNummer value(String value) {
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

    public PlaatsingNummer psgId(String psgId) {
        this.psgId = psgId;
        return this;
    }

    /**
     * Get psgId
     *
     * @return psgId
     */


    @JsonProperty("psgId")
    public String getPsgId() {
        return psgId;
    }

    public void setPsgId(String psgId) {
        this.psgId = psgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlaatsingNummer plaatsingNummer = (PlaatsingNummer) o;
        return Objects.equals(this.value, plaatsingNummer.value) &&
                Objects.equals(this.psgId, plaatsingNummer.psgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, psgId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaatsingNummer {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    psgId: ").append(toIndentedString(psgId)).append("\n");
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

