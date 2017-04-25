
/**
 * Calculates the library fine for the entered book and person, and creates an email template. 
 * 
 * @T. Kamat 
 * @8/22/16
 */
import java.util.Scanner;
public class MonaV2
{
    public static void main(String [] args)
    {
        //declare Scanner object
        Scanner in = new Scanner( System.in );
        
        //input
        System.out.println( "Enter the name (Last, First): " );
        String lastName = in.next();
        lastName = lastName.replace( ",", "" );
        String firstName = in.nextLine();
        firstName = firstName.replace( " ", "" );
        System.out.println( "Enter the phone number (###) ###-####: " );
        String phoneNumber = in.next();
        phoneNumber += in.nextLine();
        System.out.println( "Enter the title of the book: " );
        String bookTitle = in.next();
        bookTitle += in.nextLine();
        System.out.println( "Enter the date checked out (mm/dd/yyyy): " );
        String checkOut = in.next();
        checkOut += in.nextLine();
        System.out.println( "Days late: " );
        String daysLateString = in.next();
        int daysLate = Integer.parseInt( daysLateString );
        System.out.println( "Daily fine: " );
        String dailyFineString = in.next();
        double dailyFine = Double.parseDouble( dailyFineString );
        System.out.println();
        System.out.println();
        
        //processing
        double totalFine = daysLate * dailyFine;
        String fullName = firstName + " " + lastName;
        String firstInitial = firstName.substring( 0, 1 );
        String lastFourDigits = phoneNumber.substring( 10, 14);
        String recipientEmail = firstInitial + lastName + lastFourDigits + "@csamediacenter.com";
        String userEmail = "mona@csamediacenter.com";
        String newCheckOut = checkOut.replace( "/", "-" );
        
        //output
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        System.out.println( "                   Text for email message" );
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        System.out.println();
        System.out.println();
        System.out.println( "To: " + fullName + " (" + recipientEmail + ")" );
        System.out.println( "From: Mona (" + userEmail + ")" );
        System.out.println();
        System.out.println( "Subject: Overdue Book Notice" );
        System.out.println( "============================================================" );
        System.out.println( bookTitle + " was checked out on: " + newCheckOut );
        System.out.println( "This book is currently " + daysLate + " day(s) late" );
        System.out.println( "Your fine has accumalated to $" + totalFine );
    }
}
