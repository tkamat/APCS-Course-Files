
/**
 * This program demonstrates how to format strings with the printf() method.
 * Use the program in conjunction with the lesson for Week 5 Day 1.
 * 
 * After reading each section of the lesson on formatting strings, remove the
 * comments for the appropriate section of code, then run it to see printf()
 * in action.
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 04/29/07
 */
public class FormattingStrings
{
    public static void main(String [] args)
    {
        String argument1 = "Tallahassee";
        String argument2 = "Florida";
        
        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%s", argument1); 
        System.out.println();
        System.out.printf("%S", argument1);
        System.out.println();
        System.out.println();
    
        //Don't forget to uncomment the following sections as you work through 
        //the lesson.
        

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%15s\n", argument1);
        System.out.printf("%-15s\n", argument1);
        System.out.println();

    

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%-15s",argument1);
        System.out.printf("%-7s\n",argument2);
        System.out.println();

        

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%-15s%-7s\n", argument1, argument2);
        System.out.println();

       

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%-15s%-7s\n", argument1, argument2);
        System.out.println();

       

        System.out.printf("City: %-15s State: %-7s\n", argument1, argument2);
        System.out.printf("%s is the capitol of %s.\n", argument1, argument2);
        System.out.printf("Florida State University is located in %s, %s.\n", argument1, argument2);
        System.out.printf("The population of %s, %s is over 150,000.\n", argument1, argument2);

    }
}
