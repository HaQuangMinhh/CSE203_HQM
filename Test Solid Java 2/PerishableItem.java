import java.time.LocalDate;

public class PerishableItem extends Item {
    // Mặt hàng dễ bị hư hỏng 
    private LocalDate ExpiryDate ;

    public PerishableItem(String name, int quantity, Float price, LocalDate expiryDate) {
        super(name, quantity, price);
        
        // Exception handling : Kiểm tra ngày hết hạn  
        if ( expiryDate.isBefore(LocalDate.now() ) ) {
            throw new ValidationLogic("Expiry Date must be a future date"); 
        }
        
        ExpiryDate = expiryDate;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: " + getName() + ", Quantity: " + getQuantity() + ", Price: " + getPrice() + ", Expiry Date: " + ExpiryDate );
    }

    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        ExpiryDate = expiryDate;
    } 


}
