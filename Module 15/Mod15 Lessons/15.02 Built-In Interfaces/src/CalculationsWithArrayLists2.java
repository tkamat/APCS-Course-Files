
/**
 * This class adds randomly selected Integers to two ArrayLists
 * then calculates the sum of the values in the first and second
 * ArrayList and adds the value to the third ArrayList.  Last, the
 * third ArrayList is printed out showing how each successive sum
 * is added to the answers ArrayList.
 *
 * @author B. Jordan
 * @version 06/05/07
 */
import java.util.*;                                         //import the ArrayList class
public class CalculationsWithArrayLists2
{
    public static void main(String[] args)                          //header for the main method
    {
        List<Integer> numList1 = new ArrayList<Integer>();     //declares an ArrayList of Integers
        List<Integer> numList2 = new ArrayList<Integer>();     //declares an ArrayList of Integers
        List<Integer> answers = new ArrayList<Integer>();      //declares an ArrayList of Integers

        int rndNumber;                                              //declares a random number

        for(int i = 0; i < 20; i ++)                                //initializes, tests, and increments the loop index variable
        {
            rndNumber = (int)(Math.random() * 100);                 //select a random number from 0 - 99
            numList1.add(rndNumber);                                //inserts the first random number into the first ArrayList
            rndNumber = (int)(Math.random() * 100);                 //select a random number from 0 - 99
            numList2.add(rndNumber);                                //inserts the second random number into the second ArrayList
        }

        System.out.println(numList1);                               //prints the first ArrayList
        System.out.println(numList2);                               //prints the second ArrayList

        for(int i = 0; i < numList1.size(); i++)                    //initializes, tests, and increments the loop index variable
        {
            answers.add(numList1.get(i) + numList2.get(i));         //gets a radom number from index position i in the first and second array,
                                                                    //calculaetes the sum, and assigns the value to index position i in the answers ArrayList.
            System.out.println(answers);                            //prints the values one at a time as they are inserted into the third ArrayList
        }
    }
}