/**
 * A class representing the methods for a word guessing game.
 * 
 * @author Evan Davis
 * @version 1.0
 */

public class WordGuess {

	/**
	 * theWord The current word to guess. It will be preserved throughout play.
	 * userWord A pattern that represents the progress the user is making on the
	 * word. guess The letter that the user is guessing. strikes The number of bad
	 * guesses the user has made. guesses A list of characters that the user has
	 * guessed.
	 */

	/**
	 * Takes the word the player is trying to guess and generates a pattern of '*'
	 * values to represent letters that have not yet been guessed. For example, if
	 * the word were "dog" this method would return "***".
	 *
	 * @param Takes
	 *            the word the player is trying to guess
	 * @return a random word from the Dictionary
	 */
	public static String makeUserWord(String theWord) { // userWord now is ***
		String userWord = "";
		for (int i = 0; i < theWord.length(); i++) {
			userWord += "*";
		}

		return userWord;
	}

	/**
	 * Returns true if the guessed character is in the word, false otherwise. For
	 * example, if the guess were 'x' and the word were "xylophone" this method
	 * would return true.
	 *
	 * @param Takes
	 *            the user guess and the word to be guessed
	 * @return Returns true if the guessed character is in the word, false
	 *         otherwise.
	 */
	public static boolean isInWord(char guess, String theWord) { // returns true/false if charAt is equal to guess
		boolean result = false;
		for (int i = 0; i < theWord.length(); i++) {
			if (theWord.charAt(i) == guess) {
				result = true;
			}

		}
		return result;
	}

	/**
	 * Returns a userWord with all occurrences of '*' corresponding to the current
	 * guess replaced with that guess. For example, if the word was "fetch" and the
	 * user word was "****h" and the user guessed 'e', the return string would be
	 * "*e**h".
	 *
	 * @param char
	 *            guess, a string of stars, and the word the user must guess
	 * @return a userWord that has been updated with correctly guessed chars
	 */
	public static String updateUserWord(char guess, String userWord, String theWord) { // return a userWord that has had
																						// correct letters revealed
		String wordUpdated = userWord;	
		for (int i = 0; i < theWord.length(); i++) {
			if (theWord.charAt(i) == guess) {
				wordUpdated = wordUpdated.substring(0, i) + guess
						 + wordUpdated.substring(i + 1);
			}
		}
		
		return wordUpdated;
	}

	/**
	 * Updates the list of guesses with the current guess. The update should only
	 * add the guess if it does not already exist in the list. The new guess must be
	 * placed at the end of the existing list of guesses. For example, if guesses
	 * were "tabg" and the current guess were 'f', this method would return "tabgf".
	 *
	 * @param a
	 *            string of guesses and a char guess
	 * @return guesses as a string
	 */
	public static String updateGuesses(String guesses, char guess) {

	      // Variables
	      boolean prevGuess = false;
	      String guessList = guesses;
	      
	      // Create string of guessed characters
	      for (int i = 0; i < guesses.length(); i++) {
	         if (guesses.charAt(i) == guess) {
	            prevGuess = true;
	         }
	      }
	         
	      if (!prevGuess) {
	         guessList = guesses + guess;
	      }
	      
	      // Return updated string of guesses
	      return guessList;
	}

	/**
	 * Returns a String that is the userWord with spaces between each letter and
	 * each '*' replaced with an '_'. For example, if the userWord is "fe***" this
	 * method would return "f e _ _ _". Note that there is no space before the 'f'
	 * and after the last '_'.
	 *
	 * @param the
	 *            userWord represented as stars
	 * @return a string that has had all stars replaced by underscore + space
	 */
	public static String displayUserWord(String userWord) {
		// Variables
	      String wordDisplay = "";
	      
	      // Format string for display
	      for (int i = 0; i < userWord.length(); i++) {
	         if (i == userWord.length() - 1) {
	            wordDisplay = wordDisplay + userWord.charAt(i);
	         } else {
	            wordDisplay = wordDisplay + userWord.charAt(i) + " ";
	         }
	      }
	      
	      wordDisplay = wordDisplay.replace('*', '_');
	      
	      // Return display string of word
	      return wordDisplay;
	}

	/**
	 * Returns a String in the form "Strikes: %d\tGuesses: %s", with the list of
	 * guesses separated by spaces. For example, if there were 3 strikes and guesses
	 * were "bcd", this method would return"Strikes: 3\tGuesses: b c d".
	 *
	 * @param number
	 *            of wrong guesses (strikes), user guesses (guesses)
	 * @return guesses
	 */
	public static String displayGuesses(int strikes, String guesses) {
		 // Variables
	      String strikesGuesses;
	      String guessSpaced = "";
	      
	      // Format string for strikes and guesses
	      for (int i = 0; i < guesses.length(); i++) {
	         if (i == guesses.length() - 1) {
	            guessSpaced = guessSpaced + guesses.charAt(i);
	         } else {
	            guessSpaced = guessSpaced + guesses.charAt(i) + " ";
	         }
	      }
	      
	      strikesGuesses = "Strikes: " + strikes + "\tGuesses: " + guessSpaced;
	      
	      // Return string of strikes and guesses
	      return strikesGuesses;
	}

}
