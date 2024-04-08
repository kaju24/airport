package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OrganisatieNummerType
 */


public class OrganisatieNummerType {

    private String value;

    private String oedId;

    private String afkorting;

    public OrganisatieNummerType value(String value) {
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

    public OrganisatieNummerType oedId(String oedId) {
        this.oedId = oedId;
        return this;
    }

    /**
     * Get oedId
     *
     * @return oedId
     */


    @JsonProperty("oedId")
    public String getOedId() {
        return oedId;
    }

    public void setOedId(String oedId) {
        this.oedId = oedId;
    }

    public OrganisatieNummerType afkorting(String afkorting) {
        this.afkorting = afkorting;
        return this;
    }

    /**
     * Get afkorting
     *
     * @return afkorting
     */


    @JsonProperty("afkorting")
    public String getAfkorting() {
        return afkorting;
    }

    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganisatieNummerType organisatieNummerType = (OrganisatieNummerType) o;
        return Objects.equals(this.value, organisatieNummerType.value) &&
                Objects.equals(this.oedId, organisatieNummerType.oedId) &&
                Objects.equals(this.afkorting, organisatieNummerType.afkorting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, oedId, afkorting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganisatieNummerType {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    oedId: ").append(toIndentedString(oedId)).append("\n");
        sb.append("    afkorting: ").append(toIndentedString(afkorting)).append("\n");
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

