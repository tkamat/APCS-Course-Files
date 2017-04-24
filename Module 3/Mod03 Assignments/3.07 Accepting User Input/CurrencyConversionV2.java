/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * �CSA/FLVS 2011
 * @author Maria Vieta Jacquard, Tushaar Kamat
 * @version 08/14/16
 */
import java.util.Scanner;                       // imports Scanner methods
public class CurrencyConversionV2
{
    public static void main(String [] args)
    {
        // Scanner declaration
        Scanner in = new Scanner( System.in );
        
        // local variables
        double startingUsDollars = 5000.00;     // local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double yenSpent = 99939.75;             // local variable for Japanese yen spent
        double dollarsSpentInJapan = 0.0;       // local variable for dollars spent in Japan
        double eurosSpent = 624.95;             // local variable for euros spent
        double dollarsSpentInFrance = 0.0;      // local variable for dollars spent in France
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        double dollarsSpentInTotal = 0.0;       // local variable for US dollars spent in total

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the entered");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        // currency exchange rate input
        System.out.println( "Enter exchange rate of US Dollars to Pesos: " );
        double pesoExchangeRate = in.nextDouble();
        System.out.println( "Enter exchange rate of US Dollars to Yen: " );
        double yenExchangeRate = in.nextDouble();
         System.out.println( "Enter exchange rate of US Dollars to Euros: " );
        double euroExchangeRate = in.nextDouble();
        
        // convertion for Mexican pesos
        // code goes below here
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;

        // convertion for Japanese yen
        // code goes below here
        dollarsSpentInJapan = yenSpent / yenExchangeRate;

        // convertion for Euros
        // code goes below here
        dollarsSpentInFrance = eurosSpent / euroExchangeRate;

        //print output to the screen
        // code goes below here
        dollarsSpentInTotal = dollarsSpentInMexico + dollarsSpentInJapan + dollarsSpentInFrance;
        remainingUsDollars = startingUsDollars - dollarsSpentInTotal;
        System.out.println( "Starting US dollars: " + startingUsDollars );
        System.out.println( "US dollars spent in Mexico:  " + dollarsSpentInMexico );
        System.out.println( "US dollars spent in Japan:   " + dollarsSpentInJapan );
        System.out.println( "US dollars spent in France:  " + dollarsSpentInFrance );
        System.out.println( "===================================================" );
        System.out.println( "US dollars spent in total:   " + dollarsSpentInTotal );
        System.out.println( "Remaining US dollars:        " + remainingUsDollars );
        System.out.println();
        System.out.println();
        
        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 4;                          //cost per item of first souvenir
        int budget1 = 50;                           //budget for first item
        int totalItem1 = 0;                         //how many items can be purchased
        double fundsRemaining1 = 0.0;               //how much of the budget is left
        
        totalItem1 = budget1 / costItem1;
        fundsRemaining1 = budget1 % costItem1;

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);

        //Calculations for Souvenir #2
        double costItem2 = 32.55;                   //cost per item of second souvenir
        int budget2 = 713;                          //budget for second item
        int totalItem2 = 0;                         //how many items can be purchased
        double fundsRemaining2 = 0.0;               //how much of the budget is left
        
        totalItem2 = (int)(budget2 / costItem2);
        fundsRemaining2 = budget2 % costItem2;

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

