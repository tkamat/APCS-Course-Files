/**
 * Extends Homework class.
 *
 * @author Tushaar Kamat
 * @version 1/14/17
 */
public class MyJava2 extends Homework2 {

    public MyJava2() {
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
