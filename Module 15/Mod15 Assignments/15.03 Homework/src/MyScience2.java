/**
 * Extends Homework class.
 *
 * @author Tushaar Kamat
 * @version 1/14/17
 */
public class MyScience2 extends Homework2 {

    public MyScience2() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setTypeHomework("Science");
    }

    public String toString() {
        return getPagesRead() + " pages of "  +  getTypeHomework() + " homework.";
    }

    public void doReading() {
        setPagesRead(getPagesRead() - 3);
    }
}
