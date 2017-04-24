/**
 * Implements Processing interface, superclass for different homework subjects.
 *
 * @author Tushaar Kamat
 * @version 1/14/17
 */
public abstract class Homework2 implements Processing  {

    private int pagesRead;
    private String typeHomework;

    public Homework2() {
        this.pagesRead = 0;
        this.typeHomework = "none";
    }

    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    public String getTypeHomework() {
        return typeHomework;
    }

    public void setTypeHomework(String typeHomework) {
        this.typeHomework = typeHomework;
    }

    public abstract void createAssignment(int p);
}
