/**
 * Superclass for triangles with 3 sides
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */
public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    /**
     * @return sideA
     */
    public double getSideA() {
        return sideA;
    }


    /**
     * @return sideB
     */
    public double getSideB() {
        return sideB;
    }



    /**
     * @return sideC
     */
    public double getSideC() {
        return sideC;
    }

}