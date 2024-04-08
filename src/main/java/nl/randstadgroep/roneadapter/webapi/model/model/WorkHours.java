package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WorkHours
 */


public class WorkHours {

    private BigDecimal minHours;

    private BigDecimal maxHours;

    private String startTime;

    private String endTime;

    private String id;


    private List<String> shifts;

    private String notes;

    public WorkHours minHours(BigDecimal minHours) {
        this.minHours = minHours;
        return this;
    }

    /**
     * Get minHours
     *
     * @return minHours
     */


    @JsonProperty("minHours")
    public BigDecimal getMinHours() {
        return minHours;
    }

    public void setMinHours(BigDecimal minHours) {
        this.minHours = minHours;
    }

    public WorkHours maxHours(BigDecimal maxHours) {
        this.maxHours = maxHours;
        return this;
    }

    /**
     * Get maxHours
     *
     * @return maxHours
     */


    @JsonProperty("maxHours")
    public BigDecimal getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(BigDecimal maxHours) {
        this.maxHours = maxHours;
    }

    public WorkHours startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
     *
     * @return startTime
     */


    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public WorkHours endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get endTime
     *
     * @return endTime
     */


    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public WorkHours id(String id) {
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

    public WorkHours shifts(List<String> shifts) {
        this.shifts = shifts;
        return this;
    }

    public WorkHours addShiftsItem(String shiftsItem) {
        if (this.shifts == null) {
            this.shifts = new ArrayList<>();
        }
        this.shifts.add(shiftsItem);
        return this;
    }

    /**
     * Get shifts
     *
     * @return shifts
     */


    @JsonProperty("shifts")
    public List<String> getShifts() {
        return shifts;
    }

    public void setShifts(List<String> shifts) {
        this.shifts = shifts;
    }

    public WorkHours notes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     */


    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkHours workHours = (WorkHours) o;
        return Objects.equals(this.minHours, workHours.minHours) &&
                Objects.equals(this.maxHours, workHours.maxHours) &&
                Objects.equals(this.startTime, workHours.startTime) &&
                Objects.equals(this.endTime, workHours.endTime) &&
                Objects.equals(this.id, workHours.id) &&
                Objects.equals(this.shifts, workHours.shifts) &&
                Objects.equals(this.notes, workHours.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minHours, maxHours, startTime, endTime, id, shifts, notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkHours {\n");
        sb.append("    minHours: ").append(toIndentedString(minHours)).append("\n");
        sb.append("    maxHours: ").append(toIndentedString(maxHours)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

