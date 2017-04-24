
import java.util.ArrayList;
import java.util.List;

/**
 * Tests the Student Class
 *
 * @author Tushaar Kamat
 * @version 02/22/2017
 */
public class TestStudent {
    public static void main(String args[]) {
        List<Student> myClass = new ArrayList<Student>();
        myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
        myClass.add(new Student("Max Gerard", 80, 85, 90, 85, 80));
        myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
        myClass.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
        myClass.add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
        System.out.println("Starting Gradebook:");
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Changing Betty's name to Betty Boop:");
        replaceName(myClass, "Betty Farm", "Betty Boop");
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Changing Jean's quiz 1 score to 80:");
        replaceQuiz(myClass, "Jean Smith", 1, 80);
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90:");
        replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Inserting Lily Mu: 85, 95, 70, 0, 100 before Betty:");
        insertStudent(myClass, "Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
        System.out.println();
        printBook(myClass);
        System.out.println();
        System.out.println("Deleting Max Gerard:");
        deleteStudent(myClass, "Max Gerard");
        System.out.println();
        printBook(myClass);
    }

    public static void printBook(List<Student> gradebook) {
        System.out.printf("%-18s%10s%10s%10s%10s%10s%n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("-----------------------------------------------------------------------");
        for (Student s : gradebook) {
            System.out.println(s);
        }
    }

    public static void replaceName(List<Student> gradebook, String findName, String replaceName) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(findName)) {
                gradebook.get(i).setName(replaceName);
                break;
            }
        }
    }

    public static void replaceQuiz(List<Student> gradebook, String findName, int qzNum, int qzScore) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(findName)) {
                gradebook.get(i).setQuiz(qzNum, qzScore);
                break;
            }
        }
    }

    public static void replaceStudent(List<Student> gradebook, String findName, String replaceName, int qz1, int qz2, int qz3, int qz4, int qz5) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(findName)) {
                gradebook.get(i).setName(replaceName);
                gradebook.get(i).setQuiz(1, qz1);
                gradebook.get(i).setQuiz(2, qz2);
                gradebook.get(i).setQuiz(3, qz3);
                gradebook.get(i).setQuiz(4, qz4);
                gradebook.get(i).setQuiz(5, qz5);
                break;
            }
        }
    }

    public static void insertStudent(List<Student> gradebook, String beforeName, String insertName, int qz1, int qz2, int qz3, int qz4, int qz5) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(beforeName)) {
                gradebook.add(i, new Student(insertName, qz1, qz2, qz3, qz4, qz5));
                break;
            }
        }
    }

    public static void deleteStudent(List<Student> gradebook, String findName) {
        for (int i = 0; i < gradebook.size(); i++) {
            if (gradebook.get(i).getName().equals(findName)) {
                gradebook.remove(i);
                break;
            }
        }
    }
}
