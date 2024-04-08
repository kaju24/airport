package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * JobWorkLocationAddressDerivedLocationLatLng
 */

@JsonTypeName("JobWorkLocationAddress_derivedLocation_latLng")

public class JobWorkLocationAddressDerivedLocationLatLng {

    private Float latitude;

    private Float longitude;

    public JobWorkLocationAddressDerivedLocationLatLng latitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get latitude
     *
     * @return latitude
     */


    @JsonProperty("latitude")
    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public JobWorkLocationAddressDerivedLocationLatLng longitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get longitude
     *
     * @return longitude
     */


    @JsonProperty("longitude")
    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobWorkLocationAddressDerivedLocationLatLng jobWorkLocationAddressDerivedLocationLatLng = (JobWorkLocationAddressDerivedLocationLatLng) o;
        return Objects.equals(this.latitude, jobWorkLocationAddressDerivedLocationLatLng.latitude) &&
                Objects.equals(this.longitude, jobWorkLocationAddressDerivedLocationLatLng.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobWorkLocationAddressDerivedLocationLatLng {\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

