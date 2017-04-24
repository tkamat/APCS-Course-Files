/**
 * Extends Homework class.
 *
 * @author Tushaar Kamat
 * @version 1/9/17
 */
public class MyMath extends Homework {

    public MyMath() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setTypeHomework("Math");
    }

    public String toString() {
        return getPagesRead() + " pages of " + getTypeHomework() + " homework.";
    }
}
