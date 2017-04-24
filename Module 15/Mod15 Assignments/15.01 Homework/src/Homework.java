/**
 * Abstract class as template for different subjects.
 *
 * @author Tushaar Kamat
 * @version 1/9/17
 */
public abstract class Homework {

    private int pagesRead;
    private String typeHomework;

    public Homework() {
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
