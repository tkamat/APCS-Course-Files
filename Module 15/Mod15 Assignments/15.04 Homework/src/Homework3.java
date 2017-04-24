/**
 * Implements Processing3 interface and Comparable<Homework3>, superclass for different homework subjects
 *
 * @author Tushaar Kamat
 * @version 1/28/17
 */
public abstract class Homework3 implements Processing3, Comparable<Homework3> {

    private int pagesRead;
    private String typeHomework;

    public Homework3() {
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

    public int compareTo(Homework3 hw) {
        return this.pagesRead - hw.getPagesRead();
    }

    public abstract void createAssignment(int p);
}
