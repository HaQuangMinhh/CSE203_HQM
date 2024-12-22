import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    // Quản lý hàng tồn kho 

    private List<Item> items = new ArrayList<>() ; 

    public void AddItem ( Item item ) {
        items.add(item);
    }


    public void UpdateItem ( String itemName , int newQuantity ) {
        for ( Item item : items) {
            if ( item.getName().equalsIgnoreCase( itemName )  ) {
                item.setQuantity(newQuantity);
                return ; 
            }
        }
        System.out.println("Item not found: " + itemName);

    }

    public void RemoveItem ( String itemName ) {
        boolean flags = false ; 

        for ( Item item : items ) {
            if ( item.getName().equalsIgnoreCase(itemName) ) {
                items.remove(item); 
                System.out.println("removed successfully: " + itemName);
                flags = true ; 
                break ; 
            }
        }

        // không có 
        if ( !flags ) {
            System.out.println("Item not found: " + itemName );
        }
    }

    public Item GetItem ( String itemName  ) {
        for ( Item item : items ) {
            if ( item.getName().equalsIgnoreCase(itemName) ) {
                return item ; 
            }
        }
        return null ; 
    }

    public void saveToFile ( String filePath ) {
        try {
            String output = "data2.txt"; 
            FileWriter writer = new FileWriter(output ,false);

            writer.write("Inventory List: \n" );

            for ( Item item : items  ) {
                writer.write( item.getDescription1() + "\n" ) ;
            }
            System.out.println("Inventory successfully saved to " + filePath);

            writer.close();

        } catch ( IOException e) {
            System.out.println("Error saving r kia r" + e );
        }

    }

    public List<Item> getAllItems() {
        return items ;
    }

    public List<Item> getItems() {
        return items;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }

}
