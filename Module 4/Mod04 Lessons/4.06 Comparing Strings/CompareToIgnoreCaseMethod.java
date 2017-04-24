
/**
 * The purpose of this program is to demonstrate the use of the compareTo() method.
 * 
 * @author B. Jordan 
 * @version 03/28/07
 */
import java.util.Scanner;
public class CompareToIgnoreCaseMethod
{
    public static void main(String[] args)
    {
        String myWord = "programming";
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String yourWord = in.next();
        System.out.println();
        
        int value = yourWord.compareToIgnoreCase(myWord);
        
        System.out.println("In a list of words, our words would be written in this order. ");
        if(value < 0)
        {
            System.out.println(yourWord);
            System.out.println(myWord);
        }
        else if(value > 0)
        {
            System.out.println(myWord);
            System.out.println(yourWord);
        }
        else
        {
            System.out.println(yourWord);
            System.out.println(myWord);
            System.out.println("We chose the same word");
        }
        
            
    }
       
}
