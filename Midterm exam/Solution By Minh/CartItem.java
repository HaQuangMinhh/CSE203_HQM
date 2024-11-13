package Solution;

public class CartItem {
    
    private RetailItem retailItem ; 
    private int Quantity ;
    
    
    public CartItem(RetailItem retailItem, int quantity) {
        this.retailItem = retailItem;
        Quantity = quantity;
    }

    public boolean compareTwoItem ( CartItem anotherItem ) {
        return retailItem.equals(anotherItem.getRetailItem());
    }

    public String getTotalPrice() {
        double total = Quantity * retailItem.getPrice() ; 
        String temp = "";
        temp += retailItem.getName() +", " + retailItem.getPrice() +", Quantity: " + Quantity +", Total Price: " + total ;  
        
        return temp ; 
    }
    public double getTotalPrice1() {
        double total = Quantity * retailItem.getPrice() ; 
        return total ; 
    }


    public RetailItem getRetailItem() {
        return retailItem;
    }
    public void setRetailItem(RetailItem retailItem) {
        this.retailItem = retailItem;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public void getInfor() {
        String temp = ""; 
        temp += getTotalPrice()  ; 
        System.out.println(temp);
    }

    // retailItem.getName() +", " + retailItem.getPrice()+ ", Quantity "+ Quantity +", Total: " +

    

}
