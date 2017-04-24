
import java.util.Scanner;

/**
 * Tests the RecursivePalindrome class with user input.
 *
 * @author Tushaar Kamat
 * @version 10/30/2016
 */
public class RecursivePalindromeTester {

    public static void main(String args[]) {
        RecursivePalindrome palindrome = new RecursivePalindrome();
        Scanner in = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing == true) {
            System.out.println("Enter a word or phrase to check if it is a palindrome (q to quit)");
            String input = in.nextLine();
            if (input.equals("q")) {
                keepGoing = false;
            }
            else {
                boolean isPalindrome = palindrome.checkIsPalindrome(input);
                if (isPalindrome) {
                    System.out.println("You entered a palindrome!");
                }
                else {
                    System.out.println("Your input was not a palindrome.");
                }
            }
        }
    }
}