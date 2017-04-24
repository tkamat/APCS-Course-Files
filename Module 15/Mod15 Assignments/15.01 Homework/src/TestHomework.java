import java.util.ArrayList;
import java.util.Random;

/**
 * Tests subclasses of Homework superclass.
 *
 * @author Tushaar Kamat
 * @version 1/9/17
 */
public class TestHomework {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Homework> myHomework = new ArrayList<>();

        myHomework.add(new MyMath());
        myHomework.add(new MyScience());
        myHomework.add(new MyEnglish());
        myHomework.add(new MyJava());

        for (Homework hw : myHomework) {
            hw.createAssignment(rand.nextInt(21));
            System.out.println(hw);
        }
    }
}
