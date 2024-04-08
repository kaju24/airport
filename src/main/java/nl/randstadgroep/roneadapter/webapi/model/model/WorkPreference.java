package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WorkPreference
 */


public class WorkPreference {


    private List<String> jobTitles;


    private List<WorkPreferencePayRates> payRates;

    public WorkPreference jobTitles(List<String> jobTitles) {
        this.jobTitles = jobTitles;
        return this;
    }

    public WorkPreference addJobTitlesItem(String jobTitlesItem) {
        if (this.jobTitles == null) {
            this.jobTitles = new ArrayList<>();
        }
        this.jobTitles.add(jobTitlesItem);
        return this;
    }

    /**
     * Get jobTitles
     *
     * @return jobTitles
     */


    @JsonProperty("jobTitles")
    public List<String> getJobTitles() {
        return jobTitles;
    }

    public void setJobTitles(List<String> jobTitles) {
        this.jobTitles = jobTitles;
    }

    public WorkPreference payRates(List<WorkPreferencePayRates> payRates) {
        this.payRates = payRates;
        return this;
    }

    public WorkPreference addPayRatesItem(WorkPreferencePayRates payRatesItem) {
        if (this.payRates == null) {
            this.payRates = new ArrayList<>();
        }
        this.payRates.add(payRatesItem);
        return this;
    }

    /**
     * Get payRates
     *
     * @return payRates
     */


    @JsonProperty("payRates")
    public List<WorkPreferencePayRates> getPayRates() {
        return payRates;
    }

    public void setPayRates(List<WorkPreferencePayRates> payRates) {
        this.payRates = payRates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkPreference workPreference = (WorkPreference) o;
        return Objects.equals(this.jobTitles, workPreference.jobTitles) &&
                Objects.equals(this.payRates, workPreference.payRates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobTitles, payRates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkPreference {\n");
        sb.append("    jobTitles: ").append(toIndentedString(jobTitles)).append("\n");
        sb.append("    payRates: ").append(toIndentedString(payRates)).append("\n");
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

