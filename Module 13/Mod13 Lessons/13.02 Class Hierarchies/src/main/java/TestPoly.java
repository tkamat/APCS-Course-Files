
/**
 *  testPoly demo
 * 
 * Ray Enger 
 * 5/6/2007
 */
public class TestPoly
{
	

	public static void main(String []args)
	{
    
	    Circle one =  new Circle(2, 4, 6);
	    Cylinder two = new Cylinder (10, 15, 3, 4);
	    Oval three =  new Oval(25, 10, 4, 7);
	    OvalCylinder four =  new OvalCylinder(40, 10, 3, 7, 10);
	    
	    System.out.println("For Circle one: ");
	    System.out.println("Radius is " + one.getRadius() + " and " + one.center());
	    System.out.println("For Cylinder two: ");
	    System.out.println("Radius is " + two.getRadius() + ", " + two.center() + " and height is " + two.getHeight());
	    System.out.println("For Oval three: ");
	    System.out.println("Radius1 is " + three.getRadius() + ", Radius2 is " + three.getRadius2() + " and " + three.center());
   	    System.out.println("For OvalCylinder four: ");
	    System.out.println("Radius1 is " + four.getRadius() + ", Radius2 is " + four.getRadius2() + ", " + four.center());
	    System.out.println(" and height is " + four.getHeight());
	    
	}


}
