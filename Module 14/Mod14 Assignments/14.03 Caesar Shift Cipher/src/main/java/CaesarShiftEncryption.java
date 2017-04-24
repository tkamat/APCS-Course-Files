/**
 * Encrypts a message using a Caesar Shift
 *
 * @author Tushaar Kamat
 * @version 11/16/2016
 */
public class CaesarShiftEncryption {

    public static String[] generateCypherAlphabet(int shiftValue) {
        String[] cypherAlphabet = new String[CaesarShiftTester.alphabet.length];

        for (int i = 0; i < CaesarShiftTester.alphabet.length; i++) {
            if (i + shiftValue >= 0 && i + shiftValue <= 25) {
                cypherAlphabet[i] = CaesarShiftTester.alphabet[i + shiftValue];
            }
            else {
                cypherAlphabet[i] = CaesarShiftTester.alphabet[i + shiftValue - 26];
            }
        }
        for (String letter : CaesarShiftTester.alphabet) {
            System.out.print(letter);
        }
        System.out.println();
        for (String letter : cypherAlphabet) {
            System.out.print(letter);
        }
        System.out.println();
        return cypherAlphabet;
    }

    public static String encrypt(String[] cypherAlphabet, String message) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                encryptedMessage += " ";
            }
            else {
                for (int j = 0; j < cypherAlphabet.length; j++) {
                    if (message.substring(i, i + 1).equals(CaesarShiftTester.alphabet[j])) {
                        encryptedMessage += cypherAlphabet[j];
                    }
                }
            }
        }
        return encryptedMessage;
    }
}
