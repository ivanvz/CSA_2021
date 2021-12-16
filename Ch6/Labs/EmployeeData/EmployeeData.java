package Ch6.Labs.EmployeeData;

public class EmployeeData {
    int identificationNO;
    String firstName;
    String lastName;
    int monthlySalary;
    int bonusSalary;
    int annualSalary;
    double percentRaise;
    double expectedNextYearSalary;

    public EmployeeData(int id, String first, String last, int monthly, int bonus, double raise) {
        identificationNO = id;
        firstName = first;
        lastName = last;
        monthlySalary = monthly;
        bonusSalary = bonus;
        percentRaise = raise;
    }

//    public int getID(){
//        return id;
//    }
//
//    public String getFirstName(String firstName){
//        return firstName;
//    }
//
//    public String getLastName(String lastName){
//        return lastName;
//    }
//
//    public int getMonthlySalary(int monthlySalary){
//        return monthlySalary;
//    }
//
//    public int getBonusSalary(int bonusSalary){
//        return bonusSalary;
//    }

    public int AnnualSalary(){
        annualSalary = (monthlySalary*12) + bonusSalary;
        return annualSalary;
    }

    public double ExpectedNextYearSalary(){
        expectedNextYearSalary = (((percentRaise / 100)+1) * AnnualSalary());
        return (int) expectedNextYearSalary;
    }

    public String toString(){
        return "Full Name: " + firstName + " " + lastName +
                "\nID Number: " + identificationNO +
                "\nCurrent Annual Salary: " + AnnualSalary() +
                "\nProjected Next Annual Salary With Raise: " + ExpectedNextYearSalary();
    }
}
