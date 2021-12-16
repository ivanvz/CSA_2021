package Ch4Labs;

import java.io.DataInput;

public class CountDigits
{
    //-----------------------------------------------------------------
// Counts the number of odd, even, and zero digits in an
// integer input value.
//-----------------------------------------------------------------
    public static void main (String[] args)
    {
        int oddCount = 0, evenCount = 0, zeroCount = 0;
        int value = 0, digit;

        System.out.print ("Enter an integer value: ");
        

        value = Math.abs (value);
        if (value == 0)
            zeroCount++;

        while (value > 0)
        {
            digit = value % 10;

            if (digit == 0)
                zeroCount++;
            else
            if (digit%2 == 0)
                evenCount++;
            else
                oddCount++;

            value = value / 10;
        }

        System.out.println ("Zero digits: " + zeroCount);
        System.out.println ("Even digits: " + evenCount);
        System.out.println ("Odd digits: " + oddCount);
    }
}