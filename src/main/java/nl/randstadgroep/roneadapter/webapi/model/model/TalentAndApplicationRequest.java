package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TalentAndApplicationRequest
 */


public class TalentAndApplicationRequest {

    private TalentAndApplication talentAndApplication;

    /**
     * Default constructor
     *
     * @deprecated Use {@link TalentAndApplicationRequest#TalentAndApplicationRequest(TalentAndApplication)}
     */
    @Deprecated
    public TalentAndApplicationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TalentAndApplicationRequest(TalentAndApplication talentAndApplication) {
        this.talentAndApplication = talentAndApplication;
    }

    public TalentAndApplicationRequest talentAndApplication(TalentAndApplication talentAndApplication) {
        this.talentAndApplication = talentAndApplication;
        return this;
    }

    /**
     * Get talentAndApplication
     *
     * @return talentAndApplication
     */


    @JsonProperty("TalentAndApplication")
    public TalentAndApplication getTalentAndApplication() {
        return talentAndApplication;
    }

    public void setTalentAndApplication(TalentAndApplication talentAndApplication) {
        this.talentAndApplication = talentAndApplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TalentAndApplicationRequest talentAndApplicationRequest = (TalentAndApplicationRequest) o;
        return Objects.equals(this.talentAndApplication, talentAndApplicationRequest.talentAndApplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(talentAndApplication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TalentAndApplicationRequest {\n");
        sb.append("    talentAndApplication: ").append(toIndentedString(talentAndApplication)).append("\n");
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

