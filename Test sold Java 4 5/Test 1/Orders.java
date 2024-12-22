import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<OrderItem> items ; 
    private String Status ;
    
    public Orders() {
        items = new ArrayList<>(); 
        Status = "Pending" ; 
    }

    public void addItem ( Products product, int quantity ) {
        items.add(new OrderItem(product, quantity));
    }



    public List<OrderItem> getItems() {
        return items;
    }
    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    } 
}
