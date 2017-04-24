/**
 * Extends the Homework3 class.
 *
 * @author Tushaar Kamat
 * @version 1/28/17
 */
public class MyEnglish3 extends Homework3 {

    public MyEnglish3() {
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
