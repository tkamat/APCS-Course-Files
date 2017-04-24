/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *
     * @param args
     *            is not used.
     */
    public static void main(String[] args) {
        Deck normalDeck = new Deck(
                new String[] { "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack",
                        "queen", "king" },
                new String[] { "hearts", "diamonds", "spades", "clubs" },
                new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 });
        Deck animals = new Deck(
                                new String[] {"lion", "tiger", "monkey", "bear", "elephant"},
                                new String[] {"jungles", "savannas", "mountains"},
                                new int[] {21, 4, 54, 2, 119});
        Deck emptyDeck = new Deck(
                                  new String[] {},
                                  new String[] {},
                                  new int[] {});

        Deck standardDeck = new Deck(
                                   new String[] { "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack",
                                                  "queen", "king" },
                                   new String[] { "hearts", "diamonds", "spades", "clubs" },
                                   new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 });
        System.out.println("Normal Deck:");
        System.out.println(normalDeck.isEmpty());
        System.out.println(normalDeck.size());
        System.out.println(normalDeck.deal());
        System.out.println();
        System.out.println("Deck with Animals:");
        System.out.println(animals.isEmpty());
        System.out.println(animals.size());
        System.out.println(animals.deal());
        System.out.println();
        System.out.println("Empty Deck:");
        System.out.println(emptyDeck.isEmpty());
        System.out.println(emptyDeck.size());
        System.out.println(emptyDeck.deal());
        System.out.println();
        System.out.println("Shuffled deck:");
        standardDeck.shuffle();
        System.out.println(standardDeck);
        System.out.println();
        System.out.println("Another Shuffle:");
        standardDeck.shuffle();
        System.out.println(standardDeck);
    }
}
