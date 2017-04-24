/**
 * Extends the box class to create a cube with the same length width and height.
 *
 * @author Tushaar Kamat
 * @version 11/13/2016
 */
public class Cube3 extends Box3 {

    /**
     * Constructor for Cube3 class.
     */
    public Cube3(int d) {
        super(d, d, d);
    }

    /**
     * Shows dimensions for a Cube.
     *
     * @return dimensions of cube.
     */
    public String toString() {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

}