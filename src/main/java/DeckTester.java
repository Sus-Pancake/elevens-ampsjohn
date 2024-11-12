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

		// is it empty? (it's not)

		// what's the size? 

		// deal all the cards 

		// check if it's empty again (it should be)

		// shuffle the deck

		// print the deck

	}
}
