
/**
 * Write a description of class RandomNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random; 
public class RandomNumbers
{
    public static void main ( String [] args )
    {
        double randNum = 0;
        Random randNumList = new Random();
        
        for ( int n = 1; n <= 25; n++ )
        {
            randNum = randNumList.nextDouble( );
            System.out.println( (randNum * 100) + 100 + " " );
        }
    }
}
