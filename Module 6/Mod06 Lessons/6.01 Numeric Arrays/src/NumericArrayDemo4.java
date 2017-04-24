import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author Tushaar
 * @version 8/28/2016
 */
public class NumericArrayDemo4 {
    public static void main(String[] args) throws IOException {
        int index = 0;
        int[] intNames = new int[200];
        File fileName = new File("ints.txt");
        Scanner inFile = new Scanner(fileName);

        while (inFile.hasNext())
        {

            intNames[index] = inFile.nextInt();
            index++;
        }

        for(int n = 0; n <= 199; n++)
        {
            System.out.println("Int number " + (n + 1) + " is: "
                    + intNames[n] + ".  He is in array position "
                    + n + ".");
        }

        inFile.close();
        System.out.println("Thank you, all ints are in the array now.");
        System.out.println(intNames.length);
    }
}