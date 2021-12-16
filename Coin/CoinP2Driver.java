package Coin;

public class CoinP2Driver {
    public static void main(String[] args) {
        CoinP2 Coin1 = new CoinP2();
        int Count_H = 0, Count_T = 0;

        for (int count = 1; count <= 1000; count++) {
            Coin1.flip();
            if (Coin1.isHeads())
                Count_H++;
            else
                Count_T++;
            System.out.println("Coin flipped " + Coin1);
        }
        System.out.println("The Count for Heads is: " + Count_H);
        System.out.println("The Count for Tails is: " + Count_T);
    }
}
