package Ch14.Homework.Proj5;

public class Australian extends Person {
    boolean coolAccent;
    int spidersInHouse;

    public Australian(int age, String occupation, int income, int federalTaxRate,
                    boolean coolAccent, int spidersInHouse) {
        super(age, occupation, income, federalTaxRate);
        this.coolAccent = coolAccent;
        this.spidersInHouse = spidersInHouse;
    }

    @Override
    public String toString() {
        return "/Australian/" +
                "\nAge: " + age +
                "\nOccupation: " + occupation +
                "\nIncome: " + income +
                "\nFederal Tax Rate: " + federalTaxRate +
                "\nCool Accent: " + coolAccent +
                "\nSpiders in their house: " + spidersInHouse;
    }
}