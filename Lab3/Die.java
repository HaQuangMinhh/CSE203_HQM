
import java.util.Random;

public class Die {

    Random rd = new Random(); 

    private int sides; // số mặt 
    private int value; // Giá trị của xúc xắc 

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

    // lăn xúc xắc, giá trị dc random
    public void roll() {
        this.value = rd.nextInt(sides) +1 ;  
    }
}
