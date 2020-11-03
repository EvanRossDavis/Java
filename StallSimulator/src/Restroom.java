/**
 * Title:		Assignment 2
 * Semester:	COP3337 - Fall 2018
 * @author 		Evan Ross Davis
 * 
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
 * 
 * A class that shows the order of occupation for stalls.
 */

public class Restroom {

	private int ns;
	private boolean[] stalls;

	/**
	 * Constructs a restroom with a given number of stalls.
	 * 
	 * @param ns
	 * the number of stalls
	 */
	public Restroom(int ns) {
		
		this.ns = ns;
		this.stalls = new boolean[ns];
		
	}
	
	/*
	 * Calculates the longest sequence of unoccupied places.
	 * 
	 * @return the sequence of spaces
	 */
	public int getHigh() {
		
		int high = 0, temp = 0;

		for (boolean bool : stalls) {
			if (!bool) {
				temp++;
			} else {
				temp = 0;
			}
			if (high < temp)
				high = temp;
		}
		return high;
	}

	/*
	 * Finds the lowest index of unoccupied places.
	 * 
	 * @return the lowest index
	 */
	public int getLow() {
		
		int high = 0, temp = 0, low = 0;

		for (int i = 0; i < stalls.length; i++) {
			if (!stalls[i]) {
				temp++;
			} else {
				temp = 0;
			}
			if (high < temp) {
				low = i - high;
				high = temp;
			}
		}
		return low;
	}

	/*
	 * Adds an occupant in the middle of the longest sequence of unoccupied places.
	 */
	public void addOccupant() {
		
		int index = getLow() + getHigh() / 2;
		stalls[index] = true;
	}

	/*
	 * Gets a string describing the current stall occupation
	 * 
	 * @return a string with _ for an empty stall and X for an occupied one
	 */
	public String getStalls() {
		
		String str = "";
		for (boolean bool : stalls) {
			if (!bool)
				str += "_ ";

			else
				str += "X ";
		}
		return str;
	}
}
