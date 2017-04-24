
/**
 * This class tests recursive methods
 *
 * @author B. Jordan
 * @version 08/01/07
 */

class RecursiveMethods
{
    RecursiveMethods()          //default constructor
    {
    }

    public int fOf(int x)
    {
        if (x <= 10)                        //the base case
        {
            System.out.println(x + " <= 10, therefore ... f(" + x + ") = -5");
            return -5;
        }
        else
        {
            System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 3) + 2 = f(" + (x -3) + ") + 2");
            return fOf(x-3) + 2;
        }
    }
}

public class RecursionMethodTester
{
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();

        System.out.println("---------------------------------");
        System.out.println("       f(x - 3) + 2    if x >  10");
        System.out.println("f(x) = ");
        System.out.println("       -5              if x <= 10");
        System.out.println("---------------------------------");
        System.out.println();

        x = 20;
        System.out.println("Example 1:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();

        x = 19;
        System.out.println("Example 2:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();

        x = 18;
        System.out.println("Example 3:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
    }
}
