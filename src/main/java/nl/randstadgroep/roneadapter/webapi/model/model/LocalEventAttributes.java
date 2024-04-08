package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LocalEventAttributes
 */


public class LocalEventAttributes {

    private String messageId;

    private String eventType;

    private String entityId;

    private String owningEntity;

    private String entityType;

    private String subEntityId;

    private String globalSubEntityId;

    private String globalEntityId;

    private String creationTime;

    private String publisher;

    public LocalEventAttributes messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get messageId
     *
     * @return messageId
     */


    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public LocalEventAttributes eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get eventType
     *
     * @return eventType
     */


    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalEventAttributes entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get entityId
     *
     * @return entityId
     */


    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public LocalEventAttributes owningEntity(String owningEntity) {
        this.owningEntity = owningEntity;
        return this;
    }

    /**
     * Get owningEntity
     *
     * @return owningEntity
     */


    @JsonProperty("owningEntity")
    public String getOwningEntity() {
        return owningEntity;
    }

    public void setOwningEntity(String owningEntity) {
        this.owningEntity = owningEntity;
    }

    public LocalEventAttributes entityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     *
     * @return entityType
     */


    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public LocalEventAttributes subEntityId(String subEntityId) {
        this.subEntityId = subEntityId;
        return this;
    }

    /**
     * Get subEntityId
     *
     * @return subEntityId
     */


    @JsonProperty("subEntityId")
    public String getSubEntityId() {
        return subEntityId;
    }

    public void setSubEntityId(String subEntityId) {
        this.subEntityId = subEntityId;
    }

    public LocalEventAttributes globalSubEntityId(String globalSubEntityId) {
        this.globalSubEntityId = globalSubEntityId;
        return this;
    }

    /**
     * Get globalSubEntityId
     *
     * @return globalSubEntityId
     */


    @JsonProperty("globalSubEntityId")
    public String getGlobalSubEntityId() {
        return globalSubEntityId;
    }

    public void setGlobalSubEntityId(String globalSubEntityId) {
        this.globalSubEntityId = globalSubEntityId;
    }

    public LocalEventAttributes globalEntityId(String globalEntityId) {
        this.globalEntityId = globalEntityId;
        return this;
    }

    /**
     * Get globalEntityId
     *
     * @return globalEntityId
     */


    @JsonProperty("globalEntityId")
    public String getGlobalEntityId() {
        return globalEntityId;
    }

    public void setGlobalEntityId(String globalEntityId) {
        this.globalEntityId = globalEntityId;
    }

    public LocalEventAttributes creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get creationTime
     *
     * @return creationTime
     */


    @JsonProperty("creationTime")
    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public LocalEventAttributes publisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get publisher
     *
     * @return publisher
     */


    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalEventAttributes localEventAttributes = (LocalEventAttributes) o;
        return Objects.equals(this.messageId, localEventAttributes.messageId) &&
                Objects.equals(this.eventType, localEventAttributes.eventType) &&
                Objects.equals(this.entityId, localEventAttributes.entityId) &&
                Objects.equals(this.owningEntity, localEventAttributes.owningEntity) &&
                Objects.equals(this.entityType, localEventAttributes.entityType) &&
                Objects.equals(this.subEntityId, localEventAttributes.subEntityId) &&
                Objects.equals(this.globalSubEntityId, localEventAttributes.globalSubEntityId) &&
                Objects.equals(this.globalEntityId, localEventAttributes.globalEntityId) &&
                Objects.equals(this.creationTime, localEventAttributes.creationTime) &&
                Objects.equals(this.publisher, localEventAttributes.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, eventType, entityId, owningEntity, entityType, subEntityId, globalSubEntityId, globalEntityId, creationTime, publisher);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalEventAttributes {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    owningEntity: ").append(toIndentedString(owningEntity)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    subEntityId: ").append(toIndentedString(subEntityId)).append("\n");
        sb.append("    globalSubEntityId: ").append(toIndentedString(globalSubEntityId)).append("\n");
        sb.append("    globalEntityId: ").append(toIndentedString(globalEntityId)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
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

