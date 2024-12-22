
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MainInput {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        IIventoryRepository repository = new FileInventoryRepository(); 
        InventoryManager inventoryManager = new InventoryManager();
        FileInventoryRepository repository2 = new FileInventoryRepository() ; 

        boolean canContinue = true ; 

        while ( canContinue ) {
            // Display the menu for user actions 
            System.out.println("Choose an option");
            System.out.println("1. Add new Item");
            System.out.println("2. Update Item quantity");
            System.out.println("3. Remove Item by name");
            System.out.println("4. View an item by name");
            System.out.println("5. View All Items");
            System.out.println("6. Save Inventory");
            System.out.println("7. Load Inventory from Txt file");
            
            System.out.println("8. Exit");

            var choice = sc.nextLine(); 

            switch (choice) {
                case "1":
                    addNewItem(repository, inventoryManager);
                    break ;
                case "2": 
                    updateItemQuantity(inventoryManager);
                    break; 
                case "3": 
                    removeItem(inventoryManager);
                    break;
                case "4": 
                    viewAnItem(inventoryManager);
                    break; 
                case "5": 
                    viewAllItems(inventoryManager) ;
                    break;
                case "6":
                    saveToFile(repository, inventoryManager);
                    break;
                case "7":
                    loadFromFile(repository, inventoryManager, repository2 );
                    break;
    
                case "8": 
                    System.out.println("Goodbye!");
                    
                    return ; 
                default:
                    System.out.println("Wrong input. Please input again");
        }
    }
    sc.close();
}

    public static void addNewItem ( IIventoryRepository repository , InventoryManager inventoryManager )  {
        System.out.println("Enter item type (PerishableItem/NonPerishableItem) :");
        String type = sc.nextLine();

        System.out.println("Enter Name: ");
        String name = sc.nextLine(); 

        System.out.println("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter price: ");
        Float price = Float.parseFloat(sc.nextLine()); 

        Item item ; 
        if ( type.equalsIgnoreCase("PerishableItem") ) {
            System.out.println( "Enter expiry date (yyyy-MM-dd): " );
            
            System.out.println("Input year");
            int year = Integer.parseInt(sc.nextLine()); 
            System.out.println("Input month");
            int month = Integer.parseInt(sc.nextLine()); 
            System.out.println("Input day");
            int day = Integer.parseInt(sc.nextLine()); 

            LocalDate date = LocalDate.of(year, month , day); 

            item = new PerishableItem(name, quantity, price, date) ;
            System.out.println("Added a new item successfully");
        } else {
            item = new NonPerishableItem(name, quantity, price) ;
            System.out.println("Added a new item successfully");
        }
        
        
        inventoryManager.addItem(item);
    }

    // Update item 
    public static void updateItemQuantity( InventoryManager inventoryManager )  {
        System.out.println("Enter item name to update");
        String itemName = sc.nextLine(); 

        System.out.println("Enter new quantity: ");
        int newQuantity = Integer.parseInt(sc.nextLine()) ; 
        // sc.next();

        inventoryManager.updateItem(itemName, newQuantity);
        
    }

    // Hàm remove 
    public static void removeItem(InventoryManager inventoryManager)  {
        System.out.println("Enter item name to remove");
        String itemName = sc.nextLine(); 

        inventoryManager.removeItem(itemName);
    }

    // hàm show all items
    public static void viewAllItems ( InventoryManager inventoryManager) {
        System.out.println("---------------Inventory items----------------------");
        for ( Item item : inventoryManager.getItems() ) {
            item.getDescription();
        }
    }


    public static void viewAnItem ( InventoryManager inventoryManager ) {
        System.out.println("You need to find an item in List");
        System.out.println("Input item name to find: ");
        String itemName = sc.nextLine();
        
        inventoryManager.GetItem(itemName);
        
    }

    public static void saveToFile(IIventoryRepository repository , InventoryManager inventoryManager )  {
        
        System.out.println("Enter file path to save: ");
        String filePath = sc.nextLine(); 

        repository.SaveToFile(filePath, inventoryManager.items );
        System.out.println("Inventory Saved successfully");
    }

    public static void loadFromFile( IIventoryRepository repository, InventoryManager inventoryManager, FileInventoryRepository repository2 ) {

        System.out.println("Enter file path to load");
        String filePath = sc.nextLine(); 

        List<Item> items = repository2.LoadFromFile(filePath) ;
        
        for ( Item item : items ) {
            item.getDescription();
            inventoryManager.addItem(item);
        }
        System.out.println("inventory loaded successfully");

    }


}
