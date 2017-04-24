/**
 * Creates a rectangle.
 *
 * @author Tushaar Kamat
 * @version 11/13/2016
 */
public class Rectangle3 {

    private int length;
    private int width;

    /**
     * Constructor for objects of class Rectangle3
     */
    public Rectangle3(int l, int w) {
        length = l;
        width = w;
    }

    /**
     * Getter method for length.
     *
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * Getter method for width.
     *
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Shows dimensions of Rectangle.
     *
     * @return dimensions of rectangle
     */
    public String toString() {
        return "Rectangle - " + getLength() + " X " + getWidth();
    }

    /**
     * Determines if two rectangles are equal.
     *
     * @param obj
     * @return whether the dimensions are equal.
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle3)) {
            return false;
        }
        Rectangle3 rect = (Rectangle3) obj;
        return getLength() == rect.getLength() && getWidth() == rect.getWidth();
    }
}
