
/**
 * The purpose of this program is to illustrate the use of the for loop
 * as a counter.
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 04/02/2007
 */
public class CountingWithForLoops
{
    public static void main(String [] args)
    {
        int theTerminator = 0;   //initialize the terminating condition
        
        for(double counter = 10; counter > theTerminator; counter -= .01)     //test the terminating condition
        {
            System.out.println("counter = " + counter);
            
        }//end of for loop  
    }//end of main method
}//end of class
