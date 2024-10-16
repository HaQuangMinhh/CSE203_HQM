package Lab2.Problem1;

public class Customer {

    private String name; 
    private String address; 
    private String phone;
    
    
    // Constructor
    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // Getter and Setter 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
 

    public String toString() {
        return "Customer name: " + name + "\nAddress: " + address +
        "\nPhone Number: " + phone ;

    }
}
