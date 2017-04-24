
        
        
/**
 * This program demonstrates how to assign values to individual
 * positions in a String array.
 * 
 * @author B. Jordan 
 * @version 03/29/07
 */
import java.util.Scanner;
public class StringArrayDemo1
{
    public static void main(String [] args)
    {
        String [ ] dwarfNames;
        int dwarfNum = 0;
        
        dwarfNames = new String[8];
        Scanner in = new Scanner(System.in);
        
        dwarfNames[0] = "Sleepy";
        dwarfNames[1] = "Sneezy";
        dwarfNames[2] = "Doc";
        dwarfNames[3] = "Dopey";
        dwarfNames[4] = "Happy";
        dwarfNames[5] = "Bashful";
        dwarfNames[6] = "Grumpy";
        
        while(dwarfNum  <= 7)
        {
            System.out.print("Enter a number from 1 - 7 (8 to quit): ");
            dwarfNum = in.nextInt();
            
            if(dwarfNum <= 7)
            {            
                System.out.println("Dwarf number " + dwarfNum + " is: " 
                                  + dwarfNames[dwarfNum - 1] 
                                  + ".  He is in array position " 
                                  + (dwarfNum - 1) + ".");
            }
            else
            {
                System.out.println("Thank you, all dwarfs are in the array.");
            }
        }
       
       }
    }
