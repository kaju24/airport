package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Plaatsing
 */


public class Plaatsing {

    private PlaatsingNummer plaatsingNummer;

    private OrganisatieNummerType unitNummer;

    private OrganisatieNummerType labelNummer;

    private OrganisatieNummerType groepwerkmaatschappijNummer;

    public Plaatsing plaatsingNummer(PlaatsingNummer plaatsingNummer) {
        this.plaatsingNummer = plaatsingNummer;
        return this;
    }

    /**
     * Get plaatsingNummer
     *
     * @return plaatsingNummer
     */


    @JsonProperty("plaatsingNummer")
    public PlaatsingNummer getPlaatsingNummer() {
        return plaatsingNummer;
    }

    public void setPlaatsingNummer(PlaatsingNummer plaatsingNummer) {
        this.plaatsingNummer = plaatsingNummer;
    }

    public Plaatsing unitNummer(OrganisatieNummerType unitNummer) {
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

    public Plaatsing labelNummer(OrganisatieNummerType labelNummer) {
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

    public Plaatsing groepwerkmaatschappijNummer(OrganisatieNummerType groepwerkmaatschappijNummer) {
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
        Plaatsing plaatsing = (Plaatsing) o;
        return Objects.equals(this.plaatsingNummer, plaatsing.plaatsingNummer) &&
                Objects.equals(this.unitNummer, plaatsing.unitNummer) &&
                Objects.equals(this.labelNummer, plaatsing.labelNummer) &&
                Objects.equals(this.groepwerkmaatschappijNummer, plaatsing.groepwerkmaatschappijNummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plaatsingNummer, unitNummer, labelNummer, groepwerkmaatschappijNummer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Plaatsing {\n");
        sb.append("    plaatsingNummer: ").append(toIndentedString(plaatsingNummer)).append("\n");
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

