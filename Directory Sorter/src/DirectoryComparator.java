import java.util.Comparator;
/**
 * Title: Assignment 6 Semester: COP3337 - Fall 2018
 * 
 * @author Evan Ross Davis
 * 
 *         I affirm that this program is entirely my own work and none of it is
 *         the work of any other person.
 * 
 *         A comparator that compares strings that end in digit sequences in a
 *         way that makes sense to a human. First compare the part before the
 *         digit as strings, and then compare the numeric values of the digits.
 **/

public class DirectoryComparator implements Comparator<String> {

	/**
	 * compares strings that end in digit sequences in a way that makes sense to a
	 * human.
	 * 
	 * @param string1 first parameter in the compare method.
	 * @param string2 second parameter in the compare method.
	 * @return int the value from the final compare method call
	 */
	@Override
	public int compare(String string1, String string2) {

		int index = 0;
		// find index of first non-digit then increment to get first digit
		index = findNonDigit(string1, index);
		// separate string and number
		String word1 = string1.substring(0, index);
		String numStr1 = string1.substring(index);
		// parse numStr1 into an int
		int num1 = Integer.parseInt(numStr1);

		// find index of first non-digit then increment to get first digit
		index = findNonDigit(string2, index);
		// separate string and number
		String word2 = string2.substring(0, index);
		String numStr2 = string2.substring(index);
		// parse numStr2 into an int
		int num2 = Integer.parseInt(numStr2);

		// compare the part before the digit as strings
		int numCompare = Integer.compare(num1, num2);
		int wordCompare = word1.compareTo(word2);
		if (wordCompare == 0) {
			return numCompare;
		} else {
			return wordCompare;
		}
	}
	
	/**
	 * Find the index of the first non-digit int a string and sets 
	 * the index variable to the location of the first digit
	 * 
	 * @param string first parameter in the compare method.
	 * @param index to be updated
	 * @return int index that was updated to the beginning of the number or, i + 1
	 */
	public int findNonDigit(String string, int index) {
		index = 0;
		for (int i = string.length() - 1; i >= 0; --i) {
			if (!Character.isDigit(string.charAt(i))) {
				index = i + 1;
				break;
			}
		}
		
		return index;
	}
}