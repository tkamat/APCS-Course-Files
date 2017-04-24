import java.io.File;
import java.io.IOException;

/**
 * Tests the FrequencyAnalysis Class.
 *
 * @author Tushaar Kamat
 * @version 12/01/2016
 */
public class FrequencyAnalysisTester {

    public static void main(String args[]) throws IOException {
        //set desired files here
        File inFile = new File("ciphertext.txt");
        File outFile = new File("ciphertextfreq.txt");

        FrequencyAnalysis freqTest = new FrequencyAnalysis(inFile, outFile);
        freqTest.readTextFile();
        freqTest.writeTextFile();
        System.out.println(freqTest);
    }
}