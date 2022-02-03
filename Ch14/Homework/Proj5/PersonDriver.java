package Ch14.Homework.Proj5;

public class PersonDriver {
    public static void main(String args[]){
        American american = new American(19, "Finance", 45000,
                12, 185, 15, 2);
        Australian australian = new Australian(24, "Kangaroo Wrangler", 65000,
                32, true, 17);
        European european = new European(47, "Programmer", 110000, 32,
                true, 8.99, 27.00);
        Russian russian = new Russian(65, "Unemployed", 0, 13,
                "Lavta", 30);

        System.out.println(american.toString());
        System.out.println();
        System.out.println(australian.toString());
        System.out.println();
        System.out.println(european.toString());
        System.out.println();
        System.out.println(russian.toString());
    }
}
