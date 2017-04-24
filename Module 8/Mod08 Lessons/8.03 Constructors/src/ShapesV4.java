
/**
 * The purpose of this program is to calculate the hypoteneuse
 * of a triangle and its area.  All calculations are done within
 * methods.  An object is instantiated and all methods are invoked
 * on the object.
 * <p>
 * �FLVS 2007
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ShapesV4 {
	//default constructor
	ShapesV4() {
	}

	//calculate area of a rectangle
	public double calcRectArea(int w, int l) {
		return w * l;
	}

	//calculate the perimeter
	public int calcPerimeter(int w, int l) {
		return ((2 * w) + (2 * l));
	}

	//calculates the circumference
	public double calcCircumference(int r) {
		return Math.PI * (r * 2);
	}

	//main method
	public static void main(String[] args) {
		//declaration of variables
		int side1, side2, radius;
		double rektArea;
		int perimeter;
		double circumference;

		//initialization of variables
		side1 = 10;
		side2 = 5;
		radius = 4;
		rektArea = 0;
		perimeter = 0;
		circumference = 0;

		ShapesV4 shapes = new ShapesV4();

		//call methods
		rektArea = shapes.calcRectArea(side1, side2);
		perimeter = shapes.calcPerimeter(side1, side2);
		circumference = shapes.calcCircumference(radius);

		//print results
		System.out.printf(" Rectangle Area = %8.2f%n", rektArea);
		System.out.printf(" Perimeter = %8d%n", perimeter);
		System.out.printf(" Circumference = %8.2f%n", circumference);
	}
}
