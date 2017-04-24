/**
 * Program to calculate the Total Daily Energy Expenditure
 *
 * @author Tushaar Kamat
 * @version 8/21/16
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input: Gather information from user
        System.out.print("Please enter your name: ");
        String name = in.next();
        name += in.nextLine();
        System.out.print("Please enter your BMR: " );
        double basalMR = in.nextDouble();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        System.out.println();

        // Activity Level Menu
        System.out.println("Select Your Activity Level");
        System.out.println("[0] Resting (Sleeping, Reclining)");
        System.out.println("[1] Sedentary (Minimal Movement)");
        System.out.println("[2] Light (Sitting, Standing)");
        System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[5] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the number corresponding to your activity level: ");
        String choice = in.next();
        System.out.println();

        //Processing:
        // Activity Factor
        double activityFactor = 0.0;

        //calculate activity factor
        if ( (gender.equalsIgnoreCase( "M" ) || gender.equalsIgnoreCase( "F" )) && choice.equals( "0" ) )
        {
            activityFactor = 1.0;
        }
        else if ( (gender.equalsIgnoreCase( "M" ) || gender.equalsIgnoreCase( "F" ) ) && choice.equals( "1" ) )
        {
            activityFactor = 1.3;
        }
        else if ( gender.equalsIgnoreCase( "M" ) && choice.equals( "2" ) )
        {
            activityFactor = 1.6;
        }
        else if ( gender.equalsIgnoreCase( "F" ) && choice.equals( "2" ) )
        {
            activityFactor = 1.5;
        }
        else if ( gender.equalsIgnoreCase( "M" ) && choice.equals( "3" ) )
        {
            activityFactor = 1.7;
        }
        else if ( gender.equalsIgnoreCase( "F" ) && choice.equals( "3" ) )
        {
            activityFactor = 1.6;
        }
        else if ( gender.equalsIgnoreCase( "M" ) && choice.equals( "4" ) )
        {
            activityFactor = 2.1;
        }
        else if ( gender.equalsIgnoreCase( "F" ) && choice.equals( "4" ) )
        {
            activityFactor = 1.9;
        }
        else if ( gender.equalsIgnoreCase( "M" ) && choice.equals( "5" ) )
        {
            activityFactor = 2.4;
        }
        else if ( gender.equalsIgnoreCase( "F" ) && choice.equals( "5" ) )
        {
            activityFactor = 2.2;
        }
        else 
        {
            System.out.println( "You did not enter a valid activity level or gender!" );
        }
        
        // Calculate TDEE
        double tDEE = basalMR * activityFactor;
        double tDEERounded = (int)(tDEE * 10.0) / 10.0;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEERounded + " calories ");

    }
}

