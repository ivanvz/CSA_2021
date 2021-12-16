package Ch6;

import java.text.NumberFormat;

public class Account
{
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    private final double RATE = 0.035; // interest rate of 3.5%

    private int acctNumber;
    private double balance;
    private String name;
    private String type;
    private int phone;
    private Account from;
    private Account to;
    Address CustAddr, WorkAddr;

    public Account (int phoneNum , int account, double initial, String owner, Address CustHomeAd)
    {
        phone = phoneNum;
        name = owner;
//owner = name ;
        acctNumber = account;
        balance = initial;
        CustAddr = CustHomeAd;

    }

    public Account (int phoneNum ,String owner, int account, double initial,Address CustHomeAd, Address CustWorkAd)
    {
        phone = phoneNum;

        name = owner;
        acctNumber = account;
        balance = initial;
        CustAddr = CustHomeAd;
        WorkAddr = CustWorkAd;
    }


    public Account (String owner, int account, double initial)
    {
        name = owner;
//owner = name ;
        acctNumber = account;
        balance = initial;
    }

    public Account (String owner, int account)
    {

        name = owner;
        acctNumber = account;

    }
    public Account (String owner, int account, double initial, String teacher)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
        type = teacher;
    }


    public Account (String owner)
    {
        name = owner;


    }

    public double deposit (double amount)
    {
        if (amount < 0) // deposit value is negative
        {
            System.out.println ();
            System.out.println ("Error: Deposit amount is invalid.");
            System.out.println (acctNumber + " " + fmt.format(amount));
        }
        else
            balance = balance + amount;
        return balance;
    }

    public double withdraw (double amount, double fee)
    {
        amount += fee;

        if (amount < 0) // withdraw value is negative
        {
            System.out.println ();
            System.out.println ("Error: Withdraw amount is invalid.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
        }
        else
        if (amount > balance) // withdraw value exceeds balance
        {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            System.out.println ("Available: " + fmt.format(balance));
        }
        else
            balance = balance - amount;

        return balance;
    }

    public double Transfer( double Tranamount , double Tranfee, Account AcctFrom , Account AcctTo )
    {
        AcctFrom.withdraw (Tranamount, Tranfee);
        AcctTo.deposit (Tranamount);
        return balance;
    }

    public void changeName1( String newName)
    {
        name = newName;

    }
    public String changeName2( String newName)
    {
        name = newName;
        return name;
    }

    public void printSummary ()
    {
        System.out.println ("Name " + name);
        System.out.println ("Acct Num " + acctNumber);
        System.out.println ("Balance " + balance);


    }

    public double getBalance ()
    {
        return balance;
    }

    public int getAccountNumber ()
    {
        return acctNumber;
    }

    public String toString()
    {
//return (acctNumber + "\t" + name + "\t" + fmt.format(balance)+" "+type+"\t" );
//return (name + "\t" + acctNumber + "\t" + fmt.format(balance));
        return (phone +" "+ name+ "\t" + acctNumber+ "\t" + fmt.format(balance) +"\n"+ CustAddr+"\n"+WorkAddr );
//return (phone + "\t"+ acctNumber+name);
    }
}

// public double Transfer2( double amount , double fee , Account AcctFrom , Account AcctTo )
// {
// AcctFrom.withdraw