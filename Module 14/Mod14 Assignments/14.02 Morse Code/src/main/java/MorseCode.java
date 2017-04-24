import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Translates a message from English to Morse Code.
 *
 * @author Tushaar Kamat
 * @version 11/14/2016
 */
public class MorseCode {

    /**
     * Parses a file to create an ArrayList of values
     *
     * @param file
     *            the input file to read
     * @return ArrayList containing values in the file
     */
    public static ArrayList<String> readFile(File file) throws IOException {
        Scanner inFile = new Scanner(file);
        ArrayList<String> output = new ArrayList<String>();
        while (inFile.hasNext()) {
            output.add(inFile.next());
        }
        inFile.close();
        return output;
    }

    /**
     * Converts an English message into Morse code
     *
     * @param message
     *            the original English message
     * @return new message in Morse code
     */
    public static String convertMessageToMorse(String message) throws IOException {
        ArrayList<String> morse = readFile(new File("morse.txt"));
        String morseMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            int charInt = (int) character;
            // uppercase letters
            if (charInt >= 65 && charInt <= 90) {
                morseMessage = morseMessage + morse.get(charInt - 65) + " ";
            }
            // lowercase letters
            else if (charInt >= 97 && charInt <= 122) {
                morseMessage = morseMessage + morse.get(charInt - 97) + " ";
            }
            // numbers
            else if (charInt >= 48 && charInt <= 57) {
                // 1-9
                if (charInt > 48) {
                    morseMessage = morseMessage + morse.get(charInt - 23) + " ";
                }
                // 0
                else {
                    morseMessage = morseMessage + morse.get(35);
                }
            }
            // space between words
            else if (charInt == 32) {
                morseMessage = morseMessage + " ";
            }
        }
        return morseMessage;
    }
}
