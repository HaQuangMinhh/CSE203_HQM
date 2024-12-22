import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInventoryRepository implements IInventoryRepository  {

    // Create a List 
    List<Item> listItem = new ArrayList<>() ; 

    @Override
    public List<Item> loadFromFile(String filePath) {
        
        try {
            // Tên file đầu vào và read file để đẩy dữ liệu lên 
            File inputFile = new File(filePath) ;
            Scanner inputScanner = new Scanner(inputFile); 

            while ( inputScanner.hasNext() ) {
                String currentLine = inputScanner.nextLine(); 

                String[] result = currentLine.split("\\|"); 

                String type = result[0].trim(); 
                String name =  result[1].trim(); 
                int quantity = Integer.parseInt(result[2].trim()) ; 
                float price = Float.parseFloat(result[3].trim()) ; 

                // Dựa vào định dạng của chữ đầu tiên trong cái muốn show ra 
                if ( "PerishableItem".equals(type)) {
                    LocalDate date = LocalDate.parse(result[4].trim()); 
                    
                    PerishableItem perishableItem = new PerishableItem(name, quantity, price, date) ; 

                    listItem.add(perishableItem); 
                
                } else if ( "NonPerishableItem".equals(type)  ) {
                    NonPerishableItem nonPerishableItem = new NonPerishableItem(name, quantity, price) ; 

                    listItem.add(nonPerishableItem); 
                
                } else {
                    System.out.println("Users input Wrong");
                }
                
            }
            System.out.println("Load Users successfully");

            inputScanner.close();
        } catch ( FileNotFoundException a ) {
            System.out.println("Error: File not found :" + filePath);
        } catch ( @SuppressWarnings("hiding") IOException e ) {
            System.out.println("I/O error occurred while reading the file" + e );
        }

        return listItem ; 
    }

    @Override
    public void saveToFile(String filePath, List<Item> items) {
        
        try {
            // tên file đầu ra
            String output = "database.txt" ; 
            // Tạo đối tượng ghi vào file
            FileWriter writer = new FileWriter(output , false); 

            // Core : Ensure that each Item is serialized/deserialized into the appropriate subclass (PerishableItem, NonPerishableItem).

            for ( Item item : items ) {
                if ( item instanceof PerishableItem ) {
                    PerishableItem perishableItem = (PerishableItem) item ; 

                    writer.write(  "PerishableItem" + "|" + perishableItem.getName()+"|" + perishableItem.getQuantity() + "|" + perishableItem.getPrice()+ "|" + perishableItem.getExpiryDate() );
                    writer.write("\n");

                } else if ( item instanceof NonPerishableItem ) {
                    NonPerishableItem nonPerishableItem = (NonPerishableItem) item ; 

                    writer.write( "NonPerishableItem" + "|" + nonPerishableItem.getName()+"|" + nonPerishableItem.getQuantity() + "|" + nonPerishableItem.getPrice() ) ; 
                    writer.write("\n");
                }
                
            }

            writer.close();
        } catch ( IOException e ) {
            System.out.println("Error save To file roi kia cha " + e);
        }
        

        
    }

    



}
