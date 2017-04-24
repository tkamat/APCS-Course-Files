
import java.util.ArrayList;

/**
 * Determines whether Strings are palindromes
 *
 * @author Tushaar Kamat
 * @version 10/30/2016
 */
public class RecursivePalindrome {

    /**
     * Helper method to remove punctuation and spaces.
     *
     * @param str
     *            the original String.
     * @return new String with the punctuation and spaces removed.
     */
    public static String removePunctuationAndSpaces(String str) {
        ArrayList<Character> strArray = new ArrayList<Character>();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            strArray.add(i, letter);
        }
        for (int i = strArray.size() - 1; i >= 0; i--) {
            if ((strArray.get(i) < 65 || strArray.get(i) > 90) && (strArray.get(i) < 97 || strArray.get(i) > 122)) {
                strArray.remove(i);
            }
        }
        for (char letter : strArray) {
            newStr += letter;
        }
        return newStr;
    }

    /**
     * Recursive method to determine if a String is a palindrome.
     *
     * @param str
     *            the input to be tested.
     * @return boolean indicating whether the String was a palindrome
     */
    public boolean checkIsPalindrome(String str) {
        str = removePunctuationAndSpaces(str);
        if (str.length() == 0) {
            return true;
        }
        else if (str.length() == 1) {
            return true;
        }
        else {
            String firstLetter = str.substring(0, 1);
            String lastLetter = str.substring(str.length() - 1);
            if (firstLetter.equalsIgnoreCase(lastLetter)) {
                String newStr = str.substring(1, str.length() - 1);
                return checkIsPalindrome(newStr);
            }
            else {
                return false;
            }
        }
    }
}