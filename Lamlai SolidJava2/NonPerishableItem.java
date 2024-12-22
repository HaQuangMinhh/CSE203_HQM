
public class NonPerishableItem extends Item {
 
    
    public NonPerishableItem(String name, int quantity, float price) {
        super(name, quantity, price);
    }

    
    public void getDescription() {
        System.out.println("Name: " + getName() + ", Quantity: " + getQuantity() + ", Price: " + getPrice() );
    }

    public String getDescription1() {
        return "Name: " + getName() + ", Quantity: " + getQuantity() + ", Price: " + getPrice() ;
    }
}
