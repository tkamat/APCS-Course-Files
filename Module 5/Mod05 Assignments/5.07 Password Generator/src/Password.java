/**
 * Generates random passwords with a specified character set and length.
 *
 * @author Tushaar
 * @version 8/27/2016
 */
import java.util.Random;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {

        //local variables and objects
        Scanner inChoice = new Scanner(System.in);
        Scanner inLength = new Scanner(System.in);
        Random randList = new Random();
        int randNum = 0;
        int choice = 0;
        int length = 0;
        boolean cont = true;
        boolean contChoice = true;
        boolean contLength = true;

        //displays selection menu
        System.out.println("\t\t\t\t Password Generator Menu \t\t\t\t");
        System.out.println("**************************************************************");
        System.out.println("*\t [1] Lowercase Letters                                   *");
        System.out.println("*\t [2] Lowercase and Numbers                               *");
        System.out.println("*\t [3] Lowercase, Uppercase and Numbers                    *");
        System.out.println("*\t [4] Lowercase, Uppercase, Numbers, and Punctuation      *");
        System.out.println("*\t [5] Quit                                                *");
        System.out.println("**************************************************************");

        //while loop to continue program infinitely.
        while (cont == true) {

            //prompts for password set and length
            System.out.println();
            System.out.println();
            while (contChoice == true) {
                System.out.print("Enter Selection (1-5): ");
                choice = inChoice.nextInt();
                if (choice > 5 || choice < 1) {
                    System.out.println("\n Invalid Option. Please try again.");
                }
                else if (choice == 5) {
                    System.out.println("\n Thank you. The password generator will exit now.");
                    contChoice = false;
                    contLength = false;
                    cont = false;
                }
                else {
                    contChoice = false;
                }
            }
            while (contLength == true) {
                System.out.print("Password Length (6 or more): ");
                length = inLength.nextInt();
                if (length < 6) {
                    System.out.println("\n Password length too short. Please try again.");
                }
                else {
                    contLength = false;
                }
            }

            //conditional statements with loops to create password.
            if (cont == false) {
            }
            else if (choice == 4) {
                System.out.print("Randomly generated password: ");
                for (int i = 1; i <= length; i++) {
                    randNum = 0;
                    while (!(randNum >= 48)) {
                        randNum = randList.nextInt(127);
                    }
                    System.out.print((char)randNum);
                }
            }
            else if (choice == 3) {
                System.out.print("Randomly generated password: ");
                for (int i = 1; i <= length; i++) {
                    randNum = 0;
                    while (!((randNum >= 48 && randNum <= 57) || (randNum >= 65 && randNum <= 90) || (randNum >= 97 && randNum <= 122))) {
                        randNum = randList.nextInt(127);
                    }
                    System.out.print((char)randNum);
                }
            }
            else if (choice == 2) {
                System.out.print("Randomly generated password: ");
                for (int i = 1; i <= length; i++) {
                    randNum = 0;
                    while (!((randNum >= 48 && randNum <= 57) || (randNum >= 97 && randNum <= 122))) {
                        randNum = randList.nextInt(127);
                    }
                    System.out.print((char)randNum);
                }
            }
            else if (choice == 1) {
                System.out.print("Randomly generated password: ");
                for (int i = 1; i <= length; i++) {
                    randNum = 0;
                    while (!(randNum >= 97 && randNum <= 122)) {
                        randNum = randList.nextInt(127);
                    }
                    System.out.print((char)randNum);
                }
            }
            contChoice = true;
            contLength = true;
        }
    }
}