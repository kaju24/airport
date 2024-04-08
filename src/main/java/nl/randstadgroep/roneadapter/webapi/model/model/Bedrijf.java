package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Bedrijf
 */


public class Bedrijf {

    private BedrijfNummer bedrijfNummer;

    private OrganisatieNummerType unitNummer;

    private OrganisatieNummerType labelNummer;

    private OrganisatieNummerType groepwerkmaatschappijNummer;

    public Bedrijf bedrijfNummer(BedrijfNummer bedrijfNummer) {
        this.bedrijfNummer = bedrijfNummer;
        return this;
    }

    /**
     * Get bedrijfNummer
     *
     * @return bedrijfNummer
     */


    @JsonProperty("bedrijfNummer")
    public BedrijfNummer getBedrijfNummer() {
        return bedrijfNummer;
    }

    public void setBedrijfNummer(BedrijfNummer bedrijfNummer) {
        this.bedrijfNummer = bedrijfNummer;
    }

    public Bedrijf unitNummer(OrganisatieNummerType unitNummer) {
        this.unitNummer = unitNummer;
        return this;
    }

    /**
     * Get unitNummer
     *
     * @return unitNummer
     */


    @JsonProperty("unitNummer")
    public OrganisatieNummerType getUnitNummer() {
        return unitNummer;
    }

    public void setUnitNummer(OrganisatieNummerType unitNummer) {
        this.unitNummer = unitNummer;
    }

    public Bedrijf labelNummer(OrganisatieNummerType labelNummer) {
        this.labelNummer = labelNummer;
        return this;
    }

    /**
     * Get labelNummer
     *
     * @return labelNummer
     */


    @JsonProperty("labelNummer")
    public OrganisatieNummerType getLabelNummer() {
        return labelNummer;
    }

    public void setLabelNummer(OrganisatieNummerType labelNummer) {
        this.labelNummer = labelNummer;
    }

    public Bedrijf groepwerkmaatschappijNummer(OrganisatieNummerType groepwerkmaatschappijNummer) {
        this.groepwerkmaatschappijNummer = groepwerkmaatschappijNummer;
        return this;
    }

    /**
     * Get groepwerkmaatschappijNummer
     *
     * @return groepwerkmaatschappijNummer
     */


    @JsonProperty("groepwerkmaatschappijNummer")
    public OrganisatieNummerType getGroepwerkmaatschappijNummer() {
        return groepwerkmaatschappijNummer;
    }

    public void setGroepwerkmaatschappijNummer(OrganisatieNummerType groepwerkmaatschappijNummer) {
        this.groepwerkmaatschappijNummer = groepwerkmaatschappijNummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bedrijf bedrijf = (Bedrijf) o;
        return Objects.equals(this.bedrijfNummer, bedrijf.bedrijfNummer) &&
                Objects.equals(this.unitNummer, bedrijf.unitNummer) &&
                Objects.equals(this.labelNummer, bedrijf.labelNummer) &&
                Objects.equals(this.groepwerkmaatschappijNummer, bedrijf.groepwerkmaatschappijNummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bedrijfNummer, unitNummer, labelNummer, groepwerkmaatschappijNummer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bedrijf {\n");
        sb.append("    bedrijfNummer: ").append(toIndentedString(bedrijfNummer)).append("\n");
        sb.append("    unitNummer: ").append(toIndentedString(unitNummer)).append("\n");
        sb.append("    labelNummer: ").append(toIndentedString(labelNummer)).append("\n");
        sb.append("    groepwerkmaatschappijNummer: ").append(toIndentedString(groepwerkmaatschappijNummer)).append("\n");
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

