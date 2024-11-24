import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5Main {


    public static void main(String[] args) {
        // String message = "Hello Word Hello Word 123 456 123" ; 

        // String[] result = message.split(" ");
        
        Map<String, Integer> heheMap = new HashMap<>(); 
        
        // for ( var show : result ) {
        //     if ( heheMap.containsKey(show) ) {
        //         int newCount = heheMap.get(show) + 1 ;  

        //         heheMap.put(show, newCount); 

        //     } else {
        //         heheMap.put(show, 1);
        //     }
        // }
        System.out.println("--------------------------------------------");
        // for ( var keyValue : heheMap.entrySet()  ) {
        //     System.out.println(keyValue.getKey()+ " " +  keyValue.getValue());
        // }



        try {
            // Tên file đầu vào  --> tạo đối tượng để đọc file 
            String inputContent = "Test.txt";
            File inputFile = new File(inputContent);
            
            // Tạo đối tượng Scanner để đọc
            Scanner inputScanner = new Scanner(inputFile);
            
            while ( inputScanner.hasNext() ) {
                String currentLine = inputScanner.nextLine() ;
                String[] result1 = currentLine.split(" ");

                for ( var show : result1 ) {
                    if ( heheMap.containsKey(show) ) {
                        int newCount = heheMap.get(show) + 1 ;  
        
                        heheMap.put(show, newCount); 
        
                    } else {
                        heheMap.put(show, 1);
                    }
                }
            }

            inputScanner.close();

        } catch (IOException a) {
            System.out.println( "Có lỗi : " + a);
        }
        
        for ( var keyValue : heheMap.entrySet()  ) {
            System.out.println(keyValue.getKey()+ " " +  keyValue.getValue());
        }


    
    }

}
