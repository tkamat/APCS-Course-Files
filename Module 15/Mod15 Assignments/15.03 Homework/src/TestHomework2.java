import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Tests homework class and subclasses using an ArrayList.
 *
 * @author Tushaar Kamat
 * @version 1/18/17
 */
public class TestHomework2 {

    public static void main(String[] args) {
        Random rand = new Random();
        List<Homework2> myHomework = new ArrayList<Homework2>();

        myHomework.add(new MyMath2());
        myHomework.add(new MyScience2());
        myHomework.add(new MyEnglish2());
        myHomework.add(new MyJava2());

        for (Homework2 hw : myHomework) {
            System.out.println("Before reading: ");
            hw.createAssignment(rand.nextInt(21));
            System.out.println(hw);
            System.out.println("After reading: ");
            hw.doReading();
            System.out.println(hw);
        }
    }
}
