import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Tests homework class and subclasses using an ArrayList, and compares them.
 *
 * @author Tushaar Kamat
 * @version 1/28/17
 */
public class TestHomework3 {

    public static void main(String[] args) {
        Random rand = new Random();
        List<Homework3> myHomework = new ArrayList<Homework3>();

        myHomework.add(new MyMath3());
        myHomework.add(new MyScience3());
        myHomework.add(new MyEnglish3());
        myHomework.add(new MyJava3());

        for (Homework3 hw : myHomework) {
            System.out.println("Before reading: ");
            hw.createAssignment(rand.nextInt(15) + 4);
            System.out.println(hw);
            System.out.println("After reading: ");
            hw.doReading();
            System.out.println(hw);
        }
        System.out.println();
        if (myHomework.get(0).compareTo(myHomework.get(1)) == 0)
            System.out.println("The homework for math and science are the same number of pages.");
        else if (myHomework.get(0).compareTo(myHomework.get(1)) < 0)
            System.out.println("There is less math homework than science homework.");
        else
            System.out.println("There is more math homework than science homework.");
    }
}
