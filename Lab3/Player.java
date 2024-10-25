public class Player {

    private String name ; 
    private int point ; 
    private Die die ;  // mô phỏng xúc xăc lăn 
    
    // Constructor
    public Player(String name , int sidesOfDie) {
        this.name = name;
        this.point = 50 ; // user dc 50 điểm
        this.die = new Die(sidesOfDie); 

    }

    // Lăn xúc xắc +  cập nhật điểm số 
    public void rollDie() {
        die.roll(); // lăn xúc xắc

        int diceValue = die.getValue(); // Lấy giá trị 
        System.out.println(name + " roll " + diceValue ); // show ra

        // Check condition if < 1
        // Đảm bảo user only win khi = 1
        if ( point - diceValue < 1  ) {
            point += diceValue ; 
            System.out.println(name + point + " can't subtract");
        
        }    else {
            point -= diceValue ; 
            System.out.println(name + " has " + point );
        }
    }

    // Check user == 1 => win 
    public boolean hasWon() {
        return point == 1 ; 
    }

    // Getter name 
    public String getName() {
        return name;
    }

    // lấy điểm ra 
    public int getPoint() {
        return point;
    }
    
    
    


    


}
