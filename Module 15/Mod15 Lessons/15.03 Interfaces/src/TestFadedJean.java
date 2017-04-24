import java.util.*;
/**
 * tests the jeanJacket and fadedJean classes
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/10/07
 */
public class TestFadedJean
{
	
    public static void main(String []args)
    {   
        
        
        ArrayList<FadedJean> tester = new ArrayList<FadedJean>();
	    
	    tester.add( new FadedJean(0));
	    tester.get(0).design();
	    tester.add( new FadedJean(4));
        tester.get(1).design();

        

	    for (FadedJean c: tester)
	       System.out.println(c);
	   
  
	}
}
