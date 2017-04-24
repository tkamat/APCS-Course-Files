/**
 * This class uses recursion to reverse a series of words entered from the keyboard.
 *
 * FLVS 2007 Lesson 12.03 Lab
 * @author B. Jordan
 * @version 08/10/07
 */
import java.util.Scanner;
public class ReverseUserInput
{
    Scanner in = new Scanner(System.in);                    //creates new Scanner object

    //a recursive method to reverse the order of user input
    public void reverseInput()
    {
        System.out.print("Enter a word ('q' to quit): ");   //prompts user
        String aWord = in.next();                           //accepts user input
        if(aWord.equals("q"))
            System.out.println();
        else
            reverseInput();
        System.out.println(aWord);
    }

    public static void main(String[] args)
    {
        ReverseUserInput reverseIt = new ReverseUserInput();    //creates new object
        System.out.print("Enter a list of words,");
        System.out.print(" press Enter after each word.  ");
        System.out.println("Type \'q\' to finish.");

        reverseIt.reverseInput();                               //invokes reverseInput() method
    }
}
