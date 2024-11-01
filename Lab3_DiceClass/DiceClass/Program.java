import java.util.Scanner;

public class Program {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice(6); 
        
        Player player1 = new Player("Minh");
        Player player2 = new Player("Duy");

        int round = 5 ; 
        for ( int i = 1 ; i <= round ; i++ ) { 
            System.out.println("Round: " + i  );

            //Player 1 
            int currentPoint = player1.getPoint(); 
            System.out.println(player1.getName() +  " with the remaining point: "+ currentPoint);
            
            dice.Roll(); // Roll 
            // Show point đã lăn được 
            System.out.println("Rolling with the point: "+ dice.getValue());

            player1.CalculatePoint(dice.getValue()); // Calculate

            System.out.println("After Rolling, with the point: " + player1.getPoint() );
            System.out.println("=================================================");

            // Player 2 
            currentPoint = player2.getPoint();
            System.out.println( player2.getName() +" with the remaining point: " + currentPoint);

            dice.Roll(); // Roll
            // show point đã lăn ra
            System.out.println("Rolling with the point: " + dice.getValue());

            player2.CalculatePoint(dice.getValue( ) ); // Calculate

            System.out.println("After rolling, with the point: " + player2.getPoint());
            System.out.println("===================================================");
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
