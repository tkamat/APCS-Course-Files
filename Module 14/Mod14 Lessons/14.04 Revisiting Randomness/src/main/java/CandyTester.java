
/**
 * This program reads is the bare shell of a program to tablulate
 * color frequencies in a bag of M&M's.
 *
 * Some suggestions are made for improving the program which will
 * help prepare you for upcomming assignments.
 *
 * @author B. Jordan
 * @version 06/28/08
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Candy {

    private int[] candyColor = new int[6];

    Candy() {
    }

    public void readFile() throws IOException {
        int color = 0;
        Scanner inFile = new Scanner(new File("M&Ms.txt"));
        while (inFile.hasNext()) {
            // color order = red, orange, yellow, green, blue, brown
            candyColor[0] += inFile.nextInt();
            candyColor[1] += inFile.nextInt();
            candyColor[2] += inFile.nextInt();
            candyColor[3] += inFile.nextInt();
            candyColor[4] += inFile.nextInt();
            candyColor[5] += inFile.nextInt();
        }
        inFile.close();
    }

    public void printTotals() {
        for (int index = 0; index < candyColor.length; index++) {
            System.out.println(candyColor[index]);
        }
    }

    // Add a candyColor method to store the colors of M&M's in an array
    // color order = red, orange, yellow, green, blue, brown

    // Add a colorFrequency method to calculate the percentages of each color

}

public class CandyTester {

    public static void main(String[] args) throws IOException {
        Candy candy = new Candy();

        // Student adds a statement to invoke the candyColor method to assign
        // colors to an array

        candy.readFile();

        // Student adds a statement to invoke the colorFrequency method to
        // calculate the percentage of each color

        candy.printTotals(); // modify this method to print a frequency table
                             // showing colors, cumulative numbers, and
                             // percentages
    }
}
