import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards ;

    public Deck( ) {
        cards = new ArrayList<>() ;
        String[] suits = { "Hears" , "Diamonds" , "Spades" , "Clubs" }; 
        String[] faceValues = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King" };

        // Tạo thêm nhiều lá bài 
        for (var eachSuit : suits ) {
            for( var eachValue : faceValues ) {
                cards.add(new Card(eachSuit, eachValue));
            }
        }


    } 

    // Xáo bài 
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Deal : Rút bài 
    public Card deal() {
        if ( cards.isEmpty() ) {
            throw new  IllegalStateException("No cars in list");
        } else {
            return cards.remove(0);
        }
    }

}
