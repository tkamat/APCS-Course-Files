import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFileReader
{
   public static void main(String[] args) throws IOException
   {
      double token = 0;
      double sum = 0.0;
      File fileName = new File("data5.txt");
      Scanner inFile = new Scanner(fileName); 
      while (inFile.hasNextDouble())
      {
         token = inFile.nextDouble( );
         System.out.println(token);
         sum += token;
      }
      System.out.println( "Sum: " + sum );
      inFile.close();
      
    }//end of main method
}//end of class 