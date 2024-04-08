package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobClassification
 */


public class JobClassification {

    private String category;

    private String department;

    private String environment;

    private String industry;

    private String subcategory;

    public JobClassification category(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     *
     * @return category
     */


    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public JobClassification department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Get department
     *
     * @return department
     */


    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public JobClassification environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get environment
     *
     * @return environment
     */


    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public JobClassification industry(String industry) {
        this.industry = industry;
        return this;
    }

    /**
     * Get industry
     *
     * @return industry
     */


    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public JobClassification subcategory(String subcategory) {
        this.subcategory = subcategory;
        return this;
    }

    /**
     * Get subcategory
     *
     * @return subcategory
     */


    @JsonProperty("subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobClassification jobClassification = (JobClassification) o;
        return Objects.equals(this.category, jobClassification.category) &&
                Objects.equals(this.department, jobClassification.department) &&
                Objects.equals(this.environment, jobClassification.environment) &&
                Objects.equals(this.industry, jobClassification.industry) &&
                Objects.equals(this.subcategory, jobClassification.subcategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, department, environment, industry, subcategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobClassification {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
        sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
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

