package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * TalentProfileResponseAllOf
 */

@JsonTypeName("TalentProfileResponse_allOf")

public class TalentProfileResponseAllOf {

    private TalentProfile talentProfile;

    public TalentProfileResponseAllOf talentProfile(TalentProfile talentProfile) {
        this.talentProfile = talentProfile;
        return this;
    }

    /**
     * Get talentProfile
     *
     * @return talentProfile
     */


    @JsonProperty("talentProfile")
    public TalentProfile getTalentProfile() {
        return talentProfile;
    }

    public void setTalentProfile(TalentProfile talentProfile) {
        this.talentProfile = talentProfile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TalentProfileResponseAllOf talentProfileResponseAllOf = (TalentProfileResponseAllOf) o;
        return Objects.equals(this.talentProfile, talentProfileResponseAllOf.talentProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(talentProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TalentProfileResponseAllOf {\n");
        sb.append("    talentProfile: ").append(toIndentedString(talentProfile)).append("\n");
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

