/**
 * Calculates the value of pi by simulating throwing darts at a dart board.
 *
 * @author Tushaar
 * @version 9/6/2016
 */

import java.util.Random;
import java.util.Scanner;

public class Darts {

	//throws "darts" at board for the number of darts specified
	public static int throwsDarts(int darts) {

		int hitCounter = 0;
		double x = 0.0;
		double y = 0.0;
		Random randNum = new Random();
		Random isNegative = new Random();

		for (int i = 0; i < darts; i++) {

			//randomly creates either a positive or negative number.
			x = randNum.nextDouble();
			y = randNum.nextDouble();
			if (isNegative.nextBoolean()) {
				x -= 1;
			}
			if (isNegative.nextBoolean()) {
				y -= 1;
			}
			//counts the hits on target
			if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
				hitCounter++;
			}
		}
		return hitCounter;
	}

	//calculates the value of pi
	public static double calculatePi(int darts, int hits) {

		double pi = 4 * ((double)hits / darts);
		return pi;

	}

	//prints results
	public static void printResults(int currentTrial, int darts, double pi) {

		System.out.printf("Trial [%2d]: pi = %8.6f%n", currentTrial, pi);
	}


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("How many darts?");
		int darts = in.nextInt();
		System.out.println("How many trials?");
		int trials = in.nextInt();
		double piSum = 0.0;

		for (int i = 1; i <= trials; i++) {
			int hits = throwsDarts(darts);
			double pi = calculatePi(darts, hits);
			printResults(i, darts, pi);
			piSum += pi;
		}

		System.out.printf("Estimate of pi = %8.6f", piSum / trials);
	}
}