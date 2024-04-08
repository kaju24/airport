package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * AddressExtendedAllOf
 */

@JsonTypeName("AddressExtended_allOf")

public class AddressExtendedAllOf {

    private Boolean isActive = null;

    public AddressExtendedAllOf isActive(Boolean isActive) {
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
        AddressExtendedAllOf addressExtendedAllOf = (AddressExtendedAllOf) o;
        return Objects.equals(this.isActive, addressExtendedAllOf.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isActive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressExtendedAllOf {\n");
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

