package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * JobCertification
 */


public class JobCertification {

    private String id;

    private String description;

    private String displayName;

    private Importance importance;
    private LevelEnum level;
    private Double yearsExperience;

    public JobCertification id(String id) {
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

    public JobCertification description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */


    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobCertification displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     *
     * @return displayName
     */


    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public JobCertification importance(Importance importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get importance
     *
     * @return importance
     */


    @JsonProperty("importance")
    public Importance getImportance() {
        return importance;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public JobCertification level(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * Get level
     *
     * @return level
     */


    @JsonProperty("level")
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public JobCertification yearsExperience(Double yearsExperience) {
        this.yearsExperience = yearsExperience;
        return this;
    }

    /**
     * Get yearsExperience
     *
     * @return yearsExperience
     */


    @JsonProperty("yearsExperience")
    public Double getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(Double yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobCertification jobCertification = (JobCertification) o;
        return Objects.equals(this.id, jobCertification.id) &&
                Objects.equals(this.description, jobCertification.description) &&
                Objects.equals(this.displayName, jobCertification.displayName) &&
                Objects.equals(this.importance, jobCertification.importance) &&
                Objects.equals(this.level, jobCertification.level) &&
                Objects.equals(this.yearsExperience, jobCertification.yearsExperience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, displayName, importance, level, yearsExperience);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobCertification {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    yearsExperience: ").append(toIndentedString(yearsExperience)).append("\n");
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
     * Gets or Sets level
     */
    public enum LevelEnum {
        ADVANCED("Advanced"),

        EXPERT("Expert"),

        FUNDAMENTAL_AWARENESS("Fundamental awareness"),

        INTERMEDIATE("Intermediate"),

        NOVICE("Novice"),

        VALUE_UNSPECIFIED("Value unspecified");

        private final String value;

        LevelEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static LevelEnum fromValue(String value) {
            for (LevelEnum b : LevelEnum.values()) {
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

