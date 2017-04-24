
/**
 * The purpose of this program is to demonstrate the use of the toUpperCase() method.
 * 
 * @author B. Jordan 
 * @version 03/28/07
 */
import java.util.Scanner;
public class ToUpperCaseMethod
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a word or sentence in all lowercase letters. ");
        String userInput = in.nextLine();
        System.out.println();
        
        String upperCase = userInput.toUpperCase();
        
        System.out.println("Original input: " + userInput);
        System.out.println("In upper case: " + upperCase);
        
    }
       
}
