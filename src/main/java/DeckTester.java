/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

		System.out.println("\n**** Tests for Deck ****\n"); 

		// example card ranks[]
		String[] ranks = {"King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace"};

		// example suits[]
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		// example pointValues[]
		int[] pointValues = {10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		Deck deck1 = new Deck(ranks, suits, pointValues);

		// print the deck
		System.out.println(deck1);

		// is it empty? (it's not)
		System.out.println("Is the deck empty? " + deck1.isEmpty());

		// what's the size? 
		System.out.println("Size of deck? " + deck1.size());

		// deal all the cards 
		int size = deck1.size();
		for(int i = 0; i < size; i++) {
			System.out.println("Dealt: " + deck1.deal());
		}

		// check if it's empty again (it should be)
		System.out.println("Is the deck empty? " + deck1.isEmpty());

		// shuffle the deck
		deck1.shuffle();

		// print the deck
		System.out.println(deck1);

	}
}
