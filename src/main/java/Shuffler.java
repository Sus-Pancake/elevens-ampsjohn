/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 3;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		// we create a new array of the same length as values
		int[] newArray = new int[values.length];
		// start an unshuffled counter at 0
		int unshuffledCounter = 0;
		// note the midpoint
		int midpoint = values.length/2;
		// loop through the first half of the values array
		for(int i = 0; i < midpoint; i++){
			// set newArray[unshuffled to values[i]
			newArray[unshuffledCounter] = values[i];
			// increment the unshuffled counter by 2
			unshuffledCounter += 2;
		}
		// reset the unshuffled counter to 1
		unshuffledCounter = 1;
		// loop through the second half of the values array
		for(int i = midpoint; i < values.length; i++){
			// set newArray[unshuffled to values[i]
			newArray[unshuffledCounter] = values[i];
			// increment the unshuffled counter by 2
			unshuffledCounter += 2;
		}
		// copy the values from newArray to values
		for(int i = 0; i < values.length; i++){
			values[i] = newArray[i];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		// start a for loop that goes in reverse
		for(int k = values.length - 1; k > 0; k--){
			// draw a random number from 0 - k
			int randomMcMan = (int)(Math.random() * (k + 1));
			//three part swap
			int temperson = values[randomMcMan];
			values[randomMcMan] = values[k];
			values[k] = temperson;
		}
	}
}
