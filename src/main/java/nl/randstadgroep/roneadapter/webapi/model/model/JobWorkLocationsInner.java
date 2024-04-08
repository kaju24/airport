package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * JobWorkLocationsInner
 */

@JsonTypeName("Job_workLocations_inner")

public class JobWorkLocationsInner {

    private Boolean isCurrent;

    private String workLocationId;

    private JobWorkLocationAddress address;

    public JobWorkLocationsInner isCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    /**
     * Get isCurrent
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

    public JobWorkLocationsInner workLocationId(String workLocationId) {
        this.workLocationId = workLocationId;
        return this;
    }

    /**
     * Get workLocationId
     *
     * @return workLocationId
     */


    @JsonProperty("workLocationId")
    public String getWorkLocationId() {
        return workLocationId;
    }

    public void setWorkLocationId(String workLocationId) {
        this.workLocationId = workLocationId;
    }

    public JobWorkLocationsInner address(JobWorkLocationAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     */


    @JsonProperty("address")
    public JobWorkLocationAddress getAddress() {
        return address;
    }

    public void setAddress(JobWorkLocationAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobWorkLocationsInner jobWorkLocationsInner = (JobWorkLocationsInner) o;
        return Objects.equals(this.isCurrent, jobWorkLocationsInner.isCurrent) &&
                Objects.equals(this.workLocationId, jobWorkLocationsInner.workLocationId) &&
                Objects.equals(this.address, jobWorkLocationsInner.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCurrent, workLocationId, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobWorkLocationsInner {\n");
        sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
        sb.append("    workLocationId: ").append(toIndentedString(workLocationId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

