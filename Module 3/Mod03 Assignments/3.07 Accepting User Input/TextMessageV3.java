
/**
 * Converts normal message into "text message speak"
 * 
 * @author T. Kamat 
 * @version 08/16/16
 */
import java.util.Scanner;
public class TextMessageV3
{
    public static void main( String [] args )
    { 
        System.out.println( );
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        System.out.println( "                                    TEXT MESSAGE SPEAK" );
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        System.out.println( );
        
        //Scanner declaration
        Scanner in = new Scanner( System.in );
       
        //Inputed message
        System.out.println( "Please input a sentence (all lowercase, no punctuation, with spaces), and press enter: " );
        String originalMessage = in.next();
        originalMessage += in.nextLine();
        System.out.println();
        
        //String objects for abbreviations
        String abbr1 = "omg";
        String abbr2 = "afk";
        String abbr3 = "mins";
        String abbr4 = "brb";
        String abbr5 = "see ya";
        String abbr6 = "btw";
        String abbr7 = "lol";
        String abbr8 = "imo";
        String abbr9 = "gr8";
        String abbr10 = "m8";
        String abbr11 = "sk8";
        String abbr12 = "idk";
        String abbr13 = "r8";
        String abbr14 = "bday";
        
        //String object for new message
        String newMessage = originalMessage.replace( "Oh my god", abbr1 );
        newMessage = newMessage.replace( "away from keyboard", abbr2 );
        newMessage = newMessage.replace( "minutes", abbr3 );
        newMessage = newMessage.replace( "be right back", abbr4);
        newMessage = newMessage.replace( "see you later", abbr5);
        newMessage = newMessage.replace( "by the way", abbr6);
        newMessage = newMessage.replace( "laugh out loud", abbr7);
        newMessage = newMessage.replace( "in my opinion", abbr8);
        newMessage = newMessage.replace( "great", abbr9);
        newMessage = newMessage.replace( "mate", abbr10);
        newMessage = newMessage.replace( "skate", abbr11);
        newMessage = newMessage.replace( "i don't know", abbr12);
        newMessage = newMessage.replace( "rate", abbr13);
        newMessage = newMessage.replace( "birthday", abbr14);
        
        
        //String lengths
        int originalLength = originalMessage.length( );
        int newLength = newMessage.length( );
        
        System.out.println( "Original Message: " );
        System.out.println( originalMessage );
        System.out.println( "message length: " + originalLength + " characters " );
        System.out.println( );
        
        System.out.println( "New Message: " );
        System.out.println( newMessage );
        System.out.println( "message length: " + newLength + " characters " );
        System.out.println( );
        
        //String method samples
        
        int index1 = abbr4.indexOf( 'b' ); 
        int messageLength = originalMessage.length();
        int firstThird = messageLength / 3;
        int lastThird = messageLength - firstThird;
        String substring2 = originalMessage.substring( 0, firstThird );
        String substring1 = originalMessage.substring( lastThird );
        String replacement1 = originalMessage.replaceAll( "[aeiou]", "8" );
        
        //String method samples printed
        System.out.println( "String method samples: " );
        System.out.print( "indexOf \"b\": " );
        System.out.println( index1 );
        System.out.print( "substring first third (2 parameters): " );
        System.out.println( substring2 );
        System.out.print( "substring last third (1 parameter): " );
        System.out.println( substring1 );
        System.out.print( "replaceALL vowels with 8's: " );
        System.out.println( replacement1 );
        System.out.println( );
        
        
    }
}
