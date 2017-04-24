
/**
 * This program demonstrates overloading methods.
 * All source code is contained in one file, but there are two classes.
 * Notice that when there are two classes in the same file, only the
 * one containing the main() method is public.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 05/30/07
 */
class OverloadedMethodsV2
{
    //default constructor   
    OverloadedMethodsV2()
    {
    }
    
    //first circle area method with two int parameters
    public int calcRectArea(int s1, int s2)
    {
        return s1 * s2;
    }
    
    //second circle area method with two double parameters
    public double calcRectArea(double s3, double s4)
    {
        return s3 * s4;
    }
    
    //third circle area method with a single int parameter
    public int calcRectArea(int s1)
    {
        return (int)Math.pow(s1,2);
    }
}
public class OverloadedMethodsTesterV2
{    
    public static void main(String[] args)
    {
        OverloadedMethodsV2 overload = new OverloadedMethodsV2();
        
        System.out.println("Two doubles passed: " + overload.calcRectArea(4.75, 15.5));
        System.out.println("One int passed: " + overload.calcRectArea(9));
        System.out.println("Two ints passed: " + overload.calcRectArea(4, 15));
    }
}
