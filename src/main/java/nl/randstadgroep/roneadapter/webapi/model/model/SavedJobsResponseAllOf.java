package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SavedJobsResponseAllOf
 */

@JsonTypeName("SavedJobsResponse_allOf")

public class SavedJobsResponseAllOf {


    private List<SavedJob> savedJobs;

    public SavedJobsResponseAllOf savedJobs(List<SavedJob> savedJobs) {
        this.savedJobs = savedJobs;
        return this;
    }

    public SavedJobsResponseAllOf addSavedJobsItem(SavedJob savedJobsItem) {
        if (this.savedJobs == null) {
            this.savedJobs = new ArrayList<>();
        }
        this.savedJobs.add(savedJobsItem);
        return this;
    }

    /**
     * Get savedJobs
     *
     * @return savedJobs
     */


    @JsonProperty("savedJobs")
    public List<SavedJob> getSavedJobs() {
        return savedJobs;
    }

    public void setSavedJobs(List<SavedJob> savedJobs) {
        this.savedJobs = savedJobs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SavedJobsResponseAllOf savedJobsResponseAllOf = (SavedJobsResponseAllOf) o;
        return Objects.equals(this.savedJobs, savedJobsResponseAllOf.savedJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(savedJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SavedJobsResponseAllOf {\n");
        sb.append("    savedJobs: ").append(toIndentedString(savedJobs)).append("\n");
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

