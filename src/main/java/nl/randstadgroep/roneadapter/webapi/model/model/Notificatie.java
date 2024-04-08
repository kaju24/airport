package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Notificatie
 */


public class Notificatie {

    private String id;

    private String entiteit;

    private DossierType dossier;

    private ActieType actie;

    private Plaatsing plaatsing;

    private Employee employee;

    private Bedrijf bedrijf;

    private Aanvraag aanvraag;

    private ExternePlaatsingIdentificaties externePlaatsingIdentificaties;

    public Notificatie id(String id) {
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

    public Notificatie entiteit(String entiteit) {
        this.entiteit = entiteit;
        return this;
    }

    /**
     * Get entiteit
     *
     * @return entiteit
     */


    @JsonProperty("entiteit")
    public String getEntiteit() {
        return entiteit;
    }

    public void setEntiteit(String entiteit) {
        this.entiteit = entiteit;
    }

    public Notificatie dossier(DossierType dossier) {
        this.dossier = dossier;
        return this;
    }

    /**
     * Get dossier
     *
     * @return dossier
     */


    @JsonProperty("dossier")
    public DossierType getDossier() {
        return dossier;
    }

    public void setDossier(DossierType dossier) {
        this.dossier = dossier;
    }

    public Notificatie actie(ActieType actie) {
        this.actie = actie;
        return this;
    }

    /**
     * Get actie
     *
     * @return actie
     */


    @JsonProperty("actie")
    public ActieType getActie() {
        return actie;
    }

    public void setActie(ActieType actie) {
        this.actie = actie;
    }

    public Notificatie plaatsing(Plaatsing plaatsing) {
        this.plaatsing = plaatsing;
        return this;
    }

    /**
     * Get plaatsing
     *
     * @return plaatsing
     */


    @JsonProperty("plaatsing")
    public Plaatsing getPlaatsing() {
        return plaatsing;
    }

    public void setPlaatsing(Plaatsing plaatsing) {
        this.plaatsing = plaatsing;
    }

    public Notificatie employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Get employee
     *
     * @return employee
     */


    @JsonProperty("employee")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Notificatie bedrijf(Bedrijf bedrijf) {
        this.bedrijf = bedrijf;
        return this;
    }

    /**
     * Get bedrijf
     *
     * @return bedrijf
     */


    @JsonProperty("bedrijf")
    public Bedrijf getBedrijf() {
        return bedrijf;
    }

    public void setBedrijf(Bedrijf bedrijf) {
        this.bedrijf = bedrijf;
    }

    public Notificatie aanvraag(Aanvraag aanvraag) {
        this.aanvraag = aanvraag;
        return this;
    }

    /**
     * Get aanvraag
     *
     * @return aanvraag
     */


    @JsonProperty("aanvraag")
    public Aanvraag getAanvraag() {
        return aanvraag;
    }

    public void setAanvraag(Aanvraag aanvraag) {
        this.aanvraag = aanvraag;
    }

    public Notificatie externePlaatsingIdentificaties(ExternePlaatsingIdentificaties externePlaatsingIdentificaties) {
        this.externePlaatsingIdentificaties = externePlaatsingIdentificaties;
        return this;
    }

    /**
     * Get externePlaatsingIdentificaties
     *
     * @return externePlaatsingIdentificaties
     */


    @JsonProperty("externePlaatsingIdentificaties")
    public ExternePlaatsingIdentificaties getExternePlaatsingIdentificaties() {
        return externePlaatsingIdentificaties;
    }

    public void setExternePlaatsingIdentificaties(ExternePlaatsingIdentificaties externePlaatsingIdentificaties) {
        this.externePlaatsingIdentificaties = externePlaatsingIdentificaties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Notificatie notificatie = (Notificatie) o;
        return Objects.equals(this.id, notificatie.id) &&
                Objects.equals(this.entiteit, notificatie.entiteit) &&
                Objects.equals(this.dossier, notificatie.dossier) &&
                Objects.equals(this.actie, notificatie.actie) &&
                Objects.equals(this.plaatsing, notificatie.plaatsing) &&
                Objects.equals(this.employee, notificatie.employee) &&
                Objects.equals(this.bedrijf, notificatie.bedrijf) &&
                Objects.equals(this.aanvraag, notificatie.aanvraag) &&
                Objects.equals(this.externePlaatsingIdentificaties, notificatie.externePlaatsingIdentificaties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, entiteit, dossier, actie, plaatsing, employee, bedrijf, aanvraag, externePlaatsingIdentificaties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Notificatie {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    entiteit: ").append(toIndentedString(entiteit)).append("\n");
        sb.append("    dossier: ").append(toIndentedString(dossier)).append("\n");
        sb.append("    actie: ").append(toIndentedString(actie)).append("\n");
        sb.append("    plaatsing: ").append(toIndentedString(plaatsing)).append("\n");
        sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
        sb.append("    bedrijf: ").append(toIndentedString(bedrijf)).append("\n");
        sb.append("    aanvraag: ").append(toIndentedString(aanvraag)).append("\n");
        sb.append("    externePlaatsingIdentificaties: ").append(toIndentedString(externePlaatsingIdentificaties)).append("\n");
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

