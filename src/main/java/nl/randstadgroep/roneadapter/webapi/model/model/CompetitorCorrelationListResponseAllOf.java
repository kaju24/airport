package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CompetitorCorrelationListResponseAllOf
 */

@JsonTypeName("CompetitorCorrelationListResponse_allOf")

public class CompetitorCorrelationListResponseAllOf {


    private List<CompetitorCorrelation> globalCompetitors;

    public CompetitorCorrelationListResponseAllOf globalCompetitors(List<CompetitorCorrelation> globalCompetitors) {
        this.globalCompetitors = globalCompetitors;
        return this;
    }

    public CompetitorCorrelationListResponseAllOf addGlobalCompetitorsItem(CompetitorCorrelation globalCompetitorsItem) {
        if (this.globalCompetitors == null) {
            this.globalCompetitors = new ArrayList<>();
        }
        this.globalCompetitors.add(globalCompetitorsItem);
        return this;
    }

    /**
     * Get globalCompetitors
     *
     * @return globalCompetitors
     */


    @JsonProperty("globalCompetitors")
    public List<CompetitorCorrelation> getGlobalCompetitors() {
        return globalCompetitors;
    }

    public void setGlobalCompetitors(List<CompetitorCorrelation> globalCompetitors) {
        this.globalCompetitors = globalCompetitors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompetitorCorrelationListResponseAllOf competitorCorrelationListResponseAllOf = (CompetitorCorrelationListResponseAllOf) o;
        return Objects.equals(this.globalCompetitors, competitorCorrelationListResponseAllOf.globalCompetitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalCompetitors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompetitorCorrelationListResponseAllOf {\n");
        sb.append("    globalCompetitors: ").append(toIndentedString(globalCompetitors)).append("\n");
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

