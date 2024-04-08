package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * WorkPreferencePayRates
 */


public class WorkPreferencePayRates {

    private BigDecimal wantedSalary;
    private CategoryEnum category;
    private WorkPreferencePayRateCurrencyCode currencyCode;
    private TypeEnum type;
    private SalaryUnitEnum salaryUnit;

    public WorkPreferencePayRates wantedSalary(BigDecimal wantedSalary) {
        this.wantedSalary = wantedSalary;
        return this;
    }

    /**
     * Get wantedSalary
     *
     * @return wantedSalary
     */


    @JsonProperty("wantedSalary")
    public BigDecimal getWantedSalary() {
        return wantedSalary;
    }

    public void setWantedSalary(BigDecimal wantedSalary) {
        this.wantedSalary = wantedSalary;
    }

    public WorkPreferencePayRates category(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     *
     * @return category
     */


    @JsonProperty("category")
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public WorkPreferencePayRates currencyCode(WorkPreferencePayRateCurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get currencyCode
     *
     * @return currencyCode
     */


    @JsonProperty("currencyCode")
    public WorkPreferencePayRateCurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(WorkPreferencePayRateCurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public WorkPreferencePayRates type(TypeEnum type) {
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

    public WorkPreferencePayRates salaryUnit(SalaryUnitEnum salaryUnit) {
        this.salaryUnit = salaryUnit;
        return this;
    }

    /**
     * Get salaryUnit
     *
     * @return salaryUnit
     */


    @JsonProperty("salaryUnit")
    public SalaryUnitEnum getSalaryUnit() {
        return salaryUnit;
    }

    public void setSalaryUnit(SalaryUnitEnum salaryUnit) {
        this.salaryUnit = salaryUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkPreferencePayRates workPreferencePayRates = (WorkPreferencePayRates) o;
        return Objects.equals(this.wantedSalary, workPreferencePayRates.wantedSalary) &&
                Objects.equals(this.category, workPreferencePayRates.category) &&
                Objects.equals(this.currencyCode, workPreferencePayRates.currencyCode) &&
                Objects.equals(this.type, workPreferencePayRates.type) &&
                Objects.equals(this.salaryUnit, workPreferencePayRates.salaryUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wantedSalary, category, currencyCode, type, salaryUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkPreferencePayRates {\n");
        sb.append("    wantedSalary: ").append(toIndentedString(wantedSalary)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    salaryUnit: ").append(toIndentedString(salaryUnit)).append("\n");
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
     * Gets or Sets category
     */
    public enum CategoryEnum {
        FIXED("FIXED"),

        HISTORICAL("HISTORICAL"),

        MAX("MAX"),

        MIN("MIN"),

        PREFERENCE("PREFERENCE"),

        VALUE_UNSPECIFIED("VALUE_UNSPECIFIED");

        private final String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            for (CategoryEnum b : CategoryEnum.values()) {
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
     * Gets or Sets salaryUnit
     */
    public enum SalaryUnitEnum {
        DAY("DAY"),

        HOUR("HOUR"),

        MONTH("MONTH"),

        CONTRACTPERIOD("CONTRACTPERIOD"),

        WEEK("WEEK"),

        YEAR("YEAR"),

        PERIOD("PERIOD"),

        QUARTER("QUARTER"),

        VALUE_UNSPECIFIED("VALUE_UNSPECIFIED");

        private final String value;

        SalaryUnitEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static SalaryUnitEnum fromValue(String value) {
            for (SalaryUnitEnum b : SalaryUnitEnum.values()) {
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

