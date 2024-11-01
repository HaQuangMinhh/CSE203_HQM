import java.util.Random;

public class Dice {

    Random random = new Random();
    private int Sides ;
    private int Value ;
    
    public Dice(int sides) {
        Sides = sides;
    }

    // random xong + 1 . tròn 6 
    public void Roll() {
        int result = random.nextInt(Sides) + 1 ;
        Value = result ; 
    }

    // Getter
    public int getSides() {
        return Sides;
    }
    public int getValue() {
        return Value;
    } 
    
    

}
