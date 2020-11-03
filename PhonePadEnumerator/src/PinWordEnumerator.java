import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Converts a numeric pin to an equivalent word using the digit to letter
 * mapping on a standard telephone keypad.
 */
public class PinWordEnumerator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a pin number-> ");
		String num = scan.nextLine();
		System.out.println();
		System.out.printf("The keypad encodings for %s are:%n", num);
		enumerateWords(num);
	}

	/**
	 * A wrapper for a recursive method that enumerates all the phone keypad
	 * encodings for a number.
	 * 
	 * @param n, a string representing the number
	 */
	public static void enumerateWords(String n) {
		// Implement a recursive method that generates
		// all possible phone keypad encodings for a
		// number. Implement additional auxiliary methods
		// if necessary.
		// these are the keypad letters

		String[] keypadLetters = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		// storing the result to result list

		List<String> result = new LinkedList<>();

		StringBuilder string = new StringBuilder();

		// calling function

		letterCombinations(n, 0, keypadLetters, string, result);

		// printing the result

		for (String i : result)
			System.out.println(i);

	}

	private static void letterCombinations(String n, int number, String[] keypadLetters, StringBuilder string,
			List<String> result) {

		// if it is zero length returning same

		if (n.length() == number) {
			result.add(string.toString());

			return;

		}

		String letter = keypadLetters[n.charAt(number) - '2'];
		// this is the main logic to produce keypad combination letters
		for (int i = 0; i < letter.length(); i++) {
			string.append(letter.charAt(i));
			letterCombinations(n, number + 1, keypadLetters, string, result);
			string.deleteCharAt(string.length() - 1);

		}

	}

}