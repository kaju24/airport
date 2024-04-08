package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;

/**
 * EducationRecord
 */


public class EducationRecord {

    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate endDate;

    private String schoolName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;
    private DegreeTypeEnum degreeType = null;

    /**
     * Default constructor
     *
     * @deprecated Use {@link EducationRecord#EducationRecord(String)}
     */
    @Deprecated
    public EducationRecord() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EducationRecord(String schoolName) {
        this.schoolName = schoolName;
    }

    public EducationRecord name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Full Degree name. e.g. \"B.S.\", \"Master of Arts\".
     *
     * @return name
     */


    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EducationRecord endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * The end date of the education.
     *
     * @return endDate
     */


    @JsonProperty("endDate")
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public EducationRecord schoolName(String schoolName) {
        this.schoolName = schoolName;
        return this;
    }

    /**
     * The name of the school or institution. For example, \"Stanford University\", \"UC Berkeley\", etc.
     *
     * @return schoolName
     */


    @JsonProperty("schoolName")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public EducationRecord startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The start date of the education.
     *
     * @return startDate
     */


    @JsonProperty("startDate")
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public EducationRecord degreeType(DegreeTypeEnum degreeType) {
        this.degreeType = degreeType;
        return this;
    }

    /**
     * The degree Type of education, e.g. HBO.
     *
     * @return degreeType
     */


    @JsonProperty("degreeType")
    public DegreeTypeEnum getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeTypeEnum degreeType) {
        this.degreeType = degreeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EducationRecord educationRecord = (EducationRecord) o;
        return Objects.equals(this.name, educationRecord.name) &&
                Objects.equals(this.endDate, educationRecord.endDate) &&
                Objects.equals(this.schoolName, educationRecord.schoolName) &&
                Objects.equals(this.startDate, educationRecord.startDate) &&
                Objects.equals(this.degreeType, educationRecord.degreeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, endDate, schoolName, startDate, degreeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EducationRecord {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    schoolName: ").append(toIndentedString(schoolName)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    degreeType: ").append(toIndentedString(degreeType)).append("\n");
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
     * The degree Type of education, e.g. HBO.
     */
    public enum DegreeTypeEnum {
        BASISONDERWIJS("Basisonderwijs"),

        VMBO_MAVO("VMBO/MAVO"),

        HAVO_VWO("HAVO/VWO"),

        MBO("MBO"),

        ONDERSTEUNEND_ONDERWIJS("Ondersteunend onderwijs"),

        HBO("HBO"),

        WO("Master"),

        PHD("PHD"),

        VALUE_UNSPECIFIED("Geen");

        private final String value;

        DegreeTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static DegreeTypeEnum fromValue(String value) {
            for (DegreeTypeEnum b : DegreeTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
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

