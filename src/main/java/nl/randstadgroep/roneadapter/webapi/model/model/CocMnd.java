package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CocMnd
 */


public class CocMnd {

    private String mndCompNumber;

    private String cocNumber;

    public CocMnd mndCompNumber(String mndCompNumber) {
        this.mndCompNumber = mndCompNumber;
        return this;
    }

    /**
     * Get mndCompNumber
     *
     * @return mndCompNumber
     */


    @JsonProperty("mndCompNumber")
    public String getMndCompNumber() {
        return mndCompNumber;
    }

    public void setMndCompNumber(String mndCompNumber) {
        this.mndCompNumber = mndCompNumber;
    }

    public CocMnd cocNumber(String cocNumber) {
        this.cocNumber = cocNumber;
        return this;
    }

    /**
     * Get cocNumber
     *
     * @return cocNumber
     */


    @JsonProperty("cocNumber")
    public String getCocNumber() {
        return cocNumber;
    }

    public void setCocNumber(String cocNumber) {
        this.cocNumber = cocNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CocMnd cocMnd = (CocMnd) o;
        return Objects.equals(this.mndCompNumber, cocMnd.mndCompNumber) &&
                Objects.equals(this.cocNumber, cocMnd.cocNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mndCompNumber, cocNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocMnd {\n");
        sb.append("    mndCompNumber: ").append(toIndentedString(mndCompNumber)).append("\n");
        sb.append("    cocNumber: ").append(toIndentedString(cocNumber)).append("\n");
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

