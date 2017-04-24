
/**
 * Converts to and from Metric and English
 * units of measure.
 * 
 * @author Tushaar K.
 * @version 9/4/2016
 */
public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        //return statement calculate kilometers goes here
        return mi * 1.60934;
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        //return statement to calculate miles goes here
        return km / 1.60934;
    }

    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double lb) {
        //return statement to calculate kilograms goes here
        return lb * 0.453592;
    }

    //convert kilograms to pounds
    public static double convertKilogramsToPounds(double kg) {
        //return statement to calculate pounds goes here
        return kg / 0.453592;
    }

    //convert gallons to liters
    public static double convertGallonsToLiters(double gal) {
        return gal * 3.78541;
    }

    //convert liters to gallons
    public static double convertLitersToGallons(double L) {
        return L / 3.78541;
    }

    //convert yards to meters
    public static double convertYardsToMeters(double yd) {
        return yd * 0.9144;
    }

    //convert meters to yards
    public static double convertMetersToYards(double m) {
        return m / 0.9144;
    }
    
    
    
        
    public static void main(String[ ] args)
    {
        //local variables
        //double miles, feet, inches, pounds, gallons;
        //double kilometers, kilograms, liters;
        
        //variable declaration and initialization
    
        printPurpose();                                    //invoke the printPurpose() method
        double feet = 6230;
        double miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);
        //print results goes here
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles);
        
        double pounds = 204;
        double kilograms = convertPoundsToKilograms(pounds);
        //print results goes here
        System.out.printf("%8.1f lb. = %7.1f kg. %n", pounds, kilograms);
       
        //declare and initialize the kilograms variable goes here
        kilograms = 55;
        //call method to convert kilograms to pounds goes here
        pounds = convertKilogramsToPounds(kilograms);
        //print results goes here
        System.out.printf("%8.1f kg. = %7.1f lb. %n", kilograms, pounds);
        
        double gallons = 16;
        //call method to convert gallons to liters goes here
        double liters = convertGallonsToLiters(gallons);
        //print results goes here
        System.out.printf("%8.1f gal.= %7.1f L. %n", gallons, liters);

        liters = 19.2;
        //call method to convert liters to gallons goes here
        gallons = convertLitersToGallons(liters);
        //print results goes here
        System.out.printf("%8.1f L.  = %7.1f gal. %n", liters, gallons);

        double yards = 100;
        double meters = convertYardsToMeters(yards);
        System.out.printf("%8.1f yd. = %7.1f m. %n", yards, meters);

        meters = 772.9;
        yards = convertMetersToYards(meters);
        System.out.printf("%8.1f m.  = %7.1f yd. %n", meters, yards);

    }//end of main method
	
}//end of class


