import java.util.Scanner;

public class MainEssay {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Essay essay = new Essay() ; 
        
        boolean result = essay.Grade(20, 10, 10, 25); 
        
        if (result == true ) {
            System.out.println("Your Grade: " + essay.getGrade());
        } else {
            System.out.println("Wrong");
        }
        


    }

}
