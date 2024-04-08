package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobPostingWorkLocationAddress
 */


public class JobPostingWorkLocationAddress {

    private String workLocationAddressId;

    private String locality;

    private String postalCode;

    private RegionCode regionCode;

    public JobPostingWorkLocationAddress workLocationAddressId(String workLocationAddressId) {
        this.workLocationAddressId = workLocationAddressId;
        return this;
    }

    /**
     * Get workLocationAddressId
     *
     * @return workLocationAddressId
     */


    @JsonProperty("workLocationAddressId")
    public String getWorkLocationAddressId() {
        return workLocationAddressId;
    }

    public void setWorkLocationAddressId(String workLocationAddressId) {
        this.workLocationAddressId = workLocationAddressId;
    }

    public JobPostingWorkLocationAddress locality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * Get locality
     *
     * @return locality
     */


    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public JobPostingWorkLocationAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get postalCode
     *
     * @return postalCode
     */


    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public JobPostingWorkLocationAddress regionCode(RegionCode regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get regionCode
     *
     * @return regionCode
     */


    @JsonProperty("regionCode")
    public RegionCode getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(RegionCode regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobPostingWorkLocationAddress jobPostingWorkLocationAddress = (JobPostingWorkLocationAddress) o;
        return Objects.equals(this.workLocationAddressId, jobPostingWorkLocationAddress.workLocationAddressId) &&
                Objects.equals(this.locality, jobPostingWorkLocationAddress.locality) &&
                Objects.equals(this.postalCode, jobPostingWorkLocationAddress.postalCode) &&
                Objects.equals(this.regionCode, jobPostingWorkLocationAddress.regionCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workLocationAddressId, locality, postalCode, regionCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobPostingWorkLocationAddress {\n");
        sb.append("    workLocationAddressId: ").append(toIndentedString(workLocationAddressId)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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

