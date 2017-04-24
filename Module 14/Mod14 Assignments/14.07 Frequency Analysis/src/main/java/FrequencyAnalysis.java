import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Performs a frequency analysis of the letter in a message.
 *
 * @author Tushaar Kamat
 * @version 12/01/2016
 */
public class FrequencyAnalysis {

    final String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    private File inFile;
    private File outFile;
    private int totalLetters;
    private int[] occurrences;
    private double[] frequency;

    /**
     * Constructor for objects of the FrequencyAnalysis Class.
     *
     */
    public FrequencyAnalysis(File inFile, File outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
        this.occurrences = new int[26];
        this.frequency = new double[26];
    }

    /**
     * Mutator method that uses ASCII characters to assign the occurrences per
     * word to an array.
     *
     * @param word
     *            a single token to be counted
     */
    public void countLettersInWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            // uppercase letters
            if (letter >= 65 && letter <= 90) {
                occurrences[letter - 65]++;
                totalLetters++;
            }
            // lowercase letters
            else if (letter >= 97 && letter <= 122) {
                occurrences[letter - 97]++;
                totalLetters++;
            }
        }
    }

    /**
     * Reads each word in the inFile and runs the countLettersInWord method on
     * them.
     *
     * @throws IOException
     */
    public void readTextFile() throws IOException {
        String token = "";
        Scanner inScanner = new Scanner(inFile);
        while (inScanner.hasNext()) {
            token = inScanner.next();
            countLettersInWord(token);
        }
        for (int i = 0; i < 26; i++) {
            frequency[i] = ((double) occurrences[i]) / totalLetters;
        }
        inScanner.close();
    }

    /**
     * Overrides the toString method of the Object class, and prints a table
     * letters, occurrences, an frequency.
     */
    public String toString() {
        System.out.printf("%s%14s%12s%n", "Letter", "Occurrences", "Frequency");
        for (int i = 0; i < 26; i++) {
            System.out.printf("%s%14d%15.4f%n", alphabet[i], occurrences[i], frequency[i]);
        }
        return "";
    }

    /**
     *
     * Writes the output table to a text file.
     *
     * @throws IOException
     */
    public void writeTextFile() throws IOException {
        PrintWriter outWriter = new PrintWriter(outFile);
        outWriter.printf("%s%14s%12s%n", "Letter", "Occurrences", "Frequency");
        for (int i = 0; i < 26; i++) {
            outWriter.printf("%s%14d%15.4f%n", alphabet[i], occurrences[i], frequency[i]);
        }
        outWriter.close();
    }
}
