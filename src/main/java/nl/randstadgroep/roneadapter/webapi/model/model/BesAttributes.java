package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * BesAttributes
 */


public class BesAttributes {

    private String eventType;

    private String entityType;

    private String entityId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationTime;

    private String owningEntity;

    public BesAttributes eventType(String eventType) {
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

    public BesAttributes entityType(String entityType) {
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

    public BesAttributes entityId(String entityId) {
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

    public BesAttributes creationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get creationTime
     *
     * @return creationTime
     */


    @JsonProperty("creationTime")
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public BesAttributes owningEntity(String owningEntity) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BesAttributes besAttributes = (BesAttributes) o;
        return Objects.equals(this.eventType, besAttributes.eventType) &&
                Objects.equals(this.entityType, besAttributes.entityType) &&
                Objects.equals(this.entityId, besAttributes.entityId) &&
                Objects.equals(this.creationTime, besAttributes.creationTime) &&
                Objects.equals(this.owningEntity, besAttributes.owningEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, entityType, entityId, creationTime, owningEntity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BesAttributes {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    owningEntity: ").append(toIndentedString(owningEntity)).append("\n");
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

