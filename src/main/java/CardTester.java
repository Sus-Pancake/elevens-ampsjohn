/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("King", "Hearts", 10);
		Card c2 = new Card("Queen", "Spades", 10);
		Card c3 = new Card("Queen", "Spades", 10); 
		Card c4 = null;
		c4 = new Card("Five", "Hearts", 5);

		// **** UNIT TESTS ****
		System.out.println("\n**** Tests for Card ****\n");
		
		// TO STRING: 
		System.out.println("\ntoString() TESTS\n");
		
		System.out.println("Card 1: " + c1);
		System.out.println("Card 2: " + c2);
		System.out.println("Card 3: " + c3);
		
		// ACCESSORS: 
		System.out.println("\nACCESSORS TEST\n");
		
		System.out.println("Card 1 Rank: " + c1.rank());
		System.out.println("Card 1 Suit: " + c1.suit());
		System.out.println("Card 1 Point Value: " + c1.pointValue());

		System.out.println("Card 2 Rank: " + c2.rank());
		System.out.println("Card 2 Suit: " + c2.suit());
		System.out.println("Card 2 Point Value: " + c2.pointValue());

		// MATCHES:
		System.out.println("\nMATCHES TEST\n");
		
		System.out.println("Card 1 matches Card 2? " + c1.matches(c2));
		System.out.println("Card 2 matches Card 3? " + c2.matches(c3));
	}

}
