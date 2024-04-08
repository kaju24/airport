package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BedrijfNummer
 */


public class BedrijfNummer {

    private String value;

    private String bdfId;

    private String bllId;

    public BedrijfNummer value(String value) {
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

    public BedrijfNummer bdfId(String bdfId) {
        this.bdfId = bdfId;
        return this;
    }

    /**
     * Get bdfId
     *
     * @return bdfId
     */


    @JsonProperty("bdfId")
    public String getBdfId() {
        return bdfId;
    }

    public void setBdfId(String bdfId) {
        this.bdfId = bdfId;
    }

    public BedrijfNummer bllId(String bllId) {
        this.bllId = bllId;
        return this;
    }

    /**
     * Get bllId
     *
     * @return bllId
     */


    @JsonProperty("bllId")
    public String getBllId() {
        return bllId;
    }

    public void setBllId(String bllId) {
        this.bllId = bllId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BedrijfNummer bedrijfNummer = (BedrijfNummer) o;
        return Objects.equals(this.value, bedrijfNummer.value) &&
                Objects.equals(this.bdfId, bedrijfNummer.bdfId) &&
                Objects.equals(this.bllId, bedrijfNummer.bllId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, bdfId, bllId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BedrijfNummer {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    bdfId: ").append(toIndentedString(bdfId)).append("\n");
        sb.append("    bllId: ").append(toIndentedString(bllId)).append("\n");
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

