package ch3.lab;

public class WhileToTen {
    public static void main(String args[]){
        int count = -1;
        while (count<10){
            count += 1;
            System.out.println(count);
        }
        System.out.println("Done.");

        for (int backCount = 10; backCount>=0; backCount--){
            System.out.println(backCount);
        }
        System.out.println("Done.");
    }
}
