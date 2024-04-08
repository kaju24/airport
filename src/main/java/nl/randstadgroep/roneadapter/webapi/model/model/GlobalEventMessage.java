package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GlobalEventMessage
 */


public class GlobalEventMessage {

    private Object data;

    private GlobalEventAttributes attributes;

    public GlobalEventMessage data(Object data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */


    @JsonProperty("data")
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public GlobalEventMessage attributes(GlobalEventAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     */


    @JsonProperty("attributes")
    public GlobalEventAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(GlobalEventAttributes attributes) {
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
        GlobalEventMessage globalEventMessage = (GlobalEventMessage) o;
        return Objects.equals(this.data, globalEventMessage.data) &&
                Objects.equals(this.attributes, globalEventMessage.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalEventMessage {\n");
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

