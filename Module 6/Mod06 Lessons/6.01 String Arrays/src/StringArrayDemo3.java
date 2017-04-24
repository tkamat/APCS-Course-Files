
/**
 * Write a description of class ArrayDemos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringArrayDemo3
{
    public static void main(String [] args)
    {
        String [] dwarfNames = new String[9]; 

        Scanner in = new Scanner(System.in);

        for(int n = 0; n <= 6; n++)
        {
            System.out.println("Enter the name of dwarf number " + (n + 1) + ": ");
            dwarfNames[n] = in.next();
        }
            
        for(int n = 0; n <= 6; n++)
        {
            System.out.println("Dwarf number " + (n + 1) + " is: " 
                                  + dwarfNames[n] + ".  He is in array position " 
                                  + n + ".");
        }  
                System.out.println("Thank you, all dwarfs are in the array.");

        }
    }
