
import java.util.Scanner;

/**
 * Tests the prime class
 *
 * @author Tushaar Kamat
 * @version 11/17/2016
 */
public class PrimeTester {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pleas enter upper limit:");
        int upper = in.nextInt();
        Prime p = new Prime(upper);
        p.generatePrimes();
        p.printPrimes();
    }
}