

public class Q4Main {
    
    public static void main(String[] args) {
        
        // // List 
        // List<Integer> numbers = new ArrayList<>() ;
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // // Hoán đổi vị trí 
        // Collections.shuffle(numbers);



        // System.out.println(numbers);

        Deck deck = new Deck() ; 

        // suffles 
        deck.shuffle();

        // create a player from cardPlayer
        CardPlayer player1 = new CardPlayer(); 

        for ( int i = 0 ; i < 5 ; i++ ) {
            Card card = deck.deal(); // Rút bài từ bộ bài 
            player1.getCard(card); // trở về tay player

        }

        player1.showCards();
    }
}
