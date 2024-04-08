package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Certification
 */


public class Certification {

    private String displayName;

    private Boolean isCurrent;

    /**
     * Default constructor
     *
     * @deprecated Use {@link Certification#Certification(String)}
     */
    @Deprecated
    public Certification() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Certification(String displayName) {
        this.displayName = displayName;
    }

    public Certification displayName(String displayName) {
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

    public Certification isCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    /**
     * Indicates if it's the person's current certification. true/false. Default - Null
     *
     * @return isCurrent
     */


    @JsonProperty("isCurrent")
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Certification certification = (Certification) o;
        return Objects.equals(this.displayName, certification.displayName) &&
                Objects.equals(this.isCurrent, certification.isCurrent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, isCurrent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Certification {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
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

