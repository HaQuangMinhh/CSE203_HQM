
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<ShoppingItem> items;

    public ShoppingCart() {
        items = new ArrayList<>(); 
    }

    public void addItem ( ShoppingItem item ) {
        items.add(item);
    }

    public double calculateTotal() {
        var result = 0 ; 

        for ( ShoppingItem item : items  ) {
            result += item.getCost() ; 
        }
        return result ; 

    }

    public void pay ( IPaymentStrategy paymentStrategy ) {
        double total = calculateTotal() ; 
        paymentStrategy.pay(total);
    }




    public List<ShoppingItem> getItems() {
        return items;
    }

    public void setItems(List<ShoppingItem> items) {
        this.items = items;
    }
    

}
