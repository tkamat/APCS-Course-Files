/**
 * Extends Homework class.
 *
 * @author Tushaar Kamat
 * @version 1/9/17
 */
public class MyJava extends Homework {

    public MyJava() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setTypeHomework("Java");
    }

    public String toString() {
        return getPagesRead() + " pages of " + getTypeHomework() + " homework.";
    }
}
