package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExistingApplication
 */


public class ExistingApplication {

    private String localJobPostingId;

    private String globalJobOrderId;

    private String applicationId;

    private String globalJobPostingId;

    public ExistingApplication localJobPostingId(String localJobPostingId) {
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

    public ExistingApplication globalJobOrderId(String globalJobOrderId) {
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

    public ExistingApplication applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get applicationId
     *
     * @return applicationId
     */


    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ExistingApplication globalJobPostingId(String globalJobPostingId) {
        this.globalJobPostingId = globalJobPostingId;
        return this;
    }

    /**
     * Get globalJobPostingId
     *
     * @return globalJobPostingId
     */


    @JsonProperty("globalJobPostingId")
    public String getGlobalJobPostingId() {
        return globalJobPostingId;
    }

    public void setGlobalJobPostingId(String globalJobPostingId) {
        this.globalJobPostingId = globalJobPostingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExistingApplication existingApplication = (ExistingApplication) o;
        return Objects.equals(this.localJobPostingId, existingApplication.localJobPostingId) &&
                Objects.equals(this.globalJobOrderId, existingApplication.globalJobOrderId) &&
                Objects.equals(this.applicationId, existingApplication.applicationId) &&
                Objects.equals(this.globalJobPostingId, existingApplication.globalJobPostingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localJobPostingId, globalJobOrderId, applicationId, globalJobPostingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExistingApplication {\n");
        sb.append("    localJobPostingId: ").append(toIndentedString(localJobPostingId)).append("\n");
        sb.append("    globalJobOrderId: ").append(toIndentedString(globalJobOrderId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    globalJobPostingId: ").append(toIndentedString(globalJobPostingId)).append("\n");
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

