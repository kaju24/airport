package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TalentProfile
 */


public class TalentProfile {

    private PersonalDetails personalDetails;


    private List<AddressExtended> addresses;

    private String languageCode = null;


    private List<EmailAddress> emailAddresses;


    private List<PhoneNumber> phoneNumbers;


    private List<EngagementType> engagementTypes;

    public TalentProfile personalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
        return this;
    }

    /**
     * Get personalDetails
     *
     * @return personalDetails
     */


    @JsonProperty("personalDetails")
    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public TalentProfile addresses(List<AddressExtended> addresses) {
        this.addresses = addresses;
        return this;
    }

    public TalentProfile addAddressesItem(AddressExtended addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
     * Get addresses
     *
     * @return addresses
     */


    @JsonProperty("addresses")
    public List<AddressExtended> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressExtended> addresses) {
        this.addresses = addresses;
    }

    public TalentProfile languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Get languageCode
     *
     * @return languageCode
     */


    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public TalentProfile emailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    public TalentProfile addEmailAddressesItem(EmailAddress emailAddressesItem) {
        if (this.emailAddresses == null) {
            this.emailAddresses = new ArrayList<>();
        }
        this.emailAddresses.add(emailAddressesItem);
        return this;
    }

    /**
     * Get emailAddresses
     *
     * @return emailAddresses
     */


    @JsonProperty("emailAddresses")
    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public TalentProfile phoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public TalentProfile addPhoneNumbersItem(PhoneNumber phoneNumbersItem) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumbersItem);
        return this;
    }

    /**
     * Get phoneNumbers
     *
     * @return phoneNumbers
     */


    @JsonProperty("phoneNumbers")
    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public TalentProfile engagementTypes(List<EngagementType> engagementTypes) {
        this.engagementTypes = engagementTypes;
        return this;
    }

    public TalentProfile addEngagementTypesItem(EngagementType engagementTypesItem) {
        if (this.engagementTypes == null) {
            this.engagementTypes = new ArrayList<>();
        }
        this.engagementTypes.add(engagementTypesItem);
        return this;
    }

    /**
     * Get engagementTypes
     *
     * @return engagementTypes
     */


    @JsonProperty("engagementTypes")
    public List<EngagementType> getEngagementTypes() {
        return engagementTypes;
    }

    public void setEngagementTypes(List<EngagementType> engagementTypes) {
        this.engagementTypes = engagementTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TalentProfile talentProfile = (TalentProfile) o;
        return Objects.equals(this.personalDetails, talentProfile.personalDetails) &&
                Objects.equals(this.addresses, talentProfile.addresses) &&
                Objects.equals(this.languageCode, talentProfile.languageCode) &&
                Objects.equals(this.emailAddresses, talentProfile.emailAddresses) &&
                Objects.equals(this.phoneNumbers, talentProfile.phoneNumbers) &&
                Objects.equals(this.engagementTypes, talentProfile.engagementTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalDetails, addresses, languageCode, emailAddresses, phoneNumbers, engagementTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TalentProfile {\n");
        sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
        sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
        sb.append("    engagementTypes: ").append(toIndentedString(engagementTypes)).append("\n");
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

