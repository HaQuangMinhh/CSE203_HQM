import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q10Main {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String input = scanner.nextLine();

        // System.out.println("Characters in the string:");
        // for (int i = 0; i < input.length(); i++) {
        //     System.out.println(input.charAt(i));
        // }


        try {
            // Tên file đầu ra 
            String outputContent = "MinhContent2.txt";
            
            // Tạo đối tượng FileWriter để ghi vào file 
            FileWriter writer = new FileWriter(outputContent);
            
            // Tên file đầu vào  --> tạo đối tượng để đọc file 
            String inputContent = "MinhContent.txt";
            File inputFile = new File(inputContent);
            
            // Tạo đối tượng Scanner để đọc
            Scanner inputScanner = new Scanner(inputFile);
            
            while ( inputScanner.hasNext() ) {
                String currentLine = inputScanner.nextLine() ;
                String encryption = ""; // Chuỗi chứa nội dung mã hoá

                // Mã hoá 
                for ( int i = 0 ; i < currentLine.length() ; i++  ) {
                    encryption += (char) (currentLine.charAt(i) + 10) ; 
                }

                // Chuyển vào file đầu ra 
                writer.write(encryption + System.lineSeparator());
            }

            inputScanner.close();
            writer.close();

        } catch (IOException a) {
            System.out.println( "Có lỗi : " + a);
        }


        // Ghi thêm content
        
        // Đầu ra
        // var outputContent2 = "MinhContent2.txt" ; 

        // try ( FileWriter writer = new FileWriter( outputContent2 , true)) {
        //     writer.write("John Henry");
        //     writer.write("This is my name: Minh vip pro ");
            
            
        //     System.out.println("successfully to file: " + outputContent2 );
        // } catch ( IOException a ) {
        //     System.out.println("Có lỗi r: " + a);

        // }

        



    }
}
