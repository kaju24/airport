package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Application
 */


public class Application {

    private String localJobPostingId;

    private String globalJobOrderId;

    private String motivation;

    private SourceEnum source;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdDate;

    public Application localJobPostingId(String localJobPostingId) {
        this.localJobPostingId = localJobPostingId;
        return this;
    }

    /**
     * Get localJobPostingId
     *
     * @return localJobPostingId
     */


    @JsonProperty("localJobPostingId")
    public String getLocalJobPostingId() {
        return localJobPostingId;
    }

    public void setLocalJobPostingId(String localJobPostingId) {
        this.localJobPostingId = localJobPostingId;
    }

    public Application globalJobOrderId(String globalJobOrderId) {
        this.globalJobOrderId = globalJobOrderId;
        return this;
    }

    /**
     * Get globalJobOrderId
     *
     * @return globalJobOrderId
     */


    @JsonProperty("globalJobOrderId")
    public String getGlobalJobOrderId() {
        return globalJobOrderId;
    }

    public void setGlobalJobOrderId(String globalJobOrderId) {
        this.globalJobOrderId = globalJobOrderId;
    }

    public Application motivation(String motivation) {
        this.motivation = motivation;
        return this;
    }

    /**
     * Get motivation
     *
     * @return motivation
     */


    @JsonProperty("motivation")
    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public Application source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */


    @JsonProperty("source")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public Application createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * The creation date of application.
     *
     * @return createdDate
     */


    @JsonProperty("createdDate")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Application application = (Application) o;
        return Objects.equals(this.localJobPostingId, application.localJobPostingId) &&
                Objects.equals(this.globalJobOrderId, application.globalJobOrderId) &&
                Objects.equals(this.motivation, application.motivation) &&
                Objects.equals(this.source, application.source) &&
                Objects.equals(this.createdDate, application.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localJobPostingId, globalJobOrderId, motivation, source, createdDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Application {\n");
        sb.append("    localJobPostingId: ").append(toIndentedString(localJobPostingId)).append("\n");
        sb.append("    globalJobOrderId: ").append(toIndentedString(globalJobOrderId)).append("\n");
        sb.append("    motivation: ").append(toIndentedString(motivation)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

