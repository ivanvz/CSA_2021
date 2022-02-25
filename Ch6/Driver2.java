package src.Ch6;

public class Driver2
{

    public static void main (String[] args)
    {

        Address HomeAddress = new Address ("123 silver Rd", "RH", "CA", 123456);
        Address WorkAddress = new Address ("999 Gold Rd", "RH", "CA", 92);
        Account acct1 = new Account (31014, 72354,100.00,"Twiet", HomeAddress);

        acct1.deposit (500);
        System.out.println (acct1);
        acct1.withdraw (1200.00, 10.0);
        System.out.println (acct1);
        acct1.withdraw (1500.00, 10.0);
        System.out.println (acct1);
        double gomezBalance = acct1.deposit (2000.00);
        System.out.println ("Gomez balance after deposit: " + gomezBalance);
//

        System.out.println (acct1);
//acct1.addInterest(10);
        System.out.println ();
        System.out.println (acct1);

    }
}
