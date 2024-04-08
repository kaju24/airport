package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

/**
 * Skill
 */


public class Skill {

    private String id;

    private String context;

    private String displayName;

    private Double experienceYears;

    private Importance importance;
    private LevelEnum level;
    private String taxonomySkillId;

    public Skill id(String id) {
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

    public Skill context(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     *
     * @return context
     */


    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Skill displayName(String displayName) {
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

    public Skill experienceYears(Double experienceYears) {
        this.experienceYears = experienceYears;
        return this;
    }

    /**
     * Get experienceYears
     *
     * @return experienceYears
     */


    @JsonProperty("experienceYears")
    public Double getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(Double experienceYears) {
        this.experienceYears = experienceYears;
    }

    public Skill importance(Importance importance) {
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

    public Skill level(LevelEnum level) {
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

    public Skill taxonomySkillId(String taxonomySkillId) {
        this.taxonomySkillId = taxonomySkillId;
        return this;
    }

    /**
     * Get taxonomySkillId
     *
     * @return taxonomySkillId
     */


    @JsonProperty("taxonomySkillId")
    public String getTaxonomySkillId() {
        return taxonomySkillId;
    }

    public void setTaxonomySkillId(String taxonomySkillId) {
        this.taxonomySkillId = taxonomySkillId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Skill skill = (Skill) o;
        return Objects.equals(this.id, skill.id) &&
                Objects.equals(this.context, skill.context) &&
                Objects.equals(this.displayName, skill.displayName) &&
                Objects.equals(this.experienceYears, skill.experienceYears) &&
                Objects.equals(this.importance, skill.importance) &&
                Objects.equals(this.level, skill.level) &&
                Objects.equals(this.taxonomySkillId, skill.taxonomySkillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, context, displayName, experienceYears, importance, level, taxonomySkillId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Skill {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    experienceYears: ").append(toIndentedString(experienceYears)).append("\n");
        sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    taxonomySkillId: ").append(toIndentedString(taxonomySkillId)).append("\n");
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

