/**
 * Use the Monte Carlo Method to estimate the average number of bottles of e-Boost
 * someone would have to drink to win a prize. There is a 1 in 5 chance of winning.
 *
 * @author Tushaar K.
 * @version 8/26/26
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
public class BottleCapPrize {

    public static void main(String[] args) throws IOException {

        //local variables and objects
        PrintWriter outFile = new PrintWriter(new File("WinningCaps.txt"));
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of trials: ");
        int trials = in.nextInt();
        int triedCaps = 0;
        int goodCaps = 0;
        Random randNumList = new Random();
        int randNum;
        int triedCapsFile = 0;
        int sum = 0;
        int average;


        //for loop to write data to file
        for (int i = 1; i <= trials; i++) {
            triedCaps = 0;
            goodCaps = 0;
            for (int winners = 0; winners >= goodCaps;) {
                randNum = randNumList.nextInt(5);
                randNum += 1;
                if (randNum == 1) {
                    goodCaps++;
                    triedCaps++;
                }
                else {
                    triedCaps++;
                }
            }
            outFile.println(triedCaps);
        }

        //closes output stream
        outFile.close();

        //reads "WinningCaps.txt" and calculates average. 
        Scanner inFile = new Scanner(new File("WinningCaps.txt"));
        while (inFile.hasNextInt()) {
            triedCapsFile = inFile.nextInt();
            sum += triedCapsFile;
        }
        average = sum/trials;
        System.out.println("Average number of bottles needed for prize: " + average);

        //closes input stream
        inFile.close();
    }
}
