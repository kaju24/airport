package nl.randstadgroep.roneadapter.webapi.model.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;

/**
 * PersonalDetails
 */


public class PersonalDetails {

    private String initials = null;

    private String firstName = null;

    private String infix = null;

    private String lastName;

    private Gender gender;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;

    public PersonalDetails initials(String initials) {
        this.initials = initials;
        return this;
    }

    /**
     * Get initials
     *
     * @return initials
     */


    @JsonProperty("initials")
    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public PersonalDetails firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     */


    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public PersonalDetails infix(String infix) {
        this.infix = infix;
        return this;
    }

    /**
     * Get infix
     *
     * @return infix
     */


    @JsonProperty("infix")
    public String getInfix() {
        return infix;
    }

    public void setInfix(String infix) {
        this.infix = infix;
    }

    public PersonalDetails lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     */


    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonalDetails gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get gender
     *
     * @return gender
     */


    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public PersonalDetails dateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * date of birth.
     *
     * @return dateOfBirth
     */


    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonalDetails personalDetails = (PersonalDetails) o;
        return Objects.equals(this.initials, personalDetails.initials) &&
                Objects.equals(this.firstName, personalDetails.firstName) &&
                Objects.equals(this.infix, personalDetails.infix) &&
                Objects.equals(this.lastName, personalDetails.lastName) &&
                Objects.equals(this.gender, personalDetails.gender) &&
                Objects.equals(this.dateOfBirth, personalDetails.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initials, firstName, infix, lastName, gender, dateOfBirth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonalDetails {\n");
        sb.append("    initials: ").append(toIndentedString(initials)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    infix: ").append(toIndentedString(infix)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

