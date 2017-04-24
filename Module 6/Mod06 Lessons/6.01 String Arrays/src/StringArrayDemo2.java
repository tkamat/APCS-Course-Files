
/**
 * Write a description of class ArrayDemos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringArrayDemo2
{
    public static void main(String [] args)
    {
        String [] names = {"Sleepy","Sneezy","Doc","Dopey","Happy","Bashful","Grumpy"};
        int dwarfNum = 0;
        
        
        
        Scanner in = new Scanner(System.in);
        
       
        
        while(dwarfNum  <= 7)
        {
            System.out.print("Enter a number from 1 - 7 (8 to quit): ");
            dwarfNum = in.nextInt();
            
            if(dwarfNum <= 7)
            {            
                System.out.println("Dwarf number " + dwarfNum + " is: " 
                                  + names[dwarfNum - 1] + ".  He is in array position " 
                                  + (dwarfNum - 1) + ".");
            }
            else
            {
                System.out.println("Thank you, all dwarfs are in the array.");
            }
        }
        
        
        
        
        
       }
    }
