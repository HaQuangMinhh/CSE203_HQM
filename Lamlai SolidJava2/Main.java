
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        
        Item laptop = new Item("Laptop", 15, 500000); 
        Item phone = new Item("Phone", 15, 600000); 

        laptop.getDescription();
        System.out.println("-------------------Part 2----------------------");

        PerishableItem fan = new PerishableItem("Fan", 15, 500, LocalDate.of(2024, 12, 20));

        NonPerishableItem bottle = new NonPerishableItem("Bottle", 15, 200); 

        List<Item> items = new ArrayList<>(); 
        items.add(fan);
        items.add(bottle);

        FileInventoryRepository repository = new FileInventoryRepository(); 

        // Save to File
        String filePath = "database.txt";

        // repository.SaveToFile(filePath, items);

        // Load From File to here
        repository.LoadFromFile(filePath); 

        for ( Item item : items ) {
            item.getDescription();
        }

        System.out.println("-------------------Part 3----------------------");
        InventoryManager inventoryManager = new InventoryManager(); 
        inventoryManager.setItems(items);

        inventoryManager.addItem(phone);
        

        inventoryManager.removeItem("phone"); // ghi sai 

        inventoryManager.updateItem("Fan", 50); // right

        // GEt name 
        Item check = inventoryManager.GetItem("Bottle");
        if ( check != null ) {
            System.out.println("Get successful name");
            check.getDescription();
        } else {
            System.out.println("Dont have this name in List");
        }

        // Show ra 
        System.out.println("-------------------Data change----------------------");
        for ( Item item : inventoryManager.getItems() ) {
            item.getDescription();
        }

        // Save data into filePath 
        String filePath2 = "data2.txt" ; 
        inventoryManager.SaveToFile(filePath2, items);


    }

}
