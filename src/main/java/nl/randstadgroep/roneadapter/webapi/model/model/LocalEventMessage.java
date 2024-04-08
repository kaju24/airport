package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LocalEventMessage
 */


public class LocalEventMessage {


    private Map<String, String> data = new HashMap<>();

    private LocalEventAttributes attributes;

    public LocalEventMessage data(Map<String, String> data) {
        this.data = data;
        return this;
    }

    public LocalEventMessage putDataItem(String key, String dataItem) {
        if (this.data == null) {
            this.data = new HashMap<>();
        }
        this.data.put(key, dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */


    @JsonProperty("data")
    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public LocalEventMessage attributes(LocalEventAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     */


    @JsonProperty("attributes")
    public LocalEventAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(LocalEventAttributes attributes) {
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
        LocalEventMessage localEventMessage = (LocalEventMessage) o;
        return Objects.equals(this.data, localEventMessage.data) &&
                Objects.equals(this.attributes, localEventMessage.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalEventMessage {\n");
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

