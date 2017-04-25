/**
 * Calculates your weight on each planet in the solar system.
 *
 * @author Tushaar Kamat
 * @version 9/4/2016
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Weight {

    //reads the gravity data from a text file
    public static double[] getGravity() throws IOException {
        Scanner inFile = new Scanner(new File("gravity1.txt"));
        double[] surfaceGravity = new double[9];

        for (int i = 0; i < surfaceGravity.length; i++) {
            surfaceGravity[i] = inFile.nextDouble() / 10.0;
        }
        inFile.close();
        return surfaceGravity;
    }

    //calculates weight on each planet
    public static double[] calcWeight(double earthWeight, double[] gravity) {
        double mass = earthWeight * 433.59237;
        double[] newWeight = new double[9];

        for (int i = 0; i < newWeight.length; i++) {
            newWeight[i] = (mass * gravity[i]) / 433.59237;
        }
        return newWeight;
    }

    //prints results to s formatted table
    public static void printResults(String[] names, double[] gravity, double[] weight) {
        System.out.printf("%29s%n", "My weight on the Planets");
        System.out.printf("%-7s%15s%16s%n", "Planet", "Gravity", "Weight(lbs)");
        System.out.println("---------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-7s%14.2f%14.2f%n", names[i], gravity[i], weight[i]);
        }
    }


    public static void main(String[] args) throws IOException {

        // Extension idea... instead of hard coding the weight, you may prompt the user for input.
        System.out.println("Please enter you weight in pounds: ");
        Scanner in = new Scanner(System.in);
        double earthWeight = in.nextDouble();

        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        double[] gravity = getGravity();                            // static method you write
        double[] weight = calcWeight(earthWeight, gravity);  // static method you write
        printResults(names, gravity, weight);                    // static method you write

    } //end main
}//end class