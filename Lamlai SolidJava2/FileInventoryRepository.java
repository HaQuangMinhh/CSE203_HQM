import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInventoryRepository implements IIventoryRepository {

    // Create a list 
    List<Item> listItem = new ArrayList<>();

    @Override
    public List<Item> LoadFromFile(String filePath) {
        
        try {
            File inputFile = new File(filePath);
            Scanner inputScanner = new Scanner(inputFile); 

            while ( inputScanner.hasNext() ) {
                String currentLine = inputScanner.nextLine(); 

                String[] result = currentLine.split("\\|"); 

                String type = result[0].trim() ; 
                String name = result[1].trim() ; 
                int quantity = Integer.parseInt(result[2].trim()) ; 
                float price = Float.parseFloat(result[3].trim()) ; 
                

                // Dựa vào định dạng để lấy lên
                if ( "PerishableItem".equals(type)  ) {

                    LocalDate date = LocalDate.parse(result[4].trim()) ; 
                    PerishableItem perishableItem = new PerishableItem(name, quantity, price, date) ;

                    listItem.add(perishableItem);
                } else if ("NonPerishableItem".equals(type)) {

                    NonPerishableItem nonPerishableItem = new NonPerishableItem(name, quantity, price) ; 

                    listItem.add(nonPerishableItem);
                } else {
                    System.out.println("Users input Wrong");
                }
            }
            System.out.println("Users load data successfully from " + filePath);

            inputScanner.close();
        } catch ( FileNotFoundException a ) {
            System.out.println("Error file not found: " + filePath);
        } catch ( @SuppressWarnings("hiding") IOException e ) {
            System.out.println( "Error load from File r kia cha" + e );
        }

        return listItem;
    }

    
    
    
    @Override
    public void SaveToFile(String filePath, List<Item> items) {
        
        try {
            FileWriter writer = new FileWriter(filePath , false);
            
            // core 
            for ( Item item : items ) {

                if ( item instanceof PerishableItem ) {
                    PerishableItem perishableItem = (PerishableItem) item ; 

                    writer.write("PerishableItem" +"|" + perishableItem.getName() + "|" + perishableItem.getQuantity() +"|" + perishableItem.getPrice() + "|" + perishableItem.getExpiryDate());

                    writer.write("\n");

                } else if ( item instanceof NonPerishableItem ) {
                    NonPerishableItem nonPerishableItem = (NonPerishableItem) item ; 

                    writer.write("NonPerishableItem" + "|" + nonPerishableItem.getName() + "|" + nonPerishableItem.getQuantity() + "|" + nonPerishableItem.getPrice() ) ; 

                    writer.write("\n");

                } else {
                    System.out.println("Users input wrong");
                }
            }
            System.out.println("Users save data to file successfully");        

            writer.close();
        } catch ( IOException e ) {
            System.out.println("Error Save to File r kia " +  e);
        }
        
    }




    public List<Item> getListItem() {
        return listItem;
    }




    public void setListItem(List<Item> listItem) {
        this.listItem = listItem;
    } 

}
