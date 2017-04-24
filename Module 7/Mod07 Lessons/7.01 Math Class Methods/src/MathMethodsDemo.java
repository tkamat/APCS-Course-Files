
/**
 * This class demonstrates the use of several members of the Math class
 * 
 *     NOTE: There are 6 segments of code below.  The last five are commented out.
 *           Examine only one segment at a time.  Experiment by the arguments of the methods.
 *           
 *           After you understand the code in one section, delete the slash and asterisk at the beginning of the next section
 *           and the asterisk and slash at the end of the section in order to continue experimenting.
 * 
 * @author B. Jordan 
 * @version 02/01/07
 */
public class MathMethodsDemo
{
    public static void main(String[ ] args)
    {
        //example of raising a number to the nth power
        double number = 2;
        double nthPower = 15;
        double powValue = Math.pow(number, nthPower);
        System.out.println(number + " to the power of " + nthPower + ": " + powValue);
        System.out.println();
        
        
        //another example of raising a number to the nth power
        number = 23;
        nthPower = 2;
        powValue = Math.pow(number, nthPower);
        System.out.println(number + " to the power of " + nthPower + ": " + powValue);
        System.out.println();

        
        //examples of decimal absolute values
        double decimalNumber = 4.56;        //change this to a negative number
        double decimalAbsValue = Math.abs(decimalNumber);
        System.out.println("The absolute value of " + decimalNumber + " is: " + decimalAbsValue);
        System.out.println();

       
        //example of integer absolute values
        int anotherNumber = -14;  //notice that intNum1 has been assigned a new value, -14 replaces 23 in the intNum1 variable
        int intAbsValue = Math.abs(anotherNumber);
        System.out.println("The absolute value of " + anotherNumber + " is: " + intAbsValue);
        System.out.println();

             
        //example of finding the square root of a value
        double someNumber = 17.5;
        double squareRoot = Math.sqrt(someNumber);
        System.out.println("The square root of " + someNumber + " is: " + squareRoot);
        System.out.println();

        
        //example of using the constant PI to calculate a circumference
        //notice that PI is not assigned a value, it has a constant value assigned by the Math class
		double radius = 3.5;
		double circumference = 2 * Math.PI * radius;
		System.out.println("The circumference of a circle with radius " + radius + " is: " + circumference);
        System.out.println();

        int a = 3;
        int b = 4;
        int c = (int)(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("C = " + c);
        System.out.println();

        double angle = 60;
        double sin = Math.cos((Math.PI / 2) - Math.toRadians(angle));
        System.out.println(sin);
        System.out.println();

        int x1 = 5;
        int x2 = 10;
        double answer = Math.sqrt(Math.pow(Math.abs(x2 - x1),3));
        System.out.println(answer);

    }//end of main method
}//end of class
