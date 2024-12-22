import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        
        // Create list : products 
        Products product1 = new Products ("P001", "Laptop", "Electronics", 800);
        Products product2 = new Products ("P002", "Mouse", "Accessories", 20);
        Products product3 = new Products ("P003", "Keyboard", "Accessories", 50);

        // create suppliers 
        Suppliers supplier1 = new Suppliers("S1", "Tech supplies", 5, 3); 
        Suppliers supplier2 = new Suppliers("S2", "Access supplier" , 4, 5);

        // Danh sách nhà cung cấp 
        List<Suppliers> suppliers = Arrays.asList(supplier1, supplier2); 


        // Create : Order 
        Orders order = new Orders(); 
        order.addItem(product1, 50);
        order.addItem(product2, 300);


    }



}
