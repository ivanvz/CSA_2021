package Ch6.Labs.Dice;

public class MyDiceDriver {
    public static void main(String[] args) {
        int num1, num2, num3, snakeEyes = 0, doubleNum = 0, rollcount = 1000;
        MyDice die1 = new MyDice();
        MyDice die2 = new MyDice();
        MyDice bigDie = new MyDice(100);

        for (int roll = 1; roll <= rollcount; roll++) {
            num1 = die1.roll();
            num2 = die2.roll();
            num3 = bigDie.roll();

            if (num1 == 1 && num2 ==1)
                snakeEyes++;

            if (num1==num2)
                doubleNum++;

            System.out.println("Num#1:\t"+num1+"\t"+"Num#2: \t"+num2+"\t"+"Num#3: \t"+num3);
        }
        System.out.println("Snake Eyes: " + snakeEyes);
        System.out.println("Rolls of 2 of the same number: " + doubleNum);
    }
}
