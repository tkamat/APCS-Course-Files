/**
 * test program for square - box
 * 
 * ©FLVS 2007
 * 
 * @author R. Enger
 * @version 5/5/2007
 */
public class Test {

    public static void main(String[] args) {
        Rectangle one = new Rectangle(2, 4);
        Box two = new Box(4, 10, 4);

        System.out.println("For Rectangle:");
        System.out.println("The length is  " + one.getLength());
        System.out.println("The width is " + one.getWidth());
        System.out.println("For Box : ");
        System.out.println("The length is  " + two.getLength());
        System.out.println("The width is " + two.getWidth());

    }

}
