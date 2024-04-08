package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * JobPostingResponseAllOf
 */

@JsonTypeName("JobPostingResponse_allOf")

public class JobPostingResponseAllOf {

    private JobPosting jobPosting;

    public JobPostingResponseAllOf jobPosting(JobPosting jobPosting) {
        this.jobPosting = jobPosting;
        return this;
    }

    /**
     * Get jobPosting
     *
     * @return jobPosting
     */


    @JsonProperty("jobPosting")
    public JobPosting getJobPosting() {
        return jobPosting;
    }

    public void setJobPosting(JobPosting jobPosting) {
        this.jobPosting = jobPosting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobPostingResponseAllOf jobPostingResponseAllOf = (JobPostingResponseAllOf) o;
        return Objects.equals(this.jobPosting, jobPostingResponseAllOf.jobPosting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobPosting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobPostingResponseAllOf {\n");
        sb.append("    jobPosting: ").append(toIndentedString(jobPosting)).append("\n");
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

