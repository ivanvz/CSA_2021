package ArrayHomework.Q1;
import java.util.Random;
public class Cards{

    static String SoManyGodDamnCards[] = {"Ace of ♠️", "Ace of ♥️", "Ace of ♣️", "Ace of ♦️",
            "2 of ♠️", "2 of ♥️", "2 of ♣️", "2 of ♦️", "3 of ♠️", "3 of ♥️", "3 of ♣️",
            "3 of ♦️", "4 of ♠️", "4 of ♥️", "4 of ♣️", "4 of ♦️", "5 of ♠️", "5 of ♥️",
            "5 of ♣️", "5 of ♦️", "6 of ♠️", "6 of ♥️", "6 of ♣️", "6 of ♦️", "7 of ♠️",
            "7 of ♥️", "7 of ♣️", "7 of ♦️", "8 of ♠️", "8 of ♥️", "8 of ♣️", "8 of ♦️",
            "9 of ♠️", "9 of ♥️", "9 of ♣️", "9 of ♦️", "10 of ♠️", "10 of ♥️", "10 of ♣️",
            "10 of ♦️", "Jack of ♠️", "Jack of ♥️", "Jack of ♣️", "Jack of ♦️", "Queen of ♠️",
            "Queen of ♥️", "Queen of ♣️", "Queen of ♦️", "King of ♠️", "King of ♥️", "King of ♣️",
            "King of ♦️"};

    static void ShuffleCards(){
        Random rand = new Random();
        String temporary = "";

//        shuffling cards
        for (int i = 0; i < 69420; i++) {
            int random1 = rand.nextInt(52);
            int random2 = rand.nextInt(52);
            temporary = SoManyGodDamnCards[random1];
            SoManyGodDamnCards[random1] = SoManyGodDamnCards[random2];
            SoManyGodDamnCards[random2] = temporary;
        }

//        draw 20 cards
        for (int x = 0; x < 20; x++) {
            System.out.println((x + 1) + ") " + SoManyGodDamnCards[x]);
        }
    }
}
