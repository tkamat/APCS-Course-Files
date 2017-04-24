import java.util.*;
/**
 * tests the jeanJacket class that implements jeanEffects
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/10/07
 */
public class TestJacket
{
	
    public static void main(String []args)
    {   
        
        
        ArrayList<JeanJacket> tester = new ArrayList<JeanJacket>();
	    
	    tester.add( new JeanJacket(10));
	    tester.get(0).design();
	    tester.get(0).fadeJeans();
	    tester.get(0).addHoles();
	    tester.add( new JeanJacket(20));
	    tester.get(1).design();
	    tester.get(1).fadeJeans();
	    tester.get(1).addHoles();
	    tester.add( new JeanJacket(30));
        tester.get(2).design();
        tester.get(2).fadeJeans();
	    tester.get(2).addHoles();
        

	    for (JeanJacket c: tester)
	       System.out.println(c);
	   
  
	}
}
