
import java.util.*;

public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create player 1
        System.out.println("Enter name of player 1 : ");
        String player1Name = sc.nextLine(); 
        Player player1 = new Player(player1Name, 6); // 6 mặt xúc xắc 

        //create player 2 
        System.out.println("Enter name of player 2 : ");
        String player2Name = sc.nextLine();
        Player player2 = new Player(player2Name, 6); // 6 mặt xúc xắc 

         
        System.out.println("Start game");
        
        boolean gameWon = false ; 
        while (!gameWon) {
            // Lượt chơi của player 1 
            System.out.println(player1.getName() + " First");

            player1.rollDie(); // quay
            if ( player1.hasWon() ) {
                System.out.println(player1.getName() + " wins with 1 point");
                gameWon = true ; 
                break;
            }

            // Turn to player 2 
            System.out.println(player2.getName() + " Second");

            player2.rollDie();
            if ( player2.hasWon() ) {
                System.out.println(player2.getName() + " wins with 1 point");
                gameWon = true ; 
                break; 
            }
        }
        System.out.println("Game over");
    }

}
