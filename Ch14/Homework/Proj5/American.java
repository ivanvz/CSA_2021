package Ch14.Homework.Proj5;

public class American extends Person {
    int weight;
    int stateTaxRate;
    int gunsOwned;

    public American(int age, String occupation, int income, int federalTaxRate,
                    int weight, int stateTaxRate, int gunsOwned) {
        super(age, occupation, income, federalTaxRate);
        this.weight = weight;
        this.stateTaxRate = stateTaxRate;
        this.gunsOwned = gunsOwned;
    }

    @Override
    public String toString() {
        return "/American/" +
                "\nAge: " + age +
                "\nOccupation: " + occupation +
                "\nIncome: " + income +
                "\nFederal Tax Rate: " + federalTaxRate +
                "\nWeight: " + weight +
                "\nState Tax Rate: " + stateTaxRate +
                "\nGuns Owned: " + gunsOwned;
    }
}