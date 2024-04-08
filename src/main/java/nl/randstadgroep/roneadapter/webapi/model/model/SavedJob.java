package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SavedJob
 */


public class SavedJob {

    private String globalTalentId;

    private String localJobPostingId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationTime;

    public SavedJob globalTalentId(String globalTalentId) {
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

    public SavedJob localJobPostingId(String localJobPostingId) {
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

    public SavedJob creationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * The timestamp when the saved job is created
     *
     * @return creationTime
     */


    @JsonProperty("creationTime")
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SavedJob savedJob = (SavedJob) o;
        return Objects.equals(this.globalTalentId, savedJob.globalTalentId) &&
                Objects.equals(this.localJobPostingId, savedJob.localJobPostingId) &&
                Objects.equals(this.creationTime, savedJob.creationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalTalentId, localJobPostingId, creationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SavedJob {\n");
        sb.append("    globalTalentId: ").append(toIndentedString(globalTalentId)).append("\n");
        sb.append("    localJobPostingId: ").append(toIndentedString(localJobPostingId)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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

