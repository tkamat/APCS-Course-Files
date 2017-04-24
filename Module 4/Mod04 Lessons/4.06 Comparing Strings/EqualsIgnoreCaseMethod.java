
/**
 * The purpose of this program is to demonstrate the use of the equalsIgnoreCase() method.
 * 
 * @author B. Jordan 
 * @version 03/28/07
 */
import java.util.Scanner;
public class EqualsIgnoreCaseMethod
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the name of your course");
        String course = in.nextLine();
        System.out.println();
        
        if(course.equalsIgnoreCase("AP Computer Science A"))
        {
            System.out.println("Welcome to " + course);
            System.out.println("Today we are covering how to compare Strings and");
            System.out.println("multi-line blocks of code.");
        }
        else
        {
            System.out.println("Sorry, this is not " + course);
            System.out.println("Please check your schedule.");
        }
    }
       
}
