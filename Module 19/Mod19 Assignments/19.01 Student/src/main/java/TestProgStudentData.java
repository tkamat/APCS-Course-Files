/**
 * Tests the StudentData class
 *
 * @author Tushaar Kamat
 * @version 03/29/2017
 */
public class TestProgStudentData {
    public static void main(String args[]) {
        StudentData s1 = new StudentData("John", "Doe", new double[] {89.00, 78.00, 95.00, 63.00, 94.00});
        StudentData s2 = new StudentData("Lindsay", "Green", new double[] {88.00, 90.00, 100.00, 88.00, 90.00, 100.00});
        System.out.println(s1);
        System.out.println(s2);

    }
}
