
/**
 * The purpose of this program is to demonstrate the use of a constructor
 * that takes parameters.  Notice that there is no problem with two constructors
 * with the same name as long as their parameter lists are different.  This is
 * referred to as overloading a constructor,
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 05/28/07
 */

public class ShapesV5
{
    //private instance variables
    private int mySide1, mySide2, myRadius;

    //default constructor
    ShapesV5()
    {
    }

    //constructor with two parameters
    ShapesV5 (int s1, int s2, int radius)
    {
        mySide1 = s1;
        mySide2 = s2;
	    myRadius = radius;
    }

    //calculate area of a triangle
    public double calcTriArea()
    {
        return mySide1 * mySide2 * .5;
    }

    //calculate the hypoteneuse of a right triangle
    public double calcHypotenuse()
    {
        return Math.sqrt(Math.pow(mySide1, 2) + Math.pow(mySide2, 2));
    }

	//calculate the area of a circle
	public double calcCircArea() {
		return Math.PI * Math.pow(myRadius, 2);
	}

	//calculate the perimeter of a circle
	public double calcCircumferene() {
		return Math.PI * myRadius * 2;
	}

    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2, radius;
        double triArea, circArea, hypotenuse, circumference;

        //initialization of variables
        side1 = 10; side2 = 5; radius = 7;
        triArea = 0; circArea = 0; hypotenuse = 0; circumference = 0;

        ShapesV5 shapes = new ShapesV5(side1, side2, radius);

        //call methods
        triArea = shapes.calcTriArea();
        hypotenuse = shapes.calcHypotenuse();
	    circArea = shapes.calcCircArea();
	    circumference = shapes.calcCircumferene();


        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf("   Hypotenuse = %8.2f%n", hypotenuse);
	    System.out.printf("   Circle Area = %8.2f%n", circArea);
	    System.out.printf("   Circumference = %8.2f%n", circumference);
    }
}
