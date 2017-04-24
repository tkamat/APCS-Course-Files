/**
 * Test4 demo
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Test4
{
	public static void main(String []args)
	{
           Rectangle2 one = new Rectangle2(5, 20);
           Box2 two = new Box2(4, 10, 5);
	   
	      showEffectBoth(one);
	      showEffectBoth(two);
	 }
	 
	 public static void showEffectBoth(Rectangle2 r)
	 {
	     System.out.println(r);
	 }
}