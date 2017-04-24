/**
 * Extends Homework class.
 *
 * @author Tushaar Kamat
 * @version 1/9/17
 */
public class MyScience extends Homework {

    public MyScience() {
        super();
    }

    public void createAssignment(int p) {
        setPagesRead(p);
        setTypeHomework("Science");
    }

    public String toString() {
        return getPagesRead() + " pages of "  +  getTypeHomework() + " homework.";
    }
}
