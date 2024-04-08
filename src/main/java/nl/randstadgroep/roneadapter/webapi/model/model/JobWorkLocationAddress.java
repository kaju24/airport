package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobWorkLocationAddress
 */


public class JobWorkLocationAddress {

    private String addressLineOne;

    private String addressLineTwo;

    private String streetName;

    private String propertyNumber;

    private String propertyNumberExtension;

    private String administrativeArea;

    private String locality;

    private String sublocality;

    private RegionCode regionCode;

    private String postalCode;

    private String sortingCode;

    private JobLanguageCode languageCode;

    private JobWorkLocationAddressDerivedLocation derivedLocation;

    public JobWorkLocationAddress addressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
        return this;
    }

    /**
     * Get addressLineOne
     *
     * @return addressLineOne
     */


    @JsonProperty("addressLineOne")
    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public JobWorkLocationAddress addressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
        return this;
    }

    /**
     * Get addressLineTwo
     *
     * @return addressLineTwo
     */


    @JsonProperty("addressLineTwo")
    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public JobWorkLocationAddress streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * Get streetName
     *
     * @return streetName
     */


    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public JobWorkLocationAddress propertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
        return this;
    }

    /**
     * Get propertyNumber
     *
     * @return propertyNumber
     */


    @JsonProperty("propertyNumber")
    public String getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public JobWorkLocationAddress propertyNumberExtension(String propertyNumberExtension) {
        this.propertyNumberExtension = propertyNumberExtension;
        return this;
    }

    /**
     * Get propertyNumberExtension
     *
     * @return propertyNumberExtension
     */


    @JsonProperty("propertyNumberExtension")
    public String getPropertyNumberExtension() {
        return propertyNumberExtension;
    }

    public void setPropertyNumberExtension(String propertyNumberExtension) {
        this.propertyNumberExtension = propertyNumberExtension;
    }

    public JobWorkLocationAddress administrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
        return this;
    }

    /**
     * Get administrativeArea
     *
     * @return administrativeArea
     */


    @JsonProperty("administrativeArea")
    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public JobWorkLocationAddress locality(String locality) {
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

    public JobWorkLocationAddress sublocality(String sublocality) {
        this.sublocality = sublocality;
        return this;
    }

    /**
     * Get sublocality
     *
     * @return sublocality
     */


    @JsonProperty("sublocality")
    public String getSublocality() {
        return sublocality;
    }

    public void setSublocality(String sublocality) {
        this.sublocality = sublocality;
    }

    public JobWorkLocationAddress regionCode(RegionCode regionCode) {
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

    public JobWorkLocationAddress postalCode(String postalCode) {
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

    public JobWorkLocationAddress sortingCode(String sortingCode) {
        this.sortingCode = sortingCode;
        return this;
    }

    /**
     * Get sortingCode
     *
     * @return sortingCode
     */


    @JsonProperty("sortingCode")
    public String getSortingCode() {
        return sortingCode;
    }

    public void setSortingCode(String sortingCode) {
        this.sortingCode = sortingCode;
    }

    public JobWorkLocationAddress languageCode(JobLanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Get languageCode
     *
     * @return languageCode
     */


    @JsonProperty("languageCode")
    public JobLanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(JobLanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public JobWorkLocationAddress derivedLocation(JobWorkLocationAddressDerivedLocation derivedLocation) {
        this.derivedLocation = derivedLocation;
        return this;
    }

    /**
     * Get derivedLocation
     *
     * @return derivedLocation
     */


    @JsonProperty("derivedLocation")
    public JobWorkLocationAddressDerivedLocation getDerivedLocation() {
        return derivedLocation;
    }

    public void setDerivedLocation(JobWorkLocationAddressDerivedLocation derivedLocation) {
        this.derivedLocation = derivedLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobWorkLocationAddress jobWorkLocationAddress = (JobWorkLocationAddress) o;
        return Objects.equals(this.addressLineOne, jobWorkLocationAddress.addressLineOne) &&
                Objects.equals(this.addressLineTwo, jobWorkLocationAddress.addressLineTwo) &&
                Objects.equals(this.streetName, jobWorkLocationAddress.streetName) &&
                Objects.equals(this.propertyNumber, jobWorkLocationAddress.propertyNumber) &&
                Objects.equals(this.propertyNumberExtension, jobWorkLocationAddress.propertyNumberExtension) &&
                Objects.equals(this.administrativeArea, jobWorkLocationAddress.administrativeArea) &&
                Objects.equals(this.locality, jobWorkLocationAddress.locality) &&
                Objects.equals(this.sublocality, jobWorkLocationAddress.sublocality) &&
                Objects.equals(this.regionCode, jobWorkLocationAddress.regionCode) &&
                Objects.equals(this.postalCode, jobWorkLocationAddress.postalCode) &&
                Objects.equals(this.sortingCode, jobWorkLocationAddress.sortingCode) &&
                Objects.equals(this.languageCode, jobWorkLocationAddress.languageCode) &&
                Objects.equals(this.derivedLocation, jobWorkLocationAddress.derivedLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLineOne, addressLineTwo, streetName, propertyNumber, propertyNumberExtension, administrativeArea, locality, sublocality, regionCode, postalCode, sortingCode, languageCode, derivedLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobWorkLocationAddress {\n");
        sb.append("    addressLineOne: ").append(toIndentedString(addressLineOne)).append("\n");
        sb.append("    addressLineTwo: ").append(toIndentedString(addressLineTwo)).append("\n");
        sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
        sb.append("    propertyNumber: ").append(toIndentedString(propertyNumber)).append("\n");
        sb.append("    propertyNumberExtension: ").append(toIndentedString(propertyNumberExtension)).append("\n");
        sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    sublocality: ").append(toIndentedString(sublocality)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    sortingCode: ").append(toIndentedString(sortingCode)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    derivedLocation: ").append(toIndentedString(derivedLocation)).append("\n");
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

