package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TalentGroupingRequest
 */


public class TalentGroupingRequest {

    private TalentGrouping talentGrouping;

    public TalentGroupingRequest talentGrouping(TalentGrouping talentGrouping) {
        this.talentGrouping = talentGrouping;
        return this;
    }

    /**
     * Get talentGrouping
     *
     * @return talentGrouping
     */


    @JsonProperty("TalentGrouping")
    public TalentGrouping getTalentGrouping() {
        return talentGrouping;
    }

    public void setTalentGrouping(TalentGrouping talentGrouping) {
        this.talentGrouping = talentGrouping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TalentGroupingRequest talentGroupingRequest = (TalentGroupingRequest) o;
        return Objects.equals(this.talentGrouping, talentGroupingRequest.talentGrouping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(talentGrouping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TalentGroupingRequest {\n");
        sb.append("    talentGrouping: ").append(toIndentedString(talentGrouping)).append("\n");
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

