
import java.util.Random;

public class Die {

    Random rd = new Random();

    private int sides;
    private int value;

    // Constructor 
    public Die(int sides) {
        this.sides = sides;
        roll(); // Lăn khi khởi tạo 
    }

    // Getter
    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

    public static void roll() {
        int valueRoll =   
    }
}
