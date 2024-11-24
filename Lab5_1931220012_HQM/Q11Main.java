import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q11Main {

    public static void main(String[] args) {
        
        // Convert MinhContent2 to MinhContent3 ( original )

        try {
            // Tên file đầu ra 
            String outputContent = "MinhContent3.txt" ; 

            // Create đối tượng để ghi vào file 
            FileWriter writer = new FileWriter(outputContent) ; 
            // Tên file đầu vào  --> Tạo đối tượng 
            String inputContent = "MinhContent2.txt" ; 
            File inputFile = new File(inputContent);

            Scanner inputScanner = new Scanner(inputFile);
            while ( inputScanner.hasNext() ) {
                String currentLine = inputScanner.nextLine() ; 
                String encryption = "";

                // Core : Mã hoá 
                for ( int i = 0 ; i < currentLine.length() ; i++ ) {
                    encryption += (char) (currentLine.charAt(i) - 10) ; 
                }

                // chuyển vào file đầu ra 
                writer.write(encryption + System.lineSeparator());
            }
            inputScanner.close();
            writer.close();


        } catch ( IOException a )  {
            System.out.println( "Co loi kia " + a.getMessage() );
        }


    }
}
