
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * �FLVS 2007
 * @author Tushaar Kamat
 * @version Version 5, 08/07/16
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 16;
        int iNum4 = 15;
        int iNum5 = -2;
        int iNum6 = 10;
        int iNum7 = 5;
        int iNum8 = 234;
        int iNum9 = 6;
        int iNum10 = 12;
        int iNum11 = 3;
        int iNum12 = 11;
        int iNum13 = 24;
        int iNum14 = 17;
        int iNum15 = 2;
        int iNum16 = 480;
        int iNum17 = 200;
        int iNum18 = 20;
        int iNum19 = 8;
        
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 5.0;
        double dNum4 = 2.5;
        double dNum5 = 46.2;
        double dNum6 = .5;
        
        System.out.println();
        System.out.println("CALCULATIONS"); 
        System.out.println();
        
        // Addition
        System.out.println("Addition");
        System.out.print( iNum1 + " + " + iNum2 + " = " );  
        System.out.println( iNum1 + iNum2 );
        System.out.print( dNum1 + " + " + dNum2 + " + " + dNum3 + " = " );
        System.out.println( dNum1 + dNum2 + dNum3 );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print( iNum3 + " - " + iNum2 + " - " + iNum1 + " = " );
        System.out.println( iNum3 - iNum2 - iNum1 );
        System.out.print( dNum2 + " - " + dNum3 + " = " ); 
        System.out.println( dNum2 - dNum3 );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print( iNum1 + " * " + iNum2 + " = " );
        System.out.println( iNum1 * iNum2 );
        System.out.print( dNum2 + " * " + dNum3 + " * " + dNum3 + " = " );
        System.out.println( dNum2 * dNum3 * dNum3 );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print( iNum2 + " / " + iNum1 + " = " );  
        System.out.println( iNum2 / iNum1 );
        System.out.print( dNum1 + " / " + dNum3 + " = " ); 
        System.out.println( dNum1 / dNum3 );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print( iNum3 + " % " + iNum2 + " = " );
        System.out.println( iNum3 % iNum2 );
        System.out.print( dNum3 + " % " + dNum2 + " = " );
        System.out.println( dNum3 % dNum2 );
        System.out.println();
        
        // 2.02 Lab Equations
        // 15 divided by 2.5 times -2 plus 10 / 5
        // 234 minus (234 divided by 6 modulus 12) + 3
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.println("2.02 Lab Equations");
        System.out.print( iNum4 + " / " + dNum4 + " * " + iNum5 + " + " + iNum6 + " / " + iNum7 + " = " );
        System.out.println( iNum4 / dNum4 * iNum5 + iNum6 / iNum7 );
        System.out.print( iNum8 + " - " + "( " + iNum8 + " / " + iNum9 + " % " + iNum10 + " ) " + "+ " + iNum11 + " = " ); 
        System.out.println( iNum8 - ( iNum8 / iNum9 % iNum10 ) + iNum11 );
        System.out.print( "( " + dNum5 + " / " + iNum12 + " ) " + "- " + iNum11 + " + " + iNum13 + " % ( " + iNum14 + " - " + iNum15 + " * " + iNum11 + " )" + " = " ); 
        System.out.println( (dNum5 / iNum12) - iNum11 + iNum13 % ( iNum14 - iNum15 * iNum11) );
        System.out.print( iNum16 + " / " + iNum6 + " / " + iNum10 + " + " + iNum17 + " * " + dNum6 + " - " + iNum18 + " % " + iNum19 + " = "); 
        System.out.println( iNum16 / iNum6 / iNum10 + iNum17 * dNum6 - iNum18 % iNum19 );
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("2.03 Additional int Equations");
        System.out.print( iNum6 + " - " + iNum7 + " % " + iNum2 + " * " + iNum4 + " = " );
        System.out.println( iNum6 + iNum7 % iNum2 * iNum4 );
        System.out.print( iNum1 + " / " + iNum13 + " % " + iNum14 + " + " + iNum6 + " = " );
        System.out.println( iNum1 / iNum13 % iNum14 + iNum6 );
        System.out.println();
        
        //2.04 Additional double Equations
        System.out.println("2.04 Additional double Equations");
        System.out.print( dNum2 + " - " + dNum4 + " * " + dNum1 + " / " + dNum3 + " = " );
        System.out.println( dNum2 - dNum4 * dNum1 / dNum3 );
        System.out.print( dNum1 + " % " + dNum3 + " + " + dNum4 + " - " + dNum6 + " = " );
        System.out.println( dNum1 % dNum3 + dNum4 - dNum6 );
        System.out.println();
               
    } // end of main method
} // end of class
