/**
 * Write a description of class Main here.
 *
 * @author Tushaar
 * @version 8/28/2016
 */
import java.util.Scanner;
public class NumericArrayDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int doubleNum = 0;
        double[] doubleArray = {34.5, 324.4, 3.3, 435.5, 3.9, 4.5, 4.6, 3.9, 456.7, 343.8, 23.4, 45.5, 43.4, 3456.7, 34.4, .345, 345.4,
                                234.2, 43.4, 231.2};
        
        
        while(doubleNum  <= 20)
        {
            System.out.print("Enter a number from 1 - 20 (21 to quit): ");
            doubleNum = in.nextInt();

            if(doubleNum <= 20)
            {
                System.out.println("Int number " + doubleNum + " is: "
                        + doubleArray[doubleNum - 1]
                        + ".  It is in array position "
                        + (doubleNum - 1) + ".");
            }
            else
            {
                System.out.println("Thank you.");
            }
        }
    }
}