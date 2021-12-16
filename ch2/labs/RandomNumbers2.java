package ch2.labs;

public class RandomNumbers2 {

    class MathRandom
    {

        // driver code
        public static void main(String args[])
        {
// Generate random number
            double rand = Math.random();

// Output is different everytime this code is executed
//System.out.println("Random Number:" + rand);
            int randInt = (int)(Math.random() * 10 +10);

// Output is different everytime this code is executed
//System.out.println(rand);
            System.out.println(randInt);
        }
    }
}
