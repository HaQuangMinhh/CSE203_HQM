import java.util.ArrayList;
import java.util.List;

public class Order {

    private int Id ; 
    private List<String> Item  ; 
    private double TotalAmount ; 
    private String Status ;
    

    public Order(int id, double totalAmount ) {
        Id = id;
        Item = new ArrayList<>();
        TotalAmount = totalAmount;
        Status = "Pending";
    }

    public void addItem ( String item  ) {
        Item.add(item) ;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public List<String> getItem() {
        return Item;
    }
    public void setItem(List<String> item) {
        Item = item;
    }
    public double getTotalAmount() {
        return TotalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        TotalAmount = totalAmount;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    

    

    


}
