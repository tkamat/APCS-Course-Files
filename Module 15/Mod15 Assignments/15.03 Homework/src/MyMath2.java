/**
 * Extends Homework.
 *
 * @author Tushaar Kamat
 * @version 1/14/17
 */
public class MyMath2 extends Homework2 {

    public MyMath2() {
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
