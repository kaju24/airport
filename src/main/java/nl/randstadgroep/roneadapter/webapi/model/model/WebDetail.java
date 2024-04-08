package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WebDetail
 */


public class WebDetail {

    private String webDetailId;

    private String postedUrl;

    private String localSystem;

    private String localJobId;

    private String groupId;

    private WebDetailStatus webDetailStatus;

    public WebDetail webDetailId(String webDetailId) {
        this.webDetailId = webDetailId;
        return this;
    }

    /**
     * Get webDetailId
     *
     * @return webDetailId
     */


    @JsonProperty("webDetailId")
    public String getWebDetailId() {
        return webDetailId;
    }

    public void setWebDetailId(String webDetailId) {
        this.webDetailId = webDetailId;
    }

    public WebDetail postedUrl(String postedUrl) {
        this.postedUrl = postedUrl;
        return this;
    }

    /**
     * Get postedUrl
     *
     * @return postedUrl
     */


    @JsonProperty("postedUrl")
    public String getPostedUrl() {
        return postedUrl;
    }

    public void setPostedUrl(String postedUrl) {
        this.postedUrl = postedUrl;
    }

    public WebDetail localSystem(String localSystem) {
        this.localSystem = localSystem;
        return this;
    }

    /**
     * Get localSystem
     *
     * @return localSystem
     */


    @JsonProperty("localSystem")
    public String getLocalSystem() {
        return localSystem;
    }

    public void setLocalSystem(String localSystem) {
        this.localSystem = localSystem;
    }

    public WebDetail localJobId(String localJobId) {
        this.localJobId = localJobId;
        return this;
    }

    /**
     * Get localJobId
     *
     * @return localJobId
     */


    @JsonProperty("localJobId")
    public String getLocalJobId() {
        return localJobId;
    }

    public void setLocalJobId(String localJobId) {
        this.localJobId = localJobId;
    }

    public WebDetail groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get groupId
     *
     * @return groupId
     */


    @JsonProperty("groupId")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WebDetail webDetailStatus(WebDetailStatus webDetailStatus) {
        this.webDetailStatus = webDetailStatus;
        return this;
    }

    /**
     * Get webDetailStatus
     *
     * @return webDetailStatus
     */


    @JsonProperty("webDetailStatus")
    public WebDetailStatus getWebDetailStatus() {
        return webDetailStatus;
    }

    public void setWebDetailStatus(WebDetailStatus webDetailStatus) {
        this.webDetailStatus = webDetailStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebDetail webDetail = (WebDetail) o;
        return Objects.equals(this.webDetailId, webDetail.webDetailId) &&
                Objects.equals(this.postedUrl, webDetail.postedUrl) &&
                Objects.equals(this.localSystem, webDetail.localSystem) &&
                Objects.equals(this.localJobId, webDetail.localJobId) &&
                Objects.equals(this.groupId, webDetail.groupId) &&
                Objects.equals(this.webDetailStatus, webDetail.webDetailStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webDetailId, postedUrl, localSystem, localJobId, groupId, webDetailStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebDetail {\n");
        sb.append("    webDetailId: ").append(toIndentedString(webDetailId)).append("\n");
        sb.append("    postedUrl: ").append(toIndentedString(postedUrl)).append("\n");
        sb.append("    localSystem: ").append(toIndentedString(localSystem)).append("\n");
        sb.append("    localJobId: ").append(toIndentedString(localJobId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    webDetailStatus: ").append(toIndentedString(webDetailStatus)).append("\n");
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

