package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExternePlaatsingIdentificaties
 */


public class ExternePlaatsingIdentificaties {

    private String originelePlaatsingNummer;

    public ExternePlaatsingIdentificaties originelePlaatsingNummer(String originelePlaatsingNummer) {
        this.originelePlaatsingNummer = originelePlaatsingNummer;
        return this;
    }

    /**
     * Get originelePlaatsingNummer
     *
     * @return originelePlaatsingNummer
     */


    @JsonProperty("originelePlaatsingNummer")
    public String getOriginelePlaatsingNummer() {
        return originelePlaatsingNummer;
    }

    public void setOriginelePlaatsingNummer(String originelePlaatsingNummer) {
        this.originelePlaatsingNummer = originelePlaatsingNummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternePlaatsingIdentificaties externePlaatsingIdentificaties = (ExternePlaatsingIdentificaties) o;
        return Objects.equals(this.originelePlaatsingNummer, externePlaatsingIdentificaties.originelePlaatsingNummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originelePlaatsingNummer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternePlaatsingIdentificaties {\n");
        sb.append("    originelePlaatsingNummer: ").append(toIndentedString(originelePlaatsingNummer)).append("\n");
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

