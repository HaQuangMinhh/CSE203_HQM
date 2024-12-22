import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    List<Item> items = new ArrayList<>();

    public void addItem ( Item item  ) {
        items.add(item);
    }

    public void updateItem (String itemName, int newQuantity) {

        for ( Item item : items ) {

            if ( item.getName().equalsIgnoreCase( itemName ) ) {
                item.setQuantity(newQuantity);
                System.out.println("Item updated successfully");
                return ; 
            } 
        }
        System.out.println("Don't have this item in list to update");

    }

    public void removeItem ( String itemName ) {
        boolean flags = false ; 

        for ( Item item : items ) {

            if ( item.getName().equals(itemName) ) {
                items.remove(item);
                flags = true ; 
                System.out.println("Item removed successfully");
                break ; 
            }
        }

        if ( !flags ) {
            System.out.println("item not found: " + itemName);
        }
    }

    public Item GetItem (String itemName) {

        for ( Item item : items ) {
            if ( item.getName().equalsIgnoreCase(itemName) ) {
                System.out.println("Item found successfully");
                return item ; 
            }
        }
        return null ; 
    }

    // Save to file 
    public void SaveToFile (String filePath , List<Item> items ) {
        
        try {
            FileWriter writer = new FileWriter(filePath, false); 

            for ( Item item : items ) {
                writer.write(item.getDescription1());
                writer.write("\n");
            }
            System.out.println("Save new data into: " + filePath);

            writer.close();

        } catch ( IOException e ) {
            System.out.println("Error save to File r cha" + e );
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
