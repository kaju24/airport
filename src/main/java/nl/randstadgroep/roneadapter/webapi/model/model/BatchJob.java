package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BatchJob
 */


public class BatchJob {

    private String env;

    private Long id;

    private String jobname;

    private String timestamp;

    private String entityName;

    private String entityType;

    private String fileType;

    private String fileName;

    private BatchState state;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime endTime;


    private List<BatchStep> steps;

    public BatchJob env(String env) {
        this.env = env;
        return this;
    }

    /**
     * Get env
     *
     * @return env
     */


    @JsonProperty("env")
    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public BatchJob id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */


    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BatchJob jobname(String jobname) {
        this.jobname = jobname;
        return this;
    }

    /**
     * Get jobname
     *
     * @return jobname
     */


    @JsonProperty("jobname")
    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public BatchJob timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     */


    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public BatchJob entityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * Get entityName
     *
     * @return entityName
     */


    @JsonProperty("entityName")
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public BatchJob entityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     *
     * @return entityType
     */


    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public BatchJob fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Get fileType
     *
     * @return fileType
     */


    @JsonProperty("fileType")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public BatchJob fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get fileName
     *
     * @return fileName
     */


    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BatchJob state(BatchState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */


    @JsonProperty("state")
    public BatchState getState() {
        return state;
    }

    public void setState(BatchState state) {
        this.state = state;
    }

    public BatchJob createTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get createTime
     *
     * @return createTime
     */


    @JsonProperty("createTime")
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public BatchJob startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
     *
     * @return startTime
     */


    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public BatchJob endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get endTime
     *
     * @return endTime
     */


    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public BatchJob steps(List<BatchStep> steps) {
        this.steps = steps;
        return this;
    }

    public BatchJob addStepsItem(BatchStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * Get steps
     *
     * @return steps
     */


    @JsonProperty("steps")
    public List<BatchStep> getSteps() {
        return steps;
    }

    public void setSteps(List<BatchStep> steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchJob batchJob = (BatchJob) o;
        return Objects.equals(this.env, batchJob.env) &&
                Objects.equals(this.id, batchJob.id) &&
                Objects.equals(this.jobname, batchJob.jobname) &&
                Objects.equals(this.timestamp, batchJob.timestamp) &&
                Objects.equals(this.entityName, batchJob.entityName) &&
                Objects.equals(this.entityType, batchJob.entityType) &&
                Objects.equals(this.fileType, batchJob.fileType) &&
                Objects.equals(this.fileName, batchJob.fileName) &&
                Objects.equals(this.state, batchJob.state) &&
                Objects.equals(this.createTime, batchJob.createTime) &&
                Objects.equals(this.startTime, batchJob.startTime) &&
                Objects.equals(this.endTime, batchJob.endTime) &&
                Objects.equals(this.steps, batchJob.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(env, id, jobname, timestamp, entityName, entityType, fileType, fileName, state, createTime, startTime, endTime, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchJob {\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobname: ").append(toIndentedString(jobname)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

