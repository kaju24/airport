package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Resume
 */


public class Resume {

    private String fileText;

    private String filename;

    public Resume fileText(String fileText) {
        this.fileText = fileText;
        return this;
    }

    /**
     * Get fileText
     *
     * @return fileText
     */


    @JsonProperty("fileText")
    public String getFileText() {
        return fileText;
    }

    public void setFileText(String fileText) {
        this.fileText = fileText;
    }

    public Resume filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get filename
     *
     * @return filename
     */


    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resume resume = (Resume) o;
        return Objects.equals(this.fileText, resume.fileText) &&
                Objects.equals(this.filename, resume.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileText, filename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resume {\n");
        sb.append("    fileText: ").append(toIndentedString(fileText)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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

