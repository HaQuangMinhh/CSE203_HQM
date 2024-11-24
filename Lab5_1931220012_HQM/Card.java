import java.util.List;

public class Card {

    private String Suit ; 
    private String FaceValue ;
    

    public Card(String suit, String faceValue) {
        Suit = suit;
        FaceValue = faceValue;
    }


    
    public String getSuit() {
        return Suit;
    }
    public void setSuit(String suit) {
        Suit = suit;
    }
    public String getFaceValue() {
        return FaceValue;
    }
    public void setFaceValue(String faceValue) {
        FaceValue = faceValue;
    }


    @Override
    public String toString() {
        return "Card [Suit= " + Suit + ", FaceValue= " + FaceValue + " ]";
    } 

}
