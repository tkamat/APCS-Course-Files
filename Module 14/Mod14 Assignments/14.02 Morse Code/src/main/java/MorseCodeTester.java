import java.io.IOException;
import java.util.Scanner;

/**
 * Tests the Morse Code Class
 *
 * @author Tushaar Kamat
 * @version 11/14/2016
 */
public class MorseCodeTester {

    public static void main(String args[]) throws IOException {
        System.out.println("Please enter an English message without punctuation: ");
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        System.out.println();
        System.out.println("Morse Code: " + MorseCode.convertMessageToMorse(message));
    }
}