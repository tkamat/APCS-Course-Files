/**
 * Extends the rectangle class to create a box.
 *
 * @author Tushaar Kamat
 * @version 11/13/2016
 */
public class Box3 extends Rectangle3 {

    private int height;

    /**
     * Constructor for objects of class Box3
     */
    public Box3(int l, int w, int h) {
        super(l, w);
        height = h;
    }

    /**
     * Getter method for height.
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Shows dimensions for a Box.
     *
     * @return dimensions of box.
     */
    public String toString() {
        return "Box - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

    /**
     * Determines if two boxes are equal.
     *
     * @param obj
     * @return whether the dimensions are equal.
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Box3)) {
            return false;
        }
        Box3 box = (Box3) obj;
        return getLength() == box.getLength() && getWidth() == box.getWidth() && getHeight() == box.getHeight();
    }

}
