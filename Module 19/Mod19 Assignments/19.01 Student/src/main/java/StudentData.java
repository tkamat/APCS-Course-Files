
/**
 * Represents a student using their first name, last name, test scores, and
 * grade
 *
 * @author Tushaar Kamat
 * @version 03/29/2017
 */
public class StudentData {
    private String firstName;
    private String lastName;
    private double[] testScores;
    private char grade;

    /**
     * @param firstName
     *            first name of student
     * @param lastName
     *            last name of student
     * @param testScores
     *            array of test scores
     */
    public StudentData(String firstName, String lastName, double[] testScores) {
        // names cannot be empty
        if (firstName.length() < 1)
            throw new IllegalArgumentException("First name cannot be empty");
        if (lastName.length() < 1)
            throw new IllegalArgumentException("Last name cannot be empty");
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
        this.courseGrade(testScores);
    }

    public static String printScores(double[] scores) {
        String str = "";
        for (double score : scores) {
            str = str + score + " ";
        }
        return str;
    }

    /**
     * @return student data in the format "first-name last-name test-scores
     *         grade"
     */
    @Override
    public String toString() {
        return String.format("%10s%10s%36s%3c", firstName, lastName, printScores(testScores), grade);
    }

    public void courseGrade(double[] list) {
        // list cannot be empty
        if (list.length < 1)
            throw new IllegalArgumentException("Grade list cannot be empty");
        double sum = 0.0;
        for (double score : list) {
            sum += score;
        }
        double numGrade = sum / list.length;
        if (numGrade >= 90)
            grade = 'A';
        else if (numGrade >= 80)
            grade = 'B';
        else if (numGrade >= 70)
            grade = 'C';
        else if (numGrade >= 60)
            grade = 'D';
        else
            numGrade = 'F';
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the testScores
     */
    public double[] getTestScores() {
        return testScores;
    }

    /**
     * @param testScores
     *            the testScores to set
     */
    public void setTestScores(double[] testScores) {
        this.testScores = testScores;
    }

    /**
     * @return the grade
     */
    public char getGrade() {
        return grade;
    }

    /**
     * @param grade
     *            the grade to set
     */
    public void setGrade(char grade) {
        this.grade = grade;
    }
}
