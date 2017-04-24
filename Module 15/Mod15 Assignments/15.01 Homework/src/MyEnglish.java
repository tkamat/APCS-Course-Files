/**
 * Extends Homework class.
 *
 * @author Tushaar Kamat
 * @version 1/9/17
 */
public class MyEnglish extends Homework {

    public MyEnglish() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setTypeHomework("English");
    }

    public String toString() {
        return getPagesRead() + " pages of " + getTypeHomework() + " homework.";
    }
}
