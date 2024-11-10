public class Person {

    private String Name ; 
    private String Address ; 
    private String PhoneNumber ;
    
    
    
    public Person(String name, String address, String phoneNumber) {
        Name = name;
        Address = address;
        PhoneNumber = phoneNumber;
    }



    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    } 
}
