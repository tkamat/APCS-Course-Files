/**
 * The purpose of this program is to demonstrate the use of the toLowerCase() method.
 * 
 * @author B. Jordan 
 * @version 03/28/07
 */
import java.util.Scanner;
public class ToLowerCaseMethod
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a word or sentence in all upperrcase letters. ");
        String userInput = in.nextLine();
        System.out.println();
        
        String lowerCase = userInput.toLowerCase();
        
        System.out.println("Original input: " + userInput);
        System.out.println("In lower case: " + lowerCase);
        
        
        
    }
       
}
