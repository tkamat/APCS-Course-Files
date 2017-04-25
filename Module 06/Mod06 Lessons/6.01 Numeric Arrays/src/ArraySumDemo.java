/**
 * Write a description of class Main here.
 *
 * @author Tushaar
 * @version 8/28/2016
 */
public class ArraySumDemo {
    public static void main(String[] args) {
        int[] intValues = {5, 6, -12, 73, 4, -25, 15, 8, 0, -2};
        int indexOfMax = 0;

        int sum = 0;
        for (int index = 0; index <= 9; index++) {
            sum += intValues[index];
            if (intValues[index] > intValues[indexOfMax]) {
                index = indexOfMax;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println(indexOfMax);
    }
}