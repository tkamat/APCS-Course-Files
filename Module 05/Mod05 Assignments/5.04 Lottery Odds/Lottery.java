/**
 * Determines if the user has correctly chosen a randomly selected three digit number
 * 
 * @author Tushaar Kamat
 * @version 8/25/16
 */
 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        
        String lotteryNum = "";
        String userGuess = "";
        int digit = 0;
                
        //Generate a 3-digit "lottery" number composed of random numbers
        //Simulate a lottery by drawing one number at a time and 
        //concatenating it to the string
        //Identify the repeated steps and use a for loop structure
        for ( int i = 1; i <= 3; i++ )
        {
            double randNum = Math.random();
            digit = (int) (randNum * 10);
            lotteryNum += digit;
        }
      
        //Input: Ask user to guess 3 digit number
        System.out.print( "Please enter a whole three digit number (i.e. 029): " );
        userGuess = in.next();
             
        //Find the front and back ends of the user and winning number
        String winningFrontEnd = lotteryNum.substring( 0, 2 );
        String userFrontEnd = userGuess.substring( 0, 2 );
        String winningBackEnd = lotteryNum.substring( 1, 3 );
        String userBackEnd = userGuess.substring( 1, 3 );
        
        //Compare the user's guess to the lottery number and report results
        if ( lotteryNum.equals( userGuess ) )
        {
            System.out.println( "\t Winner: " + lotteryNum );
            System.out.println( "\t Congratulations, both pairs matched!" );
        }
        else if ( winningFrontEnd.equals( userFrontEnd ) )
        {
            System.out.println( "\n\t Winner: " + lotteryNum );
            System.out.println( "\t Congratulations, the front pair matched!" );
        }
        else if ( winningBackEnd.equals( userBackEnd ) )
        {
            System.out.println( "\t Winner: " + lotteryNum );
            System.out.println( "\t Congratulations, the end pair matched!" );
        }
        else
        {
            System.out.println( "\t Winner: " + lotteryNum );
            System.out.println( "\t Sorry, no matches. You only had one \n\t chance out of 100 to win anyway." );
        }
    } //end main
}//end class Lottery