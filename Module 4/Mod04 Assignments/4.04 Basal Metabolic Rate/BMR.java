
/**
 * Calculates Heart Basal Metabolic rate (BMR)
 * 
 * @Tushaar Kamat
 * @8/18/16
 */
import java.util.Scanner;
public class BMR
{
    public static void main( String [] args )
    {
        //local variables
        double kilogramsPerPound = 0.453592;
        double centimetersPerInch = 2.54;
        double weightKilograms;
        double heightCentimeters;
        boolean isMale;
        double metabolicRate;
        
        //declares new scanner "in"
        Scanner in = new Scanner( System.in );
        
        //user input
        System.out.println();
        System.out.println( "Enter your first name: " );
        String firstName = in.next();
        System.out.println( "Gender (M or F): " );
        String genderString = in.next();
        char gender = genderString.charAt( 0 );
        System.out.println( "Enter your age: " );
        String ageString = in.next();
        int ageYears = Integer.parseInt( ageString );
        System.out.println( "Height in inches (whole number): " );
        String heightString = in.next();
        int heightInches = Integer.parseInt( heightString );
        System.out.println( "Weight in pounds (whole number): " );
        String weightString = in.next();
        int weightPounds = Integer.parseInt( weightString );
        
        //unit conversions to from imperial to metric
        weightKilograms = weightPounds * kilogramsPerPound;
        heightCentimeters = heightInches * centimetersPerInch;
        
        //BMR calculation
        isMale = gender == 'M';
        
        if ( isMale )
            metabolicRate = 13.397 * (weightKilograms) + 4.799 * (heightCentimeters) - 5.577 * (ageYears) + 88.362;
        else 
            metabolicRate = 9.247 * (weightKilograms) + 3.098 * (heightCentimeters) - 4.330 * (ageYears) + 447.593;
        
        //truncating to one decimal place
        String weightKilogramsString = weightKilograms + "";
        int decimalA = weightKilogramsString.indexOf( "." );
        String weightKilogramsRounded = weightKilogramsString.substring( 0, (decimalA + 2) ); 
        String heightCentimetersString = heightCentimeters + "";
        int decimalB = heightCentimetersString.indexOf( "." );
        String heightCentimetersRounded = heightCentimetersString.substring( 0, (decimalB + 2) );
        String metabolicRateString = metabolicRate + "";
        int decimalC = metabolicRateString.indexOf( "." );
        String metabolicRateRounded = metabolicRateString.substring( 0, (decimalC + 2) );
        
        //printed output
        System.out.println();
        System.out.println( "YOUR BASAL METABOLISM: " );
        System.out.println();
        System.out.println( "Name: " + firstName );
        System.out.println( "Gender: " + gender );
        System.out.println( "Age: " + ageYears );
        System.out.println( "Weight (kg): " + weightKilogramsRounded );
        System.out.println( "Height (cm): " + heightCentimetersRounded );
        System.out.println( "Basal metabolic Rate: " + metabolicRateRounded + " per day" );
                       
    }
}
