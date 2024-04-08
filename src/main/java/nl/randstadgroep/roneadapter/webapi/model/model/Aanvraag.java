package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Aanvraag
 */


public class Aanvraag {

    private AanvraagNummer aanvraagNummer;

    private OrganisatieNummerType unitNummer;

    private OrganisatieNummerType labelNummer;

    private OrganisatieNummerType groepwerkmaatschappijNummer;

    public Aanvraag aanvraagNummer(AanvraagNummer aanvraagNummer) {
        this.aanvraagNummer = aanvraagNummer;
        return this;
    }

    /**
     * Get aanvraagNummer
     *
     * @return aanvraagNummer
     */


    @JsonProperty("aanvraagNummer")
    public AanvraagNummer getAanvraagNummer() {
        return aanvraagNummer;
    }

    public void setAanvraagNummer(AanvraagNummer aanvraagNummer) {
        this.aanvraagNummer = aanvraagNummer;
    }

    public Aanvraag unitNummer(OrganisatieNummerType unitNummer) {
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

    public Aanvraag labelNummer(OrganisatieNummerType labelNummer) {
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

    public Aanvraag groepwerkmaatschappijNummer(OrganisatieNummerType groepwerkmaatschappijNummer) {
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
        Aanvraag aanvraag = (Aanvraag) o;
        return Objects.equals(this.aanvraagNummer, aanvraag.aanvraagNummer) &&
                Objects.equals(this.unitNummer, aanvraag.unitNummer) &&
                Objects.equals(this.labelNummer, aanvraag.labelNummer) &&
                Objects.equals(this.groepwerkmaatschappijNummer, aanvraag.groepwerkmaatschappijNummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aanvraagNummer, unitNummer, labelNummer, groepwerkmaatschappijNummer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Aanvraag {\n");
        sb.append("    aanvraagNummer: ").append(toIndentedString(aanvraagNummer)).append("\n");
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

