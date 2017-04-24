/**
 * Tester for the PiecewiseRecursion class.
 *
 * @author Tushaar Kamat
 * @version 10/29/2016
 */

public class PiecewiseRecursionTester {

    public static void main(String args[]) {
        PiecewiseRecursion recursiveMethods = new PiecewiseRecursion();
        int p1 = recursiveMethods.solvePiecewise1(25);
        int p2 = recursiveMethods.solvePiecewise2(30);
        int p4 = recursiveMethods.solvePiecewise4(500);
        System.out.println("Problem 1: " + p1);
        System.out.println("Problem 2: " + p2);
        System.out.println("Problem 4 " + p4);
    }
}