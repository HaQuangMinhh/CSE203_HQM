public class Instructor {

    private String FirstName; 
    private String LastName ; 
    private int OfficeNumber ;
    

    public Instructor(String firstName, String lastName, int officeNumber) {
        FirstName = firstName;
        LastName = lastName;
        OfficeNumber = officeNumber;
    }
    
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public int getOfficeNumber() {
        return OfficeNumber;
    }
    public void setOfficeNumber(int officeNumber) {
        OfficeNumber = officeNumber;
    }
    
    
    
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
        result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
        result = prime * result + OfficeNumber;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Instructor other = (Instructor) obj;
        if (FirstName == null) {
            if (other.FirstName != null)
                return false;
        } else if (!FirstName.equals(other.FirstName))
            return false;
        if (LastName == null) {
            if (other.LastName != null)
                return false;
        } else if (!LastName.equals(other.LastName))
            return false;
        if (OfficeNumber != other.OfficeNumber)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Instructor Class: [FirstName= " + FirstName + ", LastName= " + LastName + ", OfficeNumber= " + OfficeNumber + "]";
    }
}
