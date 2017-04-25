
/**
 * Determines the surface gravity on each planet in the solar system. 
 *
 * @author Tushaar K.
 * @version 9/4/2016
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Gravity
{
	// calcGravity returns an array of doubles containing the gravity values
	//and takes two arrays of doubles as parameters for the radius values and mass
	public static double[] calcGravity(double[] radius, double[] mass)
	{
		// fill in code here
		// The formula to calculate gravity is:
		// 6.67E-17 times the massOfPlanet divided by the radius of the planet squared
		double gravityConstant = 6.67E-17;
        double[] gravity = new double[radius.length];

        for (int i = 0; i < gravity.length; i++) {
            gravity[i] = (gravityConstant * mass[i]) / Math.pow(radius[i], 2);
        }
        return gravity;
    }

	// printResults will print the table to output screen
	// return type is void because no values are returned
	public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
	{
        // fill in code here
        System.out.printf("%37s%n", "Planetary Data");
        System.out.printf("%-7s%18s%15s%13s%n", "Planet (km)", "Diameter (km)", "Mass (kg)", "g (m/s^2");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < name.length; i ++) {
            System.out.printf("%-7s%19.1f%17.2E%12.2f%n", name[i], radius[i] * 2, mass[i], gravity[i]);
        }

	}

	//print the gravity values to text file
	public static void printToFile(double[] gravity) throws IOException
	{
		// fill in code here
        PrintWriter outFile = new PrintWriter(new File("gravity1.txt"));

        for (int i = 0; i < gravity.length; i ++) {
            outFile.println(((int)(gravity[i] * 100.0)) / 100.0);
        }
        outFile.close();
	}

    public static void main(String[] args) throws IOException
    {
        // Initialize variables
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
		double [] masses = {3.30E23, 4.87E24, 5.97E24, 6.42E23, 1.90E27, 5.68E26, 8.68E25, 1.02E26, 1.27E22};

		// Processing
		double[] gravities = calcGravity(radii, masses);

		// Output
		printResults(names, radii, masses, gravities);
		printToFile(gravities);


    } //end main
}//end class