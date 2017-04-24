/**
 * This program demonstrates overloading methods.
 * Notice that the program has been divided into two different classes
 * each in a different file.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 05/30/07
 */
public class OverloadedMethodsTesterV3
{
    public static void main(String[] args)
    {
        OverloadedMethodsV3 overload = new OverloadedMethodsV3();
        
        System.out.println("Two doubles passed: " + overload.calcRectArea(4.75, 15.5));
        System.out.println("One int passed: " + overload.calcRectArea(9));
        System.out.println("Two ints passed: " + overload.calcRectArea(4, 15));
    }
}
