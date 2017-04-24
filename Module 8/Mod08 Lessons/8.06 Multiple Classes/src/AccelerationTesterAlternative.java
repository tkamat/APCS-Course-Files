/**
 * Write a description of class Main here.
 *
 * @author Tushaar
 * @version 9/12/2016
 */
class ShapesV3 {
	private int myBase;
	private int myHeight;

	ShapesV3(int b, int h) {
		myBase = b;
		myHeight = h;
	}

	public double calcTriArea() {
		return myBase * myHeight * .5;
	}

	public double calcHypoteneuse() {
		return Math.sqrt(Math.pow(myBase, 2) + Math.pow(myHeight, 2));
	}


}

public class AccelerationTesterAlternative {
	public static void main(String[] args) {
		int base = 4;
		int height = 8;
		ShapesV3 shapes = new ShapesV3(base, height);

		System.out.printf("Distance Traveled = %5.2f feet%n", shapes.calcTriArea());
		double acceleration = height / base;
		System.out.printf("Acceleration = %3.1f feet per second squared%n", acceleration);
	}
}
