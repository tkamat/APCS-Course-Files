
/**
 * Calculates your target heart rate. 
 *
 * @Tushaar Kamat
 * @8/17/16
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        //Initialize and declare variables
        String zone = "within";             //default assumes target is within zone
        boolean under;
        boolean over;
        Scanner in = new Scanner(System.in);

        //Prompt user for input
        System.out.println();
        System.out.println( "What is your age?" );
        String ageString = in.next();
        int age = Integer.parseInt( ageString );
        System.out.println( "What is your resting heart rate (BPM) ?" );
        String restingHeartRateString = in.next();
        int restingHeartRate = Integer.parseInt( restingHeartRateString );
        System.out.println( "What is your heart rate after excersising (BPM) ?" );
        String exersiseHeartRateString = in.next();
        int exersiseHeartRate = Integer.parseInt( exersiseHeartRateString );
        
        //Calculate heart rate target zone min and max
        int maximumHeartRate = (int)(206.9 - (0.67 * age));
        int heartRateReserve = maximumHeartRate - restingHeartRate;
        int lowerLimit = (int)((heartRateReserve * 0.65) + restingHeartRate);
        int upperLimit = (int)((heartRateReserve * 0.85) + restingHeartRate);

        //Determine if heart rate after exercise is not within the target zone's min and max.
        //If heart rate is below, change value of zone variable to "below".
        under = exersiseHeartRate <= lowerLimit;
        if ( under )
            zone = "below";
        
        //If heart rate is above, change value of zone variable to "above".
        over = exersiseHeartRate >= upperLimit;
        if ( over )
            zone = "above";

        //Print two output statements
        //The first stating the heart rate target zone values.
        System.out.println();
        System.out.println( "Your heart rate target zone is between " + lowerLimit + " and " + upperLimit + " BPM." );
        
        //The second stating if the heart rate after exercise  was within, above or below
        //the target zone. Use the variable "zone" to display the correct status.
        System.out.println();
        System.out.println( "Your heart rate after exersise was " + zone + " your target zone." ); 

    } //end main
}//end class TargetZone