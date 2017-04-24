/**
 * Extends the Homework3 class.
 *
 * @author Tushaar Kamat
 * @version 1/28/17
 */
public class MyScience3 extends Homework3 {

    public MyScience3() {
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
