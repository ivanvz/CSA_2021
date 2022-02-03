package Ch14.Homework.Proj5;

public class Russian extends Person {
    String carBrand;
    int adidasOwned;

    public Russian(int age, String occupation, int income, int federalTaxRate,
                    String carBrand, int adidasOwned) {
        super(age, occupation, income, federalTaxRate);
        this.carBrand = carBrand;
        this.adidasOwned = adidasOwned;
    }

    @Override
    public String toString() {
        return "/Russian/" +
                "\nAge: " + age +
                "\nOccupation: " + occupation +
                "\nIncome: " + income +
                "\nFederal Tax Rate: " + federalTaxRate +
                "\nCar Brand Owned: " + carBrand +
                "\nAdidas Owned: " + adidasOwned;
    }
}