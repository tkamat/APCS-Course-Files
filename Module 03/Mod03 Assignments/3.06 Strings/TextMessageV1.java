
/**
 * Converts normal message into "text message speak"
 * 
 * @author T. Kamat 
 * @version 08/13/16
 */
public class TextMessageV1
{
    public static void main( String [] args )
    {
        //String object for original message
        String originalMessage = "Oh my god, i have to go away from keyboard for 5 minutes, be right back, see you later!";
        
        //String objects for abbreviations
        String abbr1 = "omg";
        String abbr2 = "afk";
        String abbr3 = "mins";
        String abbr4 = "brb";
        String abbr5 = "see ya";
        
        //String object for new message
        String newMessage = originalMessage.replace( "Oh my god", abbr1 );
        newMessage = newMessage.replace( "away from keyboard", abbr2 );
        newMessage = newMessage.replace( "minutes", abbr3 );
        newMessage = newMessage.replace( "be right back", abbr4);
        newMessage = newMessage.replace( "see you later", abbr5);
        
        //String lengths
        int originalLength = originalMessage.length( );
        int newLength = newMessage.length( );
        
        //String messages printed
        System.out.println( );
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        System.out.println( "                                    TEXT MESSAGE SPEAK" );
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        System.out.println( );
        
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
        String substring2 = abbr3.substring( 1, 3 );
        String substring1 = abbr5.substring( 4 );
        String replacement1 = abbr4.replaceAll( "[br]", "v" );
        
        //String method samples printed
        System.out.println( "String method samples: " );
        System.out.print( "indexOf \"b\": " );
        System.out.println( index1 );
        System.out.print( "substring (2 parameters): " );
        System.out.println( substring2 );
        System.out.print( "substring (1 parameter): " );
        System.out.println( substring1 );
        System.out.print( "replaceALL br's with v's: " );
        System.out.println( replacement1 );
        System.out.println( );
        
        
    }
}
