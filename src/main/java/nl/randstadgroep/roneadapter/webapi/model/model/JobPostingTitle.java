package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * JobPostingTitle
 */


public class JobPostingTitle {

    private String title;
    private JobTitleCategoryEnum jobTitleCategory;

    public JobPostingTitle title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     */


    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JobPostingTitle jobTitleCategory(JobTitleCategoryEnum jobTitleCategory) {
        this.jobTitleCategory = jobTitleCategory;
        return this;
    }

    /**
     * Get jobTitleCategory
     *
     * @return jobTitleCategory
     */


    @JsonProperty("jobTitleCategory")
    public JobTitleCategoryEnum getJobTitleCategory() {
        return jobTitleCategory;
    }

    public void setJobTitleCategory(JobTitleCategoryEnum jobTitleCategory) {
        this.jobTitleCategory = jobTitleCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobPostingTitle jobPostingTitle = (JobPostingTitle) o;
        return Objects.equals(this.title, jobPostingTitle.title) &&
                Objects.equals(this.jobTitleCategory, jobPostingTitle.jobTitleCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, jobTitleCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobPostingTitle {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    jobTitleCategory: ").append(toIndentedString(jobTitleCategory)).append("\n");
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

    /**
     * Gets or Sets jobTitleCategory
     */
    public enum JobTitleCategoryEnum {
        ONET("ONET"),

        OSHA("OSHA"),

        RANDSTAD("RANDSTAD"),

        ISCO("ISCO"),

        VALUE_UNSPECIFIED("VALUE_UNSPECIFIED");

        private final String value;

        JobTitleCategoryEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static JobTitleCategoryEnum fromValue(String value) {
            for (JobTitleCategoryEnum b : JobTitleCategoryEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

