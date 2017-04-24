
/**
 * This class adds randomly selected Doubles to an ArrayList
 * and then prints the list.
 * 
 * @author B. Jordan 
 * @version 06/05/07
 */
import java.util.ArrayList;
public class DoubleArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Double> doubleList = new ArrayList<Double>();  //declare an ArrayList
        double rndNumber = 0;
        double position = 0;
        
        for(int i = 0; i < 50; i ++)                            //iterate a loop from 0 to 50
        {
            rndNumber = Math.random() * 100;             //choose a random number from 0 to 99
            doubleList.add(rndNumber);                             //add the random number to the next available open index position
        }
        System.out.println(doubleList);                            //print a list of all elements in the ArrayList
            
        for(int i = 0; i < doubleList.size(); i++)                 //iterate a through each index position in the ArrayList
        {
            if(doubleList.get(i) < 50)                             //get the object from the ArrayList that is in index
            {                                                   //position i and check to see if it is less than 50
                doubleList.remove(i);                              //if less than 50, remove the object at index position i fromthe ArrayList.
                i--;                                            //decrement the index counter by one
            }                                                   //why is this necessary?  remove it and see what happens.
        }
        System.out.println(doubleList);                            //print a list of all elements in the ArrayList
    
        for(int i = 0; i < doubleList.size(); i++)                 //iterate through each index position in the ArrayList
        {
            rndNumber = Math.random() * -100;            //choose a random number from 0 to -99
            doubleList.set(i, rndNumber);                          //set the new numbers in each index position in the ArrayList
        }
        System.out.println(doubleList);                            //print a list of all elements in the ArrayList
        
        for(int n = 0; n < 10; n++)                             //what is this last loop doing?
        {
            rndNumber = Math.random() * 100 + 100;       //what's the smallest random number that can be chosen if 100 is added to every one?
            position = (int)((Math.random() * doubleList.size())); //what's the range of values position can take on if every random number is multiplied times the size of the list?
            doubleList.add((int) position,rndNumber);                    //where is each new random number added?
        }                                                       //what happens if you change add() to set()?
        System.out.println(doubleList);                            //print a list of all elements in the ArrayList
    }
}