
/**
 * Holds a student's name and grades.
 *
 * @author Tushaar Kamat
 * @version 02/22/2017
 */
public class Student {
    private String name;
    private int qz1;
    private int qz2;
    private int qz3;
    private int qz4;
    private int qz5;

    public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5) {
        this.name = name;
        this.qz1 = qz1;
        this.qz2 = qz2;
        this.qz3 = qz3;
        this.qz4 = qz4;
        this.qz5 = qz5;
    }

    public int getQuiz(int qzNum) {
        if (qzNum == 1)
            return this.qz1;
        else if (qzNum == 2)
            return this.qz2;
        else if (qzNum == 3)
            return this.qz3;
        else if (qzNum == 4)
            return this.qz4;
        else if (qzNum == 5)
            return this.qz5;
        else
            return -1;
    }

    public void setQuiz(int qzNum, int qzScore) {
        if (qzNum == 1)
            this.qz1 = qzScore;
        else if (qzNum == 2)
            this.qz2 = qzScore;
        else if (qzNum == 3)
            this.qz3 = qzScore;
        else if (qzNum == 4)
            this.qz4 = qzScore;
        else if (qzNum == 5)
            this.qz5 = qzScore;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        System.out.printf("%-18s%10d%10d%10d%10d%10d", this.name + ":", this.qz1, this.qz2, this.qz3, this.qz4,
                this.qz5);
        return "";
    }
}
