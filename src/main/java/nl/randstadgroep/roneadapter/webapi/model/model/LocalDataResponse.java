package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LocalDataResponse
 */


public class LocalDataResponse {

    private Integer id;

    private String label;

    private String value;

    /**
     * Default constructor
     *
     * @deprecated Use {@link LocalDataResponse#LocalDataResponse(Integer, String, String)}
     */
    @Deprecated
    public LocalDataResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public LocalDataResponse(Integer id, String label, String value) {
        this.id = id;
        this.label = label;
        this.value = value;
    }

    public LocalDataResponse id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */


    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDataResponse label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     */


    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public LocalDataResponse value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */


    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalDataResponse localDataResponse = (LocalDataResponse) o;
        return Objects.equals(this.id, localDataResponse.id) &&
                Objects.equals(this.label, localDataResponse.label) &&
                Objects.equals(this.value, localDataResponse.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalDataResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

