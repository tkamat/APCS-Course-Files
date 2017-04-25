
/**
 * Write a description of class Odometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Odometer
{
    public static void main( String [] args )
    {
        for ( int pos5 = 0; pos5 <= 9; pos5++ )    
            for(int pos4 = 0; pos4 <= 9; pos4++) //loop in 1000s position
                for(int pos3 = 0; pos3 <= 9; pos3++) //loop in 100s position
                    for(int pos2 = 0; pos2 <= 9; pos2++) //loop in 10s position
                         for(int pos1 = 0; pos1 <= 9; pos1++) //loop in 1s position
                                 System.out.println(pos5*10000+pos4*1000+pos3*100+pos2*10+pos1); 
    }
}
