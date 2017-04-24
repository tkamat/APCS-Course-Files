/**
 * Extends Homework class.
 *
 * @author Tushaar Kamat
 * @version 1/14/17
 */
public class MyEnglish2 extends Homework2 {

    public MyEnglish2() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setTypeHomework("English");
    }

    public String toString() {
        return getPagesRead() + " pages of " + getTypeHomework() + " homework.";
    }

    public void doReading() {
        setPagesRead(getPagesRead() - 1);
    }
}
