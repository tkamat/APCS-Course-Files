/**
 * Lists prime numbers using the Sieve of Eratosthenes
 *
 * @author Tushaar Kamat
 * @version 11/17/2016
 */
public class Prime {

    private boolean[] primes;
    private int numPrimes;

    public Prime(int numPrimes) {
        this.numPrimes = numPrimes;
        this.primes = new boolean[numPrimes];
    }

    /**
     * Generates primes using the Sieve of Eratosthenes up to limit specified..
     *
     */
    public void generatePrimes() {
        int counter = 0;

        for (int i = 2; i < this.numPrimes; i++) {
            this.primes[i] = true;
        }
        for (int i = 2; i < this.numPrimes; i++) {
            counter = 0;
            if (this.primes[i] == true) {
                for (int j = (int) Math.pow(i, 2); j < this.numPrimes; j = (int) (Math.pow(i, 2) + (counter * i))) {
                    this.primes[j] = false;
                    counter++;
                }
            }
        }
    }

    /**
     * Prints all prime numbers and counts them.
     *
     */
    public void printPrimes() {
        int counter = 0;
        System.out.println("Primes:");
        for (int i = 0; i < this.primes.length; i++) {
            if (this.primes[i] == true) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter + " primes total.");
    }
}
