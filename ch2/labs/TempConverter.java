package ch2.labs;

import java.util.Scanner;

public class TempConverter
{
   public static void main (String[] args)
   {
      Scanner scn = new Scanner(System.in);

      final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;

      int celsiusTemp ;  // value to convert
      double fahrenheitTemp;

      System.out.println ("enter temperature in Celsius");
      celsiusTemp = scn.nextInt();

      fahrenheitTemp = (celsiusTemp * CONVERSION_FACTOR) + BASE;

      System.out.println ("Celsius Temperature: " + celsiusTemp);
      System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
   }
}
