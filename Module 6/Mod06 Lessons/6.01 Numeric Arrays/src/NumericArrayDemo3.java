import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author Tushaar
 * @version 8/28/2016
 */
public class NumericArrayDemo3 {
    public static void main(String[] args) {
        double[] doubleNames = new double[9];

        Scanner in = new Scanner(System.in);

        for(int n = 0; n <= 6; n++)
        {
            System.out.println("Enter the name of double number " + (n + 1) + ": ");
            doubleNames[n] = in.nextDouble();
        }

        for(int n = 0; n <= 6; n++)
        {
            System.out.println("Double number " + (n + 1) + " is: "
                    + doubleNames[n] + ".  It is in array position "
                    + n + ".");
        }
        System.out.println("Thank you, all doubles are in the array.");
    }
}