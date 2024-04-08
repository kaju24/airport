package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LookUpCocsByMndCompNumbersRequest
 */

@JsonTypeName("lookUpCocsByMndCompNumbers_request")

public class LookUpCocsByMndCompNumbersRequest {


    private List<String> mndCompNumbers;

    public LookUpCocsByMndCompNumbersRequest mndCompNumbers(List<String> mndCompNumbers) {
        this.mndCompNumbers = mndCompNumbers;
        return this;
    }

    public LookUpCocsByMndCompNumbersRequest addMndCompNumbersItem(String mndCompNumbersItem) {
        if (this.mndCompNumbers == null) {
            this.mndCompNumbers = new ArrayList<>();
        }
        this.mndCompNumbers.add(mndCompNumbersItem);
        return this;
    }

    /**
     * Get mndCompNumbers
     *
     * @return mndCompNumbers
     */


    @JsonProperty("mndCompNumbers")
    public List<String> getMndCompNumbers() {
        return mndCompNumbers;
    }

    public void setMndCompNumbers(List<String> mndCompNumbers) {
        this.mndCompNumbers = mndCompNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LookUpCocsByMndCompNumbersRequest lookUpCocsByMndCompNumbersRequest = (LookUpCocsByMndCompNumbersRequest) o;
        return Objects.equals(this.mndCompNumbers, lookUpCocsByMndCompNumbersRequest.mndCompNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mndCompNumbers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LookUpCocsByMndCompNumbersRequest {\n");
        sb.append("    mndCompNumbers: ").append(toIndentedString(mndCompNumbers)).append("\n");
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

