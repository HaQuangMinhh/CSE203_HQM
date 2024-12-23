import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Nhap1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number: ");
        String inputLine = sc.nextLine() ; 

        String[] numbers = inputLine.split("\\s+"); 

        Set<Integer> uniqueNumbers = new HashSet<>();

        for ( var num : numbers ) {
            int number = Integer.parseInt(num);
            uniqueNumbers.add(number);
        }

        System.out.println(uniqueNumbers.size());

        for ( var num : uniqueNumbers ) {
            System.out.println(num);
        }

    }

}
