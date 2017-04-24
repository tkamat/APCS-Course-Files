
/**
 * This program converts feet to inches and illustrates the use of a while
 * loop terminated by a user's response (Y or N).
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 4/15/07
 */
import java.util.Scanner;
public class ConvertFeetToInches
{
    public static void main(String[] args)
    {
        double feet = 0;
        double inches = 0;
        
        Scanner in = new Scanner(System.in);  
        
        String convertAnother = "Y";
        
        //notice the use of negating the equals() method to terminate the loop
        while(!convertAnother.equalsIgnoreCase("N"))
        {
            System.out.print("Enter Feet: ");
            feet = in.nextDouble();     //What happens if a user enters an int, a double, or a String?
            
            inches = 12 * feet;
            System.out.println("Inches: " + inches);
            System.out.println();
            System.out.print("Convert another measurement (Y or N): ");  
            convertAnother = in.next();   //What happens if you enter a letter other than Y or N?
        }
        System.out.println("Thank you");
    }
}


