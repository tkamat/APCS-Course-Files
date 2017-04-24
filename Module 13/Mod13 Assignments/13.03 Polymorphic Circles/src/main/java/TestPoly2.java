import java.util.ArrayList;
/**
 * Tests the shape classes using polymorphism.
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */
public class TestPoly2 {

    /**
     * Displays the center for any subclass of Circle2
     *
     * @param c
     */
    public static void showCenter(Circle2 c) {
        System.out.println("For " + c.toString() + " " + c.center());
    }

    public static void main(String args[]) {
        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        shapes.add(new Circle2(2, 4, 3));
        shapes.add(new Cylinder2(10, 15, 3, 6));
        shapes.add(new Oval2(25, 10, 3, 4));
        shapes.add(new OvalCylinder2(40, 10, 3, 4, 6));
        for (Circle2 circle : shapes) {
            showCenter(circle);
        }
    }
}