
import java.util.Scanner;

/**
 * Tests the CaesarShiftEncryption and CaesarShiftDecryption classes
 *
 * @author Tushaar Kamat
 * @version 11/16/2016
 */
public class CaesarShiftTester {

    public static final String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    public static void main(String args[]) {
        boolean cont = true;
        String response = "";
        Scanner in = new Scanner(System.in);
        while (cont == true) {
            System.out.println("e) Encrypt a message");
            System.out.println("d) Decrypt a message");
            System.out.println("q) Quit");
            response = in.next();
            System.out.println();
            if (response.equalsIgnoreCase("e")) {
                System.out.println("Please enter a shift value from 0 to 25: ");
                final int shiftValue = in.nextInt();
                System.out.println("Alphabets:");
                String[] cypherAlphabet = CaesarShiftEncryption.generateCypherAlphabet(shiftValue);
                System.out.println();
                System.out.println("Enter a message to encrypt (All lowercase no punctuation): ");
                String message = in.next() + in.nextLine();
                System.out.println("Encrypted message: " + CaesarShiftEncryption.encrypt(cypherAlphabet, message));
            }
            else if (response.equalsIgnoreCase("d")) {
                System.out.println("Please enter a shift value from 0 to 25: ");
                final int shiftValue = in.nextInt();
                System.out.println("Alphabets:");
                String[] cypherAlphabet = CaesarShiftDecryption.generateCypherAlphabet(shiftValue);
                System.out.println();
                System.out.println("Enter a message to decrypt (All lowercase no punctuation): ");
                String message = in.next() + in.nextLine();
                System.out.println("Decrypted message: " + CaesarShiftDecryption.decrypt(cypherAlphabet, message));
            }
            else if (response.equalsIgnoreCase("q")) {
                cont = false;
            }
        }
    }
}