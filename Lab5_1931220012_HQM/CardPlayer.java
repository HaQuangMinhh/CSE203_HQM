import java.util.ArrayList;
import java.util.List;

public class CardPlayer {

    private List<Card> cards ; 


    public CardPlayer( ) {
        cards = new ArrayList<>();
    }
    public void getCard (Card card ) {
        cards.add(card);
    }

    public void showCards() {
        for ( var eachCard : cards  ) {
            System.out.println(eachCard);
        }
    }

    


}
