
public class Customer extends Person {

    private String CustomerNumber ;
    private boolean OnMalling ; 
    private Person person ;
    
    public Customer(String name, String address, String phoneNumber, String customerNumber, boolean onMalling ) {
        super(name, address, phoneNumber);
        CustomerNumber = customerNumber;
        OnMalling = onMalling ;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", address: " + getAddress() + ", Phone Number: " + getPhoneNumber() + ", Mailling List: " + OnMalling ;   
    }
    


    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        CustomerNumber = customerNumber;
    }

    public boolean isOnMalling() {
        return OnMalling;
    }

    public void setOnMalling(boolean onMalling) {
        OnMalling = onMalling;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }








    


    
}
