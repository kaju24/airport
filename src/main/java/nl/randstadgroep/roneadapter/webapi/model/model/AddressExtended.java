package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;

/**
 * AddressExtended
 */


public class AddressExtended {

    private String id;

    private AddressType addressType;

    private String streetName = null;

    private String houseNumber = null;

    private String houseNumberSuffix = null;

    private String zipCode = null;

    private String city;

    private String country = null;

    private String countryCode = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate endDate = null;

    private RegionCode regionCode;

    private String addressLineOne = null;

    private Boolean isActive = null;

    public AddressExtended id(String id) {
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

    public AddressExtended addressType(AddressType addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * Get addressType
     *
     * @return addressType
     */


    @JsonProperty("addressType")
    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public AddressExtended streetName(String streetName) {
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

    public AddressExtended houseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    /**
     * Get houseNumber
     *
     * @return houseNumber
     */


    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public AddressExtended houseNumberSuffix(String houseNumberSuffix) {
        this.houseNumberSuffix = houseNumberSuffix;
        return this;
    }

    /**
     * Get houseNumberSuffix
     *
     * @return houseNumberSuffix
     */


    @JsonProperty("houseNumberSuffix")
    public String getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    public void setHouseNumberSuffix(String houseNumberSuffix) {
        this.houseNumberSuffix = houseNumberSuffix;
    }

    public AddressExtended zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * Get zipCode
     *
     * @return zipCode
     */


    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public AddressExtended city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     */


    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AddressExtended country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     *
     * @return country
     */


    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressExtended countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get countryCode
     *
     * @return countryCode
     */


    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public AddressExtended startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get startDate
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

    public AddressExtended endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get endDate
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

    public AddressExtended regionCode(RegionCode regionCode) {
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

    public AddressExtended addressLineOne(String addressLineOne) {
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

    public AddressExtended isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Flag if the address is active
     *
     * @return isActive
     */


    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressExtended addressExtended = (AddressExtended) o;
        return Objects.equals(this.id, addressExtended.id) &&
                Objects.equals(this.addressType, addressExtended.addressType) &&
                Objects.equals(this.streetName, addressExtended.streetName) &&
                Objects.equals(this.houseNumber, addressExtended.houseNumber) &&
                Objects.equals(this.houseNumberSuffix, addressExtended.houseNumberSuffix) &&
                Objects.equals(this.zipCode, addressExtended.zipCode) &&
                Objects.equals(this.city, addressExtended.city) &&
                Objects.equals(this.country, addressExtended.country) &&
                Objects.equals(this.countryCode, addressExtended.countryCode) &&
                Objects.equals(this.startDate, addressExtended.startDate) &&
                Objects.equals(this.endDate, addressExtended.endDate) &&
                Objects.equals(this.regionCode, addressExtended.regionCode) &&
                Objects.equals(this.addressLineOne, addressExtended.addressLineOne) &&
                Objects.equals(this.isActive, addressExtended.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressType, streetName, houseNumber, houseNumberSuffix, zipCode, city, country, countryCode, startDate, endDate, regionCode, addressLineOne, isActive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressExtended {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
        sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
        sb.append("    houseNumberSuffix: ").append(toIndentedString(houseNumberSuffix)).append("\n");
        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    addressLineOne: ").append(toIndentedString(addressLineOne)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

