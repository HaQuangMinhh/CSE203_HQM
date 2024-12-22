
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Item laptop = new Item("Laptop", 15,(float) 50000000);
        Item phone = new Item("Phone", 10, (float) 6900000); 

        // PerishableItem 
        Item milk = new PerishableItem("Milk", 5, (float) 50000, LocalDate.of(2024, 12, 30)); 

        Item rice = new NonPerishableItem("Rice", 20, (float) 30000 ); 

        Item bulkSugar = new BulkItem("Sugar", 50, (float) 90000000, 50 ) ; 

        bulkSugar.getDescription();
        milk.getDescription();

        System.out.println("-------------------------------------------");

        System.out.println("--------------Part 2 ------------------------");

        List<Item> items = new ArrayList<>();           // Array đây nè
        items.add(rice) ; // nonPerishableItem 
        items.add(milk); // perishable Item 
 
        FileInventoryRepository repository = new FileInventoryRepository(); 

        // Save from items.add to File 
        String filepath = "database.txt" ; 
        repository.saveToFile(filepath, items);

        
        // Gọi phương thức :  Load From File to List USer
        items = repository.loadFromFile(filepath) ; 

        for ( Item item : items  ) {
            item.getDescription() ; 
        }
        
        System.out.println("--------------Part 2.3 ------------------------");


        // Inventory Management 
        InventoryManager inventoryManager = new InventoryManager() ; 

        inventoryManager.setItems(items);
        
        inventoryManager.AddItem(laptop);
        inventoryManager.AddItem(phone);

        // update item  ( Đúng )
        inventoryManager.UpdateItem("Laptop", 50);
        inventoryManager.UpdateItem("Rice", 10);

        // update item ( Sai )
        inventoryManager.UpdateItem("snack", 500);

        // remove ( Đúng )
        // inventoryManager.RemoveItem("Phone");


        // Get name 
        Item check =  inventoryManager.GetItem("Laptop");
        if ( check != null ) {
            System.out.println("Get name successfully: ");
            check.getDescription();
        }

        // In ra toàn bộ danh sách items hiện tại
        System.out.println("-------------Items-----------------------");
        for ( Item item : inventoryManager.getAllItems() ) {
            item.getDescription();
        }

        // Lưu dữ liệu ra file 
        String filePath = "data2.txt";
        inventoryManager.saveToFile(filePath);
        

        



        


    }

}
