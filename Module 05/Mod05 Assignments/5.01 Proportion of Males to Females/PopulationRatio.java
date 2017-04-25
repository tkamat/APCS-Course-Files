
/**
 * Simulates the male to female population ratio in India. 
 * 
 * @author Tushaar Kamat 
 * @version 8/23/16
 */

import java.util.Scanner;
public class PopulationRatio
{
    public static void main( String [] args )
    {
        //local variables
        
        int males = 0;
        int females = 0;
        int counter = 1;
        int sampleSize = 0;
        double randNum = 0.0;
        Scanner in = new Scanner( System.in );
        
        
        //user input
        System.out.println();
        System.out.println( "Enter the population sample size: " );
        sampleSize = in.nextInt();
        System.out.println();
        
        //generation of population through loop
        while ( counter <= sampleSize )
        {
            System.out.print( counter );
            randNum = Math.random();
            System.out.print( "\t" + randNum );
      
            if ( randNum < 0.519 )
            {
                males++;
                System.out.println( "\t male" );
            }
            else 
            {
                females++;
                System.out.println( "\t female" );
            }
            counter++;
        }    
                        
        //printed output
        System.out.println();
        System.out.println( "Number of males: " + males );
        System.out.println( "Number of females: " + females );
    }
}
