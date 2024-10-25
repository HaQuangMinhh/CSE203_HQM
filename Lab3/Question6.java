
import java.util.*;

public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Use Die class
        Die die6Slides = new Die(6);   // create xúc xắc 6 mặt 
        System.out.println("Rolling a 6-slide dive :");

        for ( int i = 0 ; i < 5 ; i++ ) {
            die6Slides.roll();
            System.out.println("Roll " + (i + 1) + ": " + die6Slides.getValue());
        }
    }

}
