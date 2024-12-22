import java.time.LocalDate;


public class PerishableItem extends Item {

    private LocalDate ExpiryDate ;

    
    public PerishableItem(String name, int quantity, float price, LocalDate expiryDate) {
        super(name, quantity, price);
        
        if ( expiryDate.isBefore(LocalDate.now() ) ) {
            throw new ValidationLogic("Expiry Date must be a future date");
        }
        
        ExpiryDate = expiryDate;
    }

    public void getDescription() {
        System.out.println("Name: " + getName() + ", Quantity: " + getQuantity() + ", Price: " + getPrice() + ", Expiry Date: " + ExpiryDate  );
    }

    public String getDescription1() {
        return "Name: " + getName() + ", Quantity: " + getQuantity() + ", Price: " + getPrice() + ", Expiry Date: " + ExpiryDate ;
    }

    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        ExpiryDate = expiryDate;
    } 

    
}
