/**
 * Tests the Rectangle3, Box3, and Cube3 classes.
 *
 * @author Tushaar Kamat
 * @version 11/13/2016
 */
public class testNew {

    /**
     * Prints the dimensions of a Rectangle using polymorphism and overriding.
     *
     * @param r
     */
    public static void showEffectBoth(Rectangle3 r) {
        System.out.println(r);
    }

    /**
     * Prints the dimensions of two Rectangles and compares them.
     *
     * @param r1
     * @param r2
     */
    public static void showEffectBoth(Rectangle3 r1, Rectangle3 r2) {
        if (r1.equals(r2)) {
            System.out.println(r1 + " is the same size as " + r2);
        }
        else {
            System.out.println(r1 + " is not the same size as " + r2);
        }
    }

    public static void main(String args[]) {
        Rectangle3 one = new Rectangle3(5, 20);
        Box3 two = new Box3(4, 4, 4);
        Box3 three = new Box3(4, 10, 5);
        Cube3 four = new Cube3(4);
        showEffectBoth(one);
        showEffectBoth(two);
        showEffectBoth(three);
        showEffectBoth(four);
        showEffectBoth(two, four);
        showEffectBoth(three, four);
    }
}