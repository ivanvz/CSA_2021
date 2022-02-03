package Ch14.Homework.Proj1;

public class MonetaryDriver {
    public static void main(String args[]){
        MonetaryCoin dime = new MonetaryCoin(10);
        MonetaryCoin nickel = new MonetaryCoin(5);

        System.out.println("Dime value: " + dime.getPassValue());
        System.out.println("Nickel value: " + nickel.getPassValue());

        int sumOne = dime.getPassValue() + nickel.getPassValue();
        System.out.println("Nickel + Dime = " + sumOne);

        System.out.println();

        System.out.println("Dime: " + dime);
        System.out.println("---COIN-FLIP---");
        dime.flip();
        System.out.println("Dime: " + dime);
    }
}
