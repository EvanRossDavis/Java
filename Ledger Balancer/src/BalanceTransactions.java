/**
 * Title:		Assignment 5
 * Semester:	COP3337 - Fall 2018
 * @author 		Evan Ross Davis
 * 
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
 *  
 *  A program that prompts the store owner for the amount of cash at the beginning of the day and for the
 *	amount of cash at the end of the day, as well as the name of the ledger text file. Your program
 *	should calculate if the actual amount of cash at the end of the day equals the expected value. If
 *	an error is found while reading the text file, the user should be allowed to choose another file. 
 **/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BalanceTransactions {
	/**
	 *
	 * 
	 * @throws FileNotFoundException
	 *             when file doesn't exist
	 */
	public static void main(String[] args) throws FileNotFoundException {
		try {
			processInput();
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
			processInput();
		}
	}

	/**
	 * 
	 * @throws FileNotFoundException
	 *             when file doesn't exist
	 */
	private static void processInput() throws FileNotFoundException {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> invoiceNum = new ArrayList<Integer>();
		ArrayList<Double> amount = new ArrayList<Double>();
		ArrayList<String> paidOrReceived = new ArrayList<String>();

		System.out.println("Enter the amount at opening: ");
		double open = scnr.nextDouble();
		System.out.println("Enter the expected amount at closing: ");
		double close = scnr.nextDouble();

		System.out.println("Enter file name: ");
		Scanner file = new Scanner(new File(scnr.next()));

		// Fill ArrayLists
		while (file.hasNext()) {
			invoiceNum.add(file.nextInt());
			amount.add(file.nextDouble());
			paidOrReceived.add(file.next());
		}

		// Determining whether to add or subtract from startingCash
		for (int i = 0; i < invoiceNum.size(); i++) {
			if (paidOrReceived.get(i).equals("P")) {
				open -= amount.get(i);
			}
			if (paidOrReceived.get(i).equals("R")) {
				open += amount.get(i);
			}
		}

		if (open == close)
			System.out.println("You have the expected amount.");
		else
			System.out.println("You are off.");

		scnr.close();
		file.close();

	}

}
