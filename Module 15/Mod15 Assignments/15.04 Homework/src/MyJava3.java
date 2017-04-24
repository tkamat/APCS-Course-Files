/**
 * Extends the Homework3 class.
 *
 * @author Tushaar Kamat
 * @version 1/28/17
 */
public class MyJava3 extends Homework3 {

    public MyJava3() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setTypeHomework("Java");
    }

    public String toString() {
        return getPagesRead() + " pages of " + getTypeHomework() + " homework.";
    }

    public void doReading() {
        setPagesRead(getPagesRead() - 4);
    }
}
