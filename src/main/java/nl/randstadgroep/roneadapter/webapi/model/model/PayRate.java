package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * PayRate
 */


public class PayRate {

    private String payRateId;
    private TypeEnum type;
    private UnitEnum unit;
    private CurrencyCode currencyCode;
    private BigDecimal minSalary;
    private BigDecimal maxSalary;

    public PayRate payRateId(String payRateId) {
        this.payRateId = payRateId;
        return this;
    }

    /**
     * Get payRateId
     *
     * @return payRateId
     */


    @JsonProperty("payRateId")
    public String getPayRateId() {
        return payRateId;
    }

    public void setPayRateId(String payRateId) {
        this.payRateId = payRateId;
    }

    public PayRate type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */


    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PayRate unit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     */


    @JsonProperty("unit")
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    public PayRate currencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get currencyCode
     *
     * @return currencyCode
     */


    @JsonProperty("currencyCode")
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public PayRate minSalary(BigDecimal minSalary) {
        this.minSalary = minSalary;
        return this;
    }

    /**
     * Get minSalary
     *
     * @return minSalary
     */


    @JsonProperty("minSalary")
    public BigDecimal getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(BigDecimal minSalary) {
        this.minSalary = minSalary;
    }

    public PayRate maxSalary(BigDecimal maxSalary) {
        this.maxSalary = maxSalary;
        return this;
    }

    /**
     * Get maxSalary
     *
     * @return maxSalary
     */


    @JsonProperty("maxSalary")
    public BigDecimal getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(BigDecimal maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PayRate payRate = (PayRate) o;
        return Objects.equals(this.payRateId, payRate.payRateId) &&
                Objects.equals(this.type, payRate.type) &&
                Objects.equals(this.unit, payRate.unit) &&
                Objects.equals(this.currencyCode, payRate.currencyCode) &&
                Objects.equals(this.minSalary, payRate.minSalary) &&
                Objects.equals(this.maxSalary, payRate.maxSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payRateId, type, unit, currencyCode, minSalary, maxSalary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayRate {\n");
        sb.append("    payRateId: ").append(toIndentedString(payRateId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    minSalary: ").append(toIndentedString(minSalary)).append("\n");
        sb.append("    maxSalary: ").append(toIndentedString(maxSalary)).append("\n");
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

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        BASE("BASE"),

        BONUS("BONUS"),

        COMMISSION("COMMISSION"),

        PROFIT_SHARING("PROFIT_SHARING"),

        TIPS("TIPS"),

        PERKS("PERKS"),

        VALUE_UNSPECIFIED("VALUE_UNSPECIFIED");

        private final String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Gets or Sets unit
     */
    public enum UnitEnum {
        H("H"),

        M("M"),

        DAILY("DAILY"),

        FOUR_WEEKLY("FOUR_WEEKLY"),

        ONE_TIME("ONE_TIME"),

        WEEKLY("WEEKLY"),

        ANNUALLY("ANNUALLY"),

        VALUE_UNSPECIFIED("VALUE_UNSPECIFIED");

        private final String value;

        UnitEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static UnitEnum fromValue(String value) {
            for (UnitEnum b : UnitEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}

