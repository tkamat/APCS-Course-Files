
/**
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 * 
 * @author B.Jordan 
 * @version 04/15/2007
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
class MysteryPrintWriter
{
   public static void main (String [ ] args) throws IOException
   {
      //construct an object called outFile to allow access to output methods of the PrintWriter class  
      PrintWriter outFile = new PrintWriter(new File("bah.txt"));   

      for (int loop = 1; loop <= 10; loop++)    
      {
          outFile.println(loop + " " + (char)(83) + (char)(104) + (char)(101) + (char)(101) + (char)(112));
      }//end of for loop
      outFile.close ( );    //close the file when finished 
      
   }//end of main method
}//end of class 

