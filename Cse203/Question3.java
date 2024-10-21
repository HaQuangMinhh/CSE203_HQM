
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double circle = Area.CalculateArea(5.4);
        double rectangle = Area.CalculateArea(8.4, 5);
        double cylinder = Area.CalculateArea(4.5, 5.2);

        System.out.println("Area of a circle = " + circle);
        System.out.println("Area of a rectangle = " + rectangle);
        System.out.println("Area of a cylinder = " + cylinder);

    }

}
