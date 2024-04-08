package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompetitorCorrelation
 */


public class CompetitorCorrelation {

    private String globalClientId;

    private String localCompetitorId;

    /**
     * Default constructor
     *
     * @deprecated Use {@link CompetitorCorrelation#CompetitorCorrelation(String, String)}
     */
    @Deprecated
    public CompetitorCorrelation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CompetitorCorrelation(String globalClientId, String localCompetitorId) {
        this.globalClientId = globalClientId;
        this.localCompetitorId = localCompetitorId;
    }

    public CompetitorCorrelation globalClientId(String globalClientId) {
        this.globalClientId = globalClientId;
        return this;
    }

    /**
     * Get globalClientId
     *
     * @return globalClientId
     */


    @JsonProperty("globalClientId")
    public String getGlobalClientId() {
        return globalClientId;
    }

    public void setGlobalClientId(String globalClientId) {
        this.globalClientId = globalClientId;
    }

    public CompetitorCorrelation localCompetitorId(String localCompetitorId) {
        this.localCompetitorId = localCompetitorId;
        return this;
    }

    /**
     * Get localCompetitorId
     *
     * @return localCompetitorId
     */


    @JsonProperty("localCompetitorId")
    public String getLocalCompetitorId() {
        return localCompetitorId;
    }

    public void setLocalCompetitorId(String localCompetitorId) {
        this.localCompetitorId = localCompetitorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompetitorCorrelation competitorCorrelation = (CompetitorCorrelation) o;
        return Objects.equals(this.globalClientId, competitorCorrelation.globalClientId) &&
                Objects.equals(this.localCompetitorId, competitorCorrelation.localCompetitorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalClientId, localCompetitorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompetitorCorrelation {\n");
        sb.append("    globalClientId: ").append(toIndentedString(globalClientId)).append("\n");
        sb.append("    localCompetitorId: ").append(toIndentedString(localCompetitorId)).append("\n");
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

