package Ch6.Labs.Dice;
import java.util.Random;

public class MyDice {
    private final int MIN_FACES = 6;
    private static Random generator = new Random();
    private int numFaces;
    private int faceValue;

    public MyDice(){
        numFaces = 6;
        faceValue = 1;
    }

    public MyDice(int faces){
        if (faces<MIN_FACES)
            numFaces=6;
        else
            numFaces=faces;
    }

    public int roll(){
        faceValue = generator.nextInt(numFaces) + 1;
        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }
}

