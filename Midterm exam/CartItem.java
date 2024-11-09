public class CartItem {

    private RetailItem item ; 
    private int Quantity ;
    

    public CartItem(RetailItem item, int quantity) {
        this.item = item;
        Quantity = quantity;
    }

    // Equals 
    public boolean CompareTwoItemCart (CartItem cartItem) {
        return this.item.equals(cartItem.item);
    }


    // Get total Price 
    public double getTotalPrice() {
        return Quantity * item.getPrice() ; 
    }


    @Override
    public String toString() {
        return "Name: " + item.getName() + ", Price: " + item.getPrice() + ", Quantity: " + Quantity + ", Total Price: " + getTotalPrice() + "\n" ;
    }  



    // Getter and Setter 
    public RetailItem getItem() {
        return item;
    }
    public void setItem(RetailItem item) {
        this.item = item;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
  
}
