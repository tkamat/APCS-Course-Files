
/**
 * The purpose of this program is to grade a True-False test.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 05/12/07
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TrueFalseTest
{
    public static String [] readTestData()throws IOException
    {       
        int index = 0;
        String [] answers = new String[11];
        
        File fileName = new File("TestData1.txt");
        Scanner inFile = new Scanner(fileName);
        while (inFile.hasNext())
        {
            answers[index] = inFile.next( );
            index++;
        }
        inFile.close();
        return answers;
    }
    
    public static int gradeTest(String[] test, String[] key)
    {
        int correct = 0;
        
        for(int n = 1; n < test.length; n++)
        {     
            if(test[n].equals(key[n]))
                correct++;
        }
        return correct;
     }
    
     public static double calcPercent(int n)
     {
         return (n/10.0) * 100;
     }
     
     public static void printResults(String studentId, double pct)
     {
        System.out.printf("Student Number: %s   Grade: %4.1f%n", studentId, pct);     
     }
   
    public static void main(String[] args) throws IOException
    {
        String[] testAnswers = new String[11];
        String[] answerKey = {"name", "F", "F", "T", "T", "T", "T", "F", "F", "T", "T"};
        
        testAnswers = readTestData();
        int numCorrect = gradeTest(testAnswers, answerKey);
        double percent = calcPercent(numCorrect);
        printResults(testAnswers[0], percent);   
    }
}


