package Coin;

import java.util.Random;
public class CoinP2 {
    int HEADS = 1;
    int TAILS = 0;
    int FACE;
    Random rand = new Random();

    public CoinP2 (){
        flip();
    }

    public void flip(){
        FACE=rand.nextInt(2)+1;
//        FACE=(int) Math.random()*2;
    }

    public boolean isHeads(){
        return (FACE==HEADS);
    }

    public boolean isTails(){
        return (FACE==TAILS);
    }

    public String toString(){
        String Result;
        if (FACE==HEADS)
            Result="Headsss";
        else
            Result="Tailsss";

        return Result;
    }
}

