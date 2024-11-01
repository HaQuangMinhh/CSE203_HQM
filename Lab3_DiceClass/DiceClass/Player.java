public class Player {

    private String Name ;
    private int Point ;  // Điểm gốc 
    // Dice dice ; 

    public String getName() {
        return Name;
    }

    public Player(String name) {
        Name = name;
        Point = 10 ; 
    } 

    // remaining point không cho bằng 1
    public void CalculatePoint( int valuePoint ) {
        if ( Point - valuePoint < 1 ) {
            Point += valuePoint ; 
        } else {
            Point -= valuePoint ; 
        }

    }

    public int getPoint() {
        return Point;
    }

   
    


}
