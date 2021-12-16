package Ch6.Labs.Cards;
import java.util.*;
public class Cards {
    private String faceName, suitName;
    private int CardFace, CardSuit;

    private final static int ACE=1;
    private final static int TWO=2;
    private final static int THREE=3;
    private final static int FOUR=4;
    private final static int FIVE=5;
    private final static int SIX=6;
    private final static int SEVEN=7;
    private final static int EIGHT=8;
    private final static int NINE=9;
    private final static int TEN=10;
    private final static int JACK=11;
    private final static int QUEEN=12;
    private final static int KING=13;

    private final static int CLUBS=1;
    private final static int DIAMONDS=2;
    private final static int SPADES=3;
    private final static int HEARTS=4;

    public Cards(){
        CardFace = (int) (Math.random()*13) + 1;
        setFaceName();
        CardSuit = (int) (Math.random()*4) + 1;;
        setSuitName();
    }

    public void setFaceName(){
        if(CardFace==ACE)
            faceName = "Ace";
        if(CardFace==TWO)
            faceName = "Two";
        if(CardFace==THREE)
            faceName = "Three";
        if(CardFace==FOUR)
            faceName = "Four";
        if(CardFace==FIVE)
            faceName = "Five";
        if(CardFace==SIX)
            faceName = "Six";
        if(CardFace==SEVEN)
            faceName = "Seven";
        if(CardFace==EIGHT)
            faceName = "Eight";
        if(CardFace==NINE)
            faceName = "Nine";
        if(CardFace==TEN)
            faceName = "Ten";
        if(CardFace==JACK)
            faceName = "Jack";
        if(CardFace==QUEEN)
            faceName = "Queen";
        if(CardFace==KING)
            faceName = "King";
    }

    public void setSuitName(){
        if(CardSuit==CLUBS)
            suitName = "Clubs";
        if(CardSuit==DIAMONDS)
            suitName = "Diamonds";
        if(CardSuit==SPADES)
            suitName = "Spades";
        if(CardSuit==HEARTS)
            suitName = "Hearts";
    }

    public String getFaceName(){
        return faceName;
    }

    public String getSuitName(){
        return suitName;
    }

    public String toString(){
        return faceName + "---" + suitName;
    }
}

