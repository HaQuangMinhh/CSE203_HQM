
import java.util.Objects;

public class Instructor {

    private String LastName;
    private String FirstName;
    private String OfficeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.OfficeNumber = officeNumber;
    }

    // Use Equal method
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getOfficeNumber() {
        return OfficeNumber;
    }

    public void setOfficeNumber(String OfficeNumber) {
        this.OfficeNumber = OfficeNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.LastName);
        hash = 59 * hash + Objects.hashCode(this.FirstName);
        hash = 59 * hash + Objects.hashCode(this.OfficeNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instructor other = (Instructor) obj;
        if (!Objects.equals(this.LastName, other.LastName)) {
            return false;
        }
        if (!Objects.equals(this.FirstName, other.FirstName)) {
            return false;
        }
        return Objects.equals(this.OfficeNumber, other.OfficeNumber);
    }

}
