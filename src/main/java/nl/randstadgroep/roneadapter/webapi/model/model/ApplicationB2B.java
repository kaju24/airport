package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApplicationB2B
 */


public class ApplicationB2B {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdDate;

    private Boolean deleted = null;

    private Disposition disposition;

    private String id;

    private String jobId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime modifiedDate;

    private String source;

    private String sourceDetails;


    private List<Stage> stages;

    private String talentId;

    public ApplicationB2B createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * The timestamp of the application creation date.
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

    public ApplicationB2B deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * is deleted
     *
     * @return deleted
     */


    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public ApplicationB2B disposition(Disposition disposition) {
        this.disposition = disposition;
        return this;
    }

    /**
     * Get disposition
     *
     * @return disposition
     */


    @JsonProperty("disposition")
    public Disposition getDisposition() {
        return disposition;
    }

    public void setDisposition(Disposition disposition) {
        this.disposition = disposition;
    }

    public ApplicationB2B id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */


    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplicationB2B jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get jobId
     *
     * @return jobId
     */


    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ApplicationB2B modifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * The timestamp of the application modification date.
     *
     * @return modifiedDate
     */


    @JsonProperty("modifiedDate")
    public OffsetDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ApplicationB2B source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */


    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ApplicationB2B sourceDetails(String sourceDetails) {
        this.sourceDetails = sourceDetails;
        return this;
    }

    /**
     * Get sourceDetails
     *
     * @return sourceDetails
     */


    @JsonProperty("sourceDetails")
    public String getSourceDetails() {
        return sourceDetails;
    }

    public void setSourceDetails(String sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    public ApplicationB2B stages(List<Stage> stages) {
        this.stages = stages;
        return this;
    }

    public ApplicationB2B addStagesItem(Stage stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    /**
     * Get stages
     *
     * @return stages
     */


    @JsonProperty("stages")
    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    public ApplicationB2B talentId(String talentId) {
        this.talentId = talentId;
        return this;
    }

    /**
     * Get talentId
     *
     * @return talentId
     */


    @JsonProperty("talentId")
    public String getTalentId() {
        return talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationB2B applicationB2B = (ApplicationB2B) o;
        return Objects.equals(this.createdDate, applicationB2B.createdDate) &&
                Objects.equals(this.deleted, applicationB2B.deleted) &&
                Objects.equals(this.disposition, applicationB2B.disposition) &&
                Objects.equals(this.id, applicationB2B.id) &&
                Objects.equals(this.jobId, applicationB2B.jobId) &&
                Objects.equals(this.modifiedDate, applicationB2B.modifiedDate) &&
                Objects.equals(this.source, applicationB2B.source) &&
                Objects.equals(this.sourceDetails, applicationB2B.sourceDetails) &&
                Objects.equals(this.stages, applicationB2B.stages) &&
                Objects.equals(this.talentId, applicationB2B.talentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdDate, deleted, disposition, id, jobId, modifiedDate, source, sourceDetails, stages, talentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationB2B {\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    disposition: ").append(toIndentedString(disposition)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceDetails: ").append(toIndentedString(sourceDetails)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
        sb.append("    talentId: ").append(toIndentedString(talentId)).append("\n");
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

