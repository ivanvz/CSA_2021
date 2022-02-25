package src.Coin;

public class FlipRace {
    public static void main(String[] args) {
        final int GOAL =3;
        int count1 = 0, count2 = 0;
        CoinP2 coin1 = new CoinP2();
        CoinP2 coin2 = new CoinP2();

        while (count1 < GOAL && count2 < GOAL){
            coin1.flip();
            coin2.flip();
            System.out.println("Coin 1: " + coin1 + "    Coin 2: " + coin2);
//            System.out.println("    Coin 2: " + coin2);
        }
        if (coin1.isHeads())
            count1++;
        else
            count1=0;
        if (coin2.isHeads())
            count2++;
        else
            count2=0;

        if (count1 == GOAL)
            System.out.println("Coin 1 Wins!");
        if (count2 == GOAL)
            System.out.println("Coin 2 Wins!");
        else
            System.out.println("It's a tie!");
    }
}
