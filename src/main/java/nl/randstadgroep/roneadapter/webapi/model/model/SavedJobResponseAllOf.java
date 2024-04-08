package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * SavedJobResponseAllOf
 */

@JsonTypeName("SavedJobResponse_allOf")

public class SavedJobResponseAllOf {

    private SavedJob savedJob;

    public SavedJobResponseAllOf savedJob(SavedJob savedJob) {
        this.savedJob = savedJob;
        return this;
    }

    /**
     * Get savedJob
     *
     * @return savedJob
     */


    @JsonProperty("savedJob")
    public SavedJob getSavedJob() {
        return savedJob;
    }

    public void setSavedJob(SavedJob savedJob) {
        this.savedJob = savedJob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SavedJobResponseAllOf savedJobResponseAllOf = (SavedJobResponseAllOf) o;
        return Objects.equals(this.savedJob, savedJobResponseAllOf.savedJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(savedJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SavedJobResponseAllOf {\n");
        sb.append("    savedJob: ").append(toIndentedString(savedJob)).append("\n");
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

