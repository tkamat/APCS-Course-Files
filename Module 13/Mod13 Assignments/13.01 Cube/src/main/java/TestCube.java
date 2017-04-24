/**
 * Tests the Cube and the Rectangle class.
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */
public class TestCube {

    public static void main(String args[]) {
        Rectangle one = new Rectangle(2, 4);
        Cube cube = new Cube(4);

        System.out.println("One's dimensions are " + one.getLength() + " X " + one.getWidth());
        System.out.println("Cube's dimensions are " + cube.getLength() + " X " + cube.getWidth() + " X " + cube.getHeight());
    }
}