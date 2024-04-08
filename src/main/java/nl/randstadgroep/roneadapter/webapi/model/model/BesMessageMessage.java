package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * BesMessageMessage
 */

@JsonTypeName("BesMessage_message")

public class BesMessageMessage {

    private BesData data;

    private BesAttributes attributes;

    public BesMessageMessage data(BesData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */


    @JsonProperty("data")
    public BesData getData() {
        return data;
    }

    public void setData(BesData data) {
        this.data = data;
    }

    public BesMessageMessage attributes(BesAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     */


    @JsonProperty("attributes")
    public BesAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(BesAttributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BesMessageMessage besMessageMessage = (BesMessageMessage) o;
        return Objects.equals(this.data, besMessageMessage.data) &&
                Objects.equals(this.attributes, besMessageMessage.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BesMessageMessage {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

