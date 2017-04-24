
/**
 * class TestAssignment *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/29/2007
 */
public class TestAssignment {
    public static void main(String[] args) {
        Assignment[] roster = new Assignment[15];

        roster[0] = new Assignment("8:00 AM - 4:00 PM", "Safe Mart", "John Tiller");
        roster[1] = new Assignment("4:00 PM - 12:00 AM", "Safe Mart", "Mary Ellen");
        roster[2] = new Assignment("12:00 AM - 8:00 AM", "Safe Mart", "DJ Turtle");
        roster[3] = new Assignment("8:00 AM - 4:00 PM", "Wally World", "Sue Manny");
        roster[4] = new Assignment("4:00 PM - 12:00 AM", "Wally World", "Julia Torte");
        roster[5] = new Assignment("12:00 AM - 8:00 AM", "Wally World", "Angela Ayres");
        roster[6] = new Assignment("8:00 AM - 4:00 PM", "Stay Inn", "Tom Beaumont");
        roster[7] = new Assignment("4:00 PM - 12:00 AM", "Stay Inn", "Larry Vibe");
        roster[8] = new Assignment("12:00 AM - 8:00 AM", "Stay Inn", "Emily Rose");
        roster[9] = new Assignment("8:00 AM - 4:00 PM", "Castle Land", "Aron Tropic");
        roster[10] = new Assignment("4:00 PM - 12:00 AM", "Castle Land", "Kyle Haney");
        roster[11] = new Assignment("12:00 AM - 8:00 AM", "Castle Land", "Mark Kennedy");
        roster[12] = new Assignment("8:00 AM - 4:00 PM", "Kool Karts", "Nina Rose");
        roster[13] = new Assignment("4:00 PM - 12:00 AM", "Kool Karts", "Natalee Michaels");
        roster[14] = new Assignment("12:00 AM - 8:00 AM", "Kool Karts", "Manny Rodriquez");

        printRoster(roster);
        System.out.println("\n\nSearching for Nina Rose: ");
        findPerson(roster, "Nina Rose");
        System.out.println("\n\nSearching for Mickey Mouse: ");
        findPerson(roster, "Mickey Mouse");
        System.out.println("\n\nSearching for Castle Land: ");
        findLocation(roster, "Castle Land");
        System.out.println("\n\nSearching for Magic Island: ");
        findLocation(roster, "Magic Island");
    }

    public static void printRoster(Assignment[] r) {
        System.out.println("Time                     Location        Person");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }

    public static void findPerson(Assignment[] r, String toFind) {
        int found = -1;

        for (int i = 0; i < r.length; i++)
            if (r[i].getPerson().compareTo(toFind) == 0) {
                found = i;
                break;
            }
        if (found != -1) { // we have found the person
            System.out.println("We found " + toFind + " in the roster: ");
            System.out.println(r[found]);
        }
        else
            System.out.println(toFind + " is not in the roster");
    }

    public static void findLocation(Assignment[] r, String toFind) {
        int found = 0;

        System.out.println("Find results: ");
        for (int i = 0; i < r.length; i++)
            if (r[i].getLocation().compareTo(toFind) == 0) {
                System.out.println(r[i]);
                found++;
                if (found == 3)
                    break;
            }
        if (found == 0) { // we have not found the location
            System.out.println(toFind + " is not in the roster");
        }
    }
}
