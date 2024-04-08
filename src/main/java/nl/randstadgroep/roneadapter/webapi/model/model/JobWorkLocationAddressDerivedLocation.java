package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * JobWorkLocationAddressDerivedLocation
 */

@JsonTypeName("JobWorkLocationAddress_derivedLocation")

public class JobWorkLocationAddressDerivedLocation {

    private JobWorkLocationAddressDerivedLocationLatLng latLng;

    private String taxonomyLocationId;

    public JobWorkLocationAddressDerivedLocation latLng(JobWorkLocationAddressDerivedLocationLatLng latLng) {
        this.latLng = latLng;
        return this;
    }

    /**
     * Get latLng
     *
     * @return latLng
     */


    @JsonProperty("latLng")
    public JobWorkLocationAddressDerivedLocationLatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(JobWorkLocationAddressDerivedLocationLatLng latLng) {
        this.latLng = latLng;
    }

    public JobWorkLocationAddressDerivedLocation taxonomyLocationId(String taxonomyLocationId) {
        this.taxonomyLocationId = taxonomyLocationId;
        return this;
    }

    /**
     * Get taxonomyLocationId
     *
     * @return taxonomyLocationId
     */


    @JsonProperty("taxonomyLocationId")
    public String getTaxonomyLocationId() {
        return taxonomyLocationId;
    }

    public void setTaxonomyLocationId(String taxonomyLocationId) {
        this.taxonomyLocationId = taxonomyLocationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobWorkLocationAddressDerivedLocation jobWorkLocationAddressDerivedLocation = (JobWorkLocationAddressDerivedLocation) o;
        return Objects.equals(this.latLng, jobWorkLocationAddressDerivedLocation.latLng) &&
                Objects.equals(this.taxonomyLocationId, jobWorkLocationAddressDerivedLocation.taxonomyLocationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latLng, taxonomyLocationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobWorkLocationAddressDerivedLocation {\n");
        sb.append("    latLng: ").append(toIndentedString(latLng)).append("\n");
        sb.append("    taxonomyLocationId: ").append(toIndentedString(taxonomyLocationId)).append("\n");
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

