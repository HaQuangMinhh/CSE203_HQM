import java.util.Scanner;

public class Program2 {
    

    // Case 2 : Running until any player = 1 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice(6); 
        
        Player player1 = new Player("Minh");
        Player player2 = new Player("Duy");

        // flag
        boolean gameWon = false ; 
        int round = 1 ; 

        while(!gameWon ) {

            System.out.println("Round: " + round);

            //---------------------Player 1 
            int currentPoint = player1.getPoint(); 
            System.out.println(player1.getName() +  " with the remaining point: "+ currentPoint);
            
            dice.Roll(); // Roll 
            // Show point đã lăn được 
            System.out.println("Rolling with the point: "+ dice.getValue());

            player1.CalculatePoint(dice.getValue()); // Calculate

            System.out.println("After Rolling, with the point: " + player1.getPoint() );
            System.out.println("=================================================");

            // bằng 1 thì out 
            if ( player1.getPoint() == 1 ) {
                gameWon = true ; 
                continue ; 
            }


            //------------------------ Player 2 
            currentPoint = player2.getPoint();
            System.out.println( player2.getName() +" with the remaining point: " + currentPoint);

            dice.Roll(); // Roll
            // show point đã lăn ra
            System.out.println("Rolling with the point: " + dice.getValue());

            player2.CalculatePoint(dice.getValue( ) ); // Calculate

            System.out.println("After rolling, with the point: " + player2.getPoint());
            System.out.println("===================================================");

            // bằng 1 thì out 
            if (player2.getPoint() == 1) {
                gameWon = true; 
            }

            // increase the round 
            round++;
        }

        

        int pointPlayer1 = player1.getPoint();
        int pointPlayer2 = player2.getPoint();

        if ( pointPlayer1 < pointPlayer2  ) {
            System.out.println( player1.getName() + " has won ");
        } else if ( pointPlayer2 < pointPlayer1 )  {
            System.out.println( player2.getName() + " has won" );
        } else {
            System.out.println( " Both are equal ");
        }

    }


}
