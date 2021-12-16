package HW3.Proj2;

public class DriverHoliday {

//    Answer for a
    public static void main(String[] args) {
        Holiday h1 = new Holiday("IndependenceDay", 4, "July");
        Holiday h2 = new Holiday("ChristmasDay", 25, "December");

        System.out.println(h1);
        System.out.println(h2);

        System.out.println("\nComparison results:" );

        //    Answer for d
            if(h1.getMonth().equalsIgnoreCase(h2.getMonth())) {
                System.out.println("Months are the same.");
            }
            else{
                System.out.println("Months are not the same.");
            }
    }
}
