package Ch14.Homework.Proj4;

public class SportDriver {
    public static void main(String args[]){
        AmericanFootball ameriBall = new AmericanFootball("American Football", 11, 1000);
        Hockey hockey = new Hockey("Hockey", 6, "Vladimir Tsyplakov");
        Football football = new Football("Football", 11, 5);

        ameriBall.PrintDetails();
        System.out.println();
        hockey.PrintDetails();
        System.out.println();
        football.PrintDetails();
    }
}
