

/**
 * Write a description of class Main here.
 *
 * @author Tushaar
 * @version 8/28/2016
 */
import java.util.Scanner;
public class NumericArrayDemo1 {
    public static void main(String [] args) {
        int [ ] intArray;
        int intNum = 0;

        intArray = new int[10];
        Scanner in = new Scanner(System.in);

        intArray[0] = 34;
        intArray[1] = 686;
        intArray[2] = 664;
        intArray[3] = 32;
        intArray[4] = 334;
        intArray[5] = 187;
        intArray[6] = 224;
        intArray[7] = 29;
        intArray[8] = 55;
        intArray[9] = 66;

        while(intNum  <= 10)
        {
            System.out.print("Enter a number from 1 - 10 (11 to quit): ");
            intNum = in.nextInt();

            if(intNum <= 10)
            {
                System.out.println("Int number " + intNum + " is: "
                        + intArray[intNum - 1]
                        + ".  It is in array position "
                        + (intNum - 1) + ".");
            }
            else
            {
                System.out.println("Thank you.");
            }
        }
    }
}