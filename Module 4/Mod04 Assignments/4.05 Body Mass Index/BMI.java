
/**
 * Calculates person's BMI given height and weight
 * 
 * @author Tushaar Kamat 
 * @version 8/19/16
 */
import java.util.Scanner;
public class BMI
{
    public static void main( String [] args )
    {
        //declares new Scanner named "in"
        Scanner in = new Scanner( System.in );
        
        //local variables
        double heightMeters;
        double weightKilograms;
        int heightTotalInches;
        double kilogramsPerPound = 0.453592;
        double metersPerInch = 0.0254;
        double bodyMassIndex;
        
        //user input
        System.out.println();
        System.out.println( "Enter your name (First Last): " );
        String fullName = in.next();
        fullName += in.nextLine();
        System.out.println( "Enter your height in whole feet and inches (e.g. 6 4): " );
        int heightFeet = in.nextInt();
        int heightInches = in.nextInt();
        System.out.println( "Enter your weight in whole pounds (e.g. 225): " );
        String weightPoundsString = in.next();
        int weightPounds = Integer.parseInt( weightPoundsString );
        
        //unit conversions
        heightTotalInches = (12 * heightFeet) + heightInches;
        heightMeters = heightTotalInches * metersPerInch;
        weightKilograms = weightPounds * kilogramsPerPound;
        
        //BMI calculations
        bodyMassIndex = weightKilograms / (heightMeters * heightMeters);
        String weightStatus = "";
        
        if ( bodyMassIndex < 18.5 )
            weightStatus = "Underweight";
        else if ( bodyMassIndex < 25.0 )
            weightStatus = "Healthy weight";
        else if ( bodyMassIndex < 30.0 )
            weightStatus = "Overweight";
        else 
            weightStatus = "Obese";
        
        //truncating to one decimal place
        String weightKilogramsString = weightKilograms + "";
        int decimalA = weightKilogramsString.indexOf( "." );
        String weightKilogramsRounded = weightKilogramsString.substring( 0, (decimalA + 2) ); 
        String heightMetersString = heightMeters + "";
        int decimalB = heightMetersString.indexOf( "." );
        String heightMetersRounded = heightMetersString.substring( 0, (decimalB + 2) );
        String bodyMassIndexString = bodyMassIndex + "";
        int decimalC = bodyMassIndexString.indexOf( "." );
        String bodyMassIndexRounded = bodyMassIndexString.substring( 0, (decimalC + 2) );
        
        //results printed
        System.out.println();
        System.out.println( "Body Mass Index Calculator" );
        System.out.println( "==========================" );
        System.out.println( "Name: " + fullName );
        System.out.println( "Height (m): " + heightMetersRounded );
        System.out.println( "Weight (kg): " + weightKilogramsRounded );
        System.out.println( "BMI: " + bodyMassIndexRounded );
        System.out.println( "Category: " + weightStatus );
            
        
        
    }
}
