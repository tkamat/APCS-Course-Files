
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class StringArrayDemo4
{
    public static void main(String[ ] args) throws IOException
    {
        int index = 0;
        String [ ] dwarfNames = new String[9];
        File fileName = new File("seven.txt");
        Scanner inFile = new Scanner(fileName);
        
        while (inFile.hasNext())
        {
            
            dwarfNames[index] = inFile.next();
            index++;
        }
        
        for(int n = 0; n <= 8; n++)
        {
            System.out.println("Dwarf number " + (n + 1) + " is: " 
                                  + dwarfNames[n] + ".  He is in array position " 
                                  + n + ".");
        }  
        
        inFile.close();
        System.out.println("Thank you, all dwarfs are in the array now.");
        System.out.println(dwarfNames.length);
    }//end of main method
}//end of class 
