package Ch14.Homework.Proj5;

public class European extends Person {
        boolean universalHealthcare;
        double priceofGas;
        double VAT;

        public European(int age, String occupation, int income, int federalTaxRate,
                        boolean universalHealthcare, double priceofGas, double VAT) {
            super(age, occupation, income, federalTaxRate);
            this.universalHealthcare = universalHealthcare;
            this.priceofGas = priceofGas;
            this.VAT = VAT;
        }

    @Override
        public String toString() {
            return "/European/" +
                    "\nAge: " + age +
                    "\nOccupation: " + occupation +
                    "\nIncome: " + income +
                    "\nFederal Tax Rate: " + federalTaxRate +
                    "\nUniversal Healthcare?: " + universalHealthcare +
                    "\nGas Cost: " + priceofGas +
                    "\nVAT: " + VAT;
        }
}