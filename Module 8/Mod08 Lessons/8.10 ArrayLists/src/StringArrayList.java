
/**
 * This program demonstrates how to create a simple ArrayList of Strings
 * and how to use some of the methods of the ArrayList class.
 * 
 * Most of the code is commented out.  Run the program and evaluate how each set of statements
 * modifies the ArrayList and produces the corresponding output.
 * 
 * @author B. Jordan 
 * @version 06/04/07
 */
import java.util.ArrayList;     //the ArrayList class must be imported
public class StringArrayList
{
    public static void main(String[] args)
    {
        //create an ArrayList of Strings representing the names of foreign vehicle brands
        ArrayList<String> vehicles = new ArrayList<String>();    
        
        //add the names of 10 foreign vehicle brands to the vehicles ArrayList
        vehicles.add("Chery");
        vehicles.add("Tramontana");
        vehicles.add("Reva");
        vehicles.add("Zil");
        vehicles.add("Venturi");
        
        //prints a list of the objects in the ArrayList
        //useful for a quick check of ArrayList elements
        System.out.println(vehicles);
        System.out.println();
        
        //prints the size of the array list
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();
        System.out.println(vehicles.get(4) + " is at position 4.");
        System.out.println();
        
// YOU WILL NEED TO UNCOMMENT THE EXECUTABLE STATEMENTS IN EACH SECTION OF THE FOLLOWING CODE.

        //print the elements in the ArrayList with a traditional for loop, notice the use of the size() method to terminate the loop
        System.out.println("Print ArrayList with a traditional for loop.");
        for(int i = 0; i < vehicles.size(); i++)
            System.out.println(vehicles.get(i));
        System.out.println();
        
        //print the elements in the ArrayList with a for-each loop
        System.out.println("Print ArrayList with a for-each loop.");
        for(String foreignCar : vehicles)
            System.out.println(foreignCar);
        System.out.println();
        System.out.println("Uncomment each section of the remaining source code to");
        System.out.println("better understand how the ArrayList works.");
        System.out.println(); 
        
        
        
        //adds new element to the end of the ArrayList
        vehicles.add("Spyker");
        System.out.println(vehicles);  //prints new list
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();

        //adds new element in index position 2, everything is shoved up one position
        vehicles.add(2, "Leblanc");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();

        //tries to add new element in index position 10. why won't this work?  What can you do to fix it?
        vehicles.add("Spira");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();
        
        //you add these two car brands in position 0 and 5
        vehicles.add(0, "Hongqi");
        vehicles.add(5, "Koenisegg");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();

        //replace the object at index position 4
        vehicles.set(4, "Lamborghini");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();
        
        //you replace the object at index position vehicles.size()-3 with "Audi"
        vehicles.set(vehicles.size() - 3, "Audi");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();
        
        //removes the Reva from the ArrayList
        vehicles.remove("Reva");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();
        
        //you remove the Chery from the ArrayList, place your beneath this comment.
        vehicles.remove("Chery");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();

        //removes the element at position 3 from the ArrayList
        vehicles.remove(3);
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();
        
        //you remove element 5 from the ArrayList, place your code beneath this point.
        vehicles.remove(5);
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();

        //clears the entire ArrayList
        vehicles.clear();
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();

	    //ads chevy to the list
        vehicles.add("Chevy");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();

	    //adds ford to the list
        vehicles.add(0, "Ford");
        System.out.println(vehicles);
        System.out.println("There are " + vehicles.size() + " vehicles in the ArrayList.");
        System.out.println();

    }
}
