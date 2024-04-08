package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * BatchStep
 */


public class BatchStep {

    private String stepname;

    private BatchState state;

    private Integer readCount;

    private Integer writeCount;

    private Integer commitCount;

    private Integer rollbackCount;

    private Integer readSkipCount;

    private Integer processSkipCount;

    private Integer writeSkipCount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime endTime;

    private String exitDescription;

    public BatchStep stepname(String stepname) {
        this.stepname = stepname;
        return this;
    }

    /**
     * Get stepname
     *
     * @return stepname
     */


    @JsonProperty("stepname")
    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname;
    }

    public BatchStep state(BatchState state) {
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

    public BatchStep readCount(Integer readCount) {
        this.readCount = readCount;
        return this;
    }

    /**
     * Get readCount
     *
     * @return readCount
     */


    @JsonProperty("readCount")
    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public BatchStep writeCount(Integer writeCount) {
        this.writeCount = writeCount;
        return this;
    }

    /**
     * Get writeCount
     *
     * @return writeCount
     */


    @JsonProperty("writeCount")
    public Integer getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(Integer writeCount) {
        this.writeCount = writeCount;
    }

    public BatchStep commitCount(Integer commitCount) {
        this.commitCount = commitCount;
        return this;
    }

    /**
     * Get commitCount
     *
     * @return commitCount
     */


    @JsonProperty("commitCount")
    public Integer getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public BatchStep rollbackCount(Integer rollbackCount) {
        this.rollbackCount = rollbackCount;
        return this;
    }

    /**
     * Get rollbackCount
     *
     * @return rollbackCount
     */


    @JsonProperty("rollbackCount")
    public Integer getRollbackCount() {
        return rollbackCount;
    }

    public void setRollbackCount(Integer rollbackCount) {
        this.rollbackCount = rollbackCount;
    }

    public BatchStep readSkipCount(Integer readSkipCount) {
        this.readSkipCount = readSkipCount;
        return this;
    }

    /**
     * Get readSkipCount
     *
     * @return readSkipCount
     */


    @JsonProperty("readSkipCount")
    public Integer getReadSkipCount() {
        return readSkipCount;
    }

    public void setReadSkipCount(Integer readSkipCount) {
        this.readSkipCount = readSkipCount;
    }

    public BatchStep processSkipCount(Integer processSkipCount) {
        this.processSkipCount = processSkipCount;
        return this;
    }

    /**
     * Get processSkipCount
     *
     * @return processSkipCount
     */


    @JsonProperty("processSkipCount")
    public Integer getProcessSkipCount() {
        return processSkipCount;
    }

    public void setProcessSkipCount(Integer processSkipCount) {
        this.processSkipCount = processSkipCount;
    }

    public BatchStep writeSkipCount(Integer writeSkipCount) {
        this.writeSkipCount = writeSkipCount;
        return this;
    }

    /**
     * Get writeSkipCount
     *
     * @return writeSkipCount
     */


    @JsonProperty("writeSkipCount")
    public Integer getWriteSkipCount() {
        return writeSkipCount;
    }

    public void setWriteSkipCount(Integer writeSkipCount) {
        this.writeSkipCount = writeSkipCount;
    }

    public BatchStep startTime(OffsetDateTime startTime) {
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

    public BatchStep endTime(OffsetDateTime endTime) {
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

    public BatchStep exitDescription(String exitDescription) {
        this.exitDescription = exitDescription;
        return this;
    }

    /**
     * Get exitDescription
     *
     * @return exitDescription
     */


    @JsonProperty("exitDescription")
    public String getExitDescription() {
        return exitDescription;
    }

    public void setExitDescription(String exitDescription) {
        this.exitDescription = exitDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchStep batchStep = (BatchStep) o;
        return Objects.equals(this.stepname, batchStep.stepname) &&
                Objects.equals(this.state, batchStep.state) &&
                Objects.equals(this.readCount, batchStep.readCount) &&
                Objects.equals(this.writeCount, batchStep.writeCount) &&
                Objects.equals(this.commitCount, batchStep.commitCount) &&
                Objects.equals(this.rollbackCount, batchStep.rollbackCount) &&
                Objects.equals(this.readSkipCount, batchStep.readSkipCount) &&
                Objects.equals(this.processSkipCount, batchStep.processSkipCount) &&
                Objects.equals(this.writeSkipCount, batchStep.writeSkipCount) &&
                Objects.equals(this.startTime, batchStep.startTime) &&
                Objects.equals(this.endTime, batchStep.endTime) &&
                Objects.equals(this.exitDescription, batchStep.exitDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepname, state, readCount, writeCount, commitCount, rollbackCount, readSkipCount, processSkipCount, writeSkipCount, startTime, endTime, exitDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStep {\n");
        sb.append("    stepname: ").append(toIndentedString(stepname)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    readCount: ").append(toIndentedString(readCount)).append("\n");
        sb.append("    writeCount: ").append(toIndentedString(writeCount)).append("\n");
        sb.append("    commitCount: ").append(toIndentedString(commitCount)).append("\n");
        sb.append("    rollbackCount: ").append(toIndentedString(rollbackCount)).append("\n");
        sb.append("    readSkipCount: ").append(toIndentedString(readSkipCount)).append("\n");
        sb.append("    processSkipCount: ").append(toIndentedString(processSkipCount)).append("\n");
        sb.append("    writeSkipCount: ").append(toIndentedString(writeSkipCount)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    exitDescription: ").append(toIndentedString(exitDescription)).append("\n");
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

