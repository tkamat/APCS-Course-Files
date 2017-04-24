import java.util.Scanner;

/**
 * Recursively Calculates Fibonacci numbers until the user wants to stop.
 *
 * @author Tushaar Kamat
 * @version 10/29/2016
 */
public class FibonacciNumbers {

    /**
     * Finds the nth Fibonacci number
     *
     * @param n
     * @return nth Fibonacci number
     */
    public int calcFibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return calcFibonacciNumber(n - 1) + calcFibonacciNumber(n - 2);
        }
    }

    public static void main(String args[]) {
        FibonacciNumbers fibonacci = new FibonacciNumbers();
        Scanner in = new Scanner(System.in);
        String cont = "t";
        int index;
        int fibNum;
        while (!cont.equals("q")) {
            System.out.println("Enter which Fibonacci number to find:");
            index = in.nextInt();
            if (index > 46) {
                System.out.println("Your Number is too high!");
            }
            else {
                fibNum = fibonacci.calcFibonacciNumber(index);
                System.out.println(index + "th Fibonacci Number: " + fibNum);
                System.out.println("Enter q to quit, c to continue");
                cont = in.next();
            }
        }
    }
}