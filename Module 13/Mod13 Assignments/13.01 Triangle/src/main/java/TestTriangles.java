/**
 * Tests the Triangle class and its subclasses Equilateral and IsoscelesRight
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */
public class TestTriangles {

    public static void main(String args[]) {
        Triangle tri1 = new Triangle(4.0, 5.0, 6.0);
        Equilateral tri2 = new Equilateral(5.0);
        IsoscelesRight tri3 = new IsoscelesRight(1.5);

        System.out.println(
                "Triangle has sides A = " + tri1.getSideA() + ", B = " + tri1.getSideB() + ", C = " + tri1.getSideC());
        System.out.println("Equilateral Triangle has sides A = " + tri2.getSideA() + ", B = " + tri2.getSideB()
                + ", C = " + tri2.getSideC());
        System.out.println("Isosceles Right Triangle has sides A = " + tri3.getSideA() + ", B = " + tri3.getSideB()
                + ", C = " + tri3.getSideC());
    }
}