package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TalentRequest
 */


public class TalentRequest {

    private Talent talent;

    /**
     * Default constructor
     *
     * @deprecated Use {@link TalentRequest#TalentRequest(Talent)}
     */
    @Deprecated
    public TalentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TalentRequest(Talent talent) {
        this.talent = talent;
    }

    public TalentRequest talent(Talent talent) {
        this.talent = talent;
        return this;
    }

    /**
     * Get talent
     *
     * @return talent
     */


    @JsonProperty("Talent")
    public Talent getTalent() {
        return talent;
    }

    public void setTalent(Talent talent) {
        this.talent = talent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TalentRequest talentRequest = (TalentRequest) o;
        return Objects.equals(this.talent, talentRequest.talent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(talent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TalentRequest {\n");
        sb.append("    talent: ").append(toIndentedString(talent)).append("\n");
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

