/**
 * This class demonstrates techniques for using mixed types in arithmetic expressions.
 * 
 * Parts of the code have been commented out by using a slash and an asterisc at the beginning of a code segment
 * and an asterisc and a slash at the end of a code segment.  Remove those when you want to uncomment that 
 * segment of code
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 02/01/07
 */
public class MixedTypes
{
    public static void main(String[ ] args)
    {
        // declare and assign local variables
        int iX = 23;                    //integer value
        int iY = -14;                   //integer value
        double dX = 33.987;             //double value
        double dY = -0.04387;           //double value
        
        int iSum;                       //integer sum 
        double dSum;                    //double sum
        
        // This is an example of Assignment Conversion
        double x = 100;     //100 is an int, but it is assigned to x which is a double
        System.out.println("This is an example of Assignment Conversion: double x = 100;");
        System.out.println("100 is an int, but it is assigned to x which is a double.");
        System.out.println("Consequently, the value of x is now: " + x);
        System.out.println();
        
        // This is an example of Aritmetic Promotion
        double y = 3.14 * 10 * 10;      //The 10s are ints, but 3.14 is a double
        System.out.println("This is an example of Aritmetic Promotion: double y = 3.14 * 10 * 10;");
        System.out.println("The 10s are ints, but 3.14 is a double");
        System.out.println("Consequently, the 10s are promoted to doubles.");
        System.out.println("The value of y is: " + y);
        System.out.println();
        
        // This is an example of Casting demotion
        int z = (int)3.14 * 10 * 10;
        System.out.println("This is an example of Casting demotion: int z = (int)3.14 * 10 * 10;");
        System.out.println("Placing (int) in front of 3.14 causes the decimal number to be treated as 3, an int.");
        System.out.println("The value of z is: " + z);
        System.out.println();
        
        
        // Addition with variables of same type: int   
        System.out.println("Addition of two ints");
        iSum = iX + iY;
        System.out.print(iX + " + " + iY + " = ");
        System.out.println(iSum);
        System.out.println();
        
        
        // Addition with variables of same type: double   
        System.out.println("Addition of two doubles");
        dSum = dX + dY;
        System.out.print(dX + " + " + dY + " = ");
        System.out.println(dSum);
        System.out.println();
        
        
        // Addition with variables of differnt type           
        System.out.println("Addition of mixed variable types");
        dSum = dX + iY; //Why is iSum the wrong type to use in this statement?
        System.out.print(iX + " + " + iY + " = ");
        System.out.println(dSum);
        System.out.println();
        

       
        // arithmetic promotion of an int to a double   
        System.out.println("Arithmetically promoting an int to a double");
        System.out.println("in which an increase of precision occurs");
        dSum = iX + dY;
        System.out.print(iX + " + " + dY + " = ");
        System.out.println(dSum);
        System.out.println();
       
        
        // casting double to an int, a narrowing conversion   
        System.out.println("Casting a double to an int (narrowing)");
        System.out.println("in which a loss of precision occurs.");
        iSum = iX + (int)dY;
        System.out.print(iX + " + " + (int)dY + " = ");
        System.out.println(iSum);
        System.out.println();
        
        
        // casting an int to a double, a widening conversion  
        System.out.println("Casting an int to a double (widening)");
        System.out.println("in which an increase of precision occurs.");
        dSum = (double)iX + dY;
        System.out.print((double)iX + " + " + dY + " = ");
        System.out.println(dSum);
        System.out.println();
         
    }//end of main method
}//end of class

