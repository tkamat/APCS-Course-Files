
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
public class FormattingNumericValues
{
    public static void main(String [] args)
    {
        int intArgument1 = 16934;
        int intArgument2 = 12;
        int intArgument3 = -301;
        int intArgument4 = 7432;
        
        double doubleArgument = 3.141592654;
        
        //Formatting integers without specifying a field width
        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%d\n", 16934);    
        System.out.printf("%d\n", 12);
        System.out.printf("%d\n", -301);
        System.out.printf("% d\n", 7432);
        System.out.println();
        
        //Don't forget to uncomment the following sections as you work through
        //the lesson.
        

        //Formatting integers with a field width
        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%10d\n", intArgument1);
        System.out.printf("%10d\n", intArgument2);
        System.out.printf("%10d\n", intArgument3);
        System.out.printf("%10d\n", intArgument4);
        System.out.printf("%+10d\n", intArgument4);
        System.out.println();

       
        //Formatting integers with commas

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%,10d\n", intArgument1);
        System.out.printf("%,10d\n", intArgument2);
        System.out.printf("%,10d\n", intArgument3);
        System.out.printf("%,10d\n", intArgument4);
        System.out.printf("%,+10d\n", intArgument4);       
        System.out.println();

        
        //Formatting multiple integer arguments in one statement

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%10d%7d%,15d\n",-25,4963,7894502);
        System.out.println();

        
        //Formatting duoble values

        System.out.println(".........1.........2.........3.........4.........5");        
        System.out.printf("%f\n",3.141592654);
        System.out.printf("%9f\n",3.141592654);
        System.out.printf("%12.9f\n",3.141592654);
        System.out.printf("%15.4f\n",3.141592654);

        
        System.out.println();
        System.out.println();
    
        
    }
}
