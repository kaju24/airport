package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GlobalEventAttributes
 */


public class GlobalEventAttributes {

    private String messageId;

    private String eventType;

    private String entityId;

    private String owningEntity;

    private String entityType;

    private String specsVersion;

    private String creationTime;

    private String dataContentType;

    private String publisher;

    private String sourceSystem;

    public GlobalEventAttributes messageId(String messageId) {
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

    public GlobalEventAttributes eventType(String eventType) {
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

    public GlobalEventAttributes entityId(String entityId) {
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

    public GlobalEventAttributes owningEntity(String owningEntity) {
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

    public GlobalEventAttributes entityType(String entityType) {
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

    public GlobalEventAttributes specsVersion(String specsVersion) {
        this.specsVersion = specsVersion;
        return this;
    }

    /**
     * Get specsVersion
     *
     * @return specsVersion
     */


    @JsonProperty("specsVersion")
    public String getSpecsVersion() {
        return specsVersion;
    }

    public void setSpecsVersion(String specsVersion) {
        this.specsVersion = specsVersion;
    }

    public GlobalEventAttributes creationTime(String creationTime) {
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

    public GlobalEventAttributes dataContentType(String dataContentType) {
        this.dataContentType = dataContentType;
        return this;
    }

    /**
     * Get dataContentType
     *
     * @return dataContentType
     */


    @JsonProperty("dataContentType")
    public String getDataContentType() {
        return dataContentType;
    }

    public void setDataContentType(String dataContentType) {
        this.dataContentType = dataContentType;
    }

    public GlobalEventAttributes publisher(String publisher) {
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

    public GlobalEventAttributes sourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }

    /**
     * Get sourceSystem
     *
     * @return sourceSystem
     */


    @JsonProperty("sourceSystem")
    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalEventAttributes globalEventAttributes = (GlobalEventAttributes) o;
        return Objects.equals(this.messageId, globalEventAttributes.messageId) &&
                Objects.equals(this.eventType, globalEventAttributes.eventType) &&
                Objects.equals(this.entityId, globalEventAttributes.entityId) &&
                Objects.equals(this.owningEntity, globalEventAttributes.owningEntity) &&
                Objects.equals(this.entityType, globalEventAttributes.entityType) &&
                Objects.equals(this.specsVersion, globalEventAttributes.specsVersion) &&
                Objects.equals(this.creationTime, globalEventAttributes.creationTime) &&
                Objects.equals(this.dataContentType, globalEventAttributes.dataContentType) &&
                Objects.equals(this.publisher, globalEventAttributes.publisher) &&
                Objects.equals(this.sourceSystem, globalEventAttributes.sourceSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, eventType, entityId, owningEntity, entityType, specsVersion, creationTime, dataContentType, publisher, sourceSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalEventAttributes {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    owningEntity: ").append(toIndentedString(owningEntity)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    specsVersion: ").append(toIndentedString(specsVersion)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    dataContentType: ").append(toIndentedString(dataContentType)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
        sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
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

