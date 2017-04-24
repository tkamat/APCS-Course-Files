/**
 * Extends the Homework3 class.
 *
 * @author Tushaar Kamat
 * @version 1/28/17
 */
public class MyMath3 extends Homework3 {

    public MyMath3() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setTypeHomework("Math");
    }

    public String toString() {
        return getPagesRead() + " pages of " + getTypeHomework() + " homework.";
    }

    public void doReading() {
        setPagesRead(getPagesRead() - 2);
    }
}
