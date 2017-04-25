/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * �FLVS 2007
 * @author B. Jordan, 
 * @version 01/19/07
 *
 * Modified by: T. Kamat
 * Date: 08/08/16
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                         //distance in miles
        double feet;                          //distance in feet
        double feetPerMile = 5280;            //number of feet per 1 mile
        double milesPerFoot = 0.000189394;    //number of miles in 1 foot
        double kilometers;                    //distance in kilomeers
        double milesPerKilometer = 0.621371;  //number of miles per 1 kilometer
        double kilometersPerMile = 1.60934;   //number of kilometers per 1 mile
        double pounds;                        //weight in pounds
        double kilograms;                     //mass in kilograms
        double poundsPerKilogram = 2.20462;   //number of pounds per 1 kilogram
        double kilogramsPerPound = 0.453592;  //number of kilograms per 1 pound
        double gallons;                       //volume in gallons
        double liters;                        //volume in liters
        double gallonsPerLiter = 0.264172;    //number of gallons per 1 liter
        double litersPerGallon = 3.78541;     //number of liters per 1 gallon
        double yards;                         //distance in yards
        double meters;                        //distance in meters
        double metersPerYard = 0.9144;        //number of meters per 1 yard
        double yardsPerMeter = 1.09361;       //number of yards per 1 meter
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable
        
        
        System.out.println();
        System.out.println( "MEASUREMENT CONVERTER" );
        System.out.println();


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println( feet + " ft. = " + miles + " mi. " );


        //convert miles to feet
        miles = 26.2;
        feet = miles / milesPerFoot;
        System.out.println( miles + " mi. = " + feet + " ft. " );
        
        
        //convert miles to kilometers
        miles = 65;
        kilometers = miles / milesPerKilometer;
        System.out.println( miles + " mi. = " + kilometers + " km. " );
        
        
        //convert kilometers into miles
        kilometers = 5;
        miles = kilometers / kilometersPerMile;
        System.out.println( kilometers + " km. = " + miles + " mi. " );
        
        
        //convert pounds to kilograms
        pounds = 91;
        kilograms = pounds / poundsPerKilogram;
        System.out.println( pounds + " lb. = " + kilograms + " kg. " );
        
        
        //convert kilograms to pounds
        kilograms = 50;
        pounds = kilograms / kilogramsPerPound;
        System.out.println( kilograms + " kg. = " + pounds + " lb. " );
        
        
        //convert gallons into liters
        gallons = 4;
        liters = gallons / gallonsPerLiter;
        System.out.println( liters + " L. = " + gallons + " gal. " );
        
        
        //convert liters to gallons
        liters = 17;
        gallons = liters / litersPerGallon;
        System.out.println( gallons + " gal. = " + liters + " L. " );
        
        
        //convert yards to meters
        yards = 100;
        meters = yards / yardsPerMeter;
        System.out.println( yards + " yd = " + meters + " m. " );
        
        
        //convert meters to yards
        meters = 53;
        yards = meters / metersPerYard;
        System.out.println( meters + " m. = " + yards + " yd. " );
        
        
        
    }//end of main method
}//end of class

