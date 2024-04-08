package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BesDataKenId
 */


public class BesDataKenId implements BesData {

    private String globalTalentId;

    private String kenId;

    public BesDataKenId globalTalentId(String globalTalentId) {
        this.globalTalentId = globalTalentId;
        return this;
    }

    /**
     * Get globalTalentId
     *
     * @return globalTalentId
     */


    @JsonProperty("globalTalentId")
    public String getGlobalTalentId() {
        return globalTalentId;
    }

    public void setGlobalTalentId(String globalTalentId) {
        this.globalTalentId = globalTalentId;
    }

    public BesDataKenId kenId(String kenId) {
        this.kenId = kenId;
        return this;
    }

    /**
     * Get kenId
     *
     * @return kenId
     */


    @JsonProperty("kenId")
    public String getKenId() {
        return kenId;
    }

    public void setKenId(String kenId) {
        this.kenId = kenId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BesDataKenId besDataKenId = (BesDataKenId) o;
        return Objects.equals(this.globalTalentId, besDataKenId.globalTalentId) &&
                Objects.equals(this.kenId, besDataKenId.kenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalTalentId, kenId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BesDataKenId {\n");
        sb.append("    globalTalentId: ").append(toIndentedString(globalTalentId)).append("\n");
        sb.append("    kenId: ").append(toIndentedString(kenId)).append("\n");
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

