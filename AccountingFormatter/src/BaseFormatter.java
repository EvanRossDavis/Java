/**
 * Title:		Assignment 4
 * Semester:	COP3337 - Fall 2018
 * @author 		Evan Ross Davis
 * 
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
 *  
 *  A BaseFormatter formats the number as base n, where n is any number between 2 and
 *  36 that is provided in the constructor.
 **/

class BaseFormatter implements NumberFormatter {
	
	int base;
	
	/**
	 * base is any number between 2 and 36
	 * 
	 * @param base
	 */
	public BaseFormatter(int base) {
		
		this.base = base;
		if (base < 2 || base > 36) base = 2;
	}

	/**
	 * 
	 * 
	 * @param n
	 * @return the String representation of the n when written in the respective base system
	 */
	public String format(int n) {
		return Integer.toString(n, base);
	}

	/**
	 * 
	 * 
	 * @return base as an int
	 */
	int getBase() {
		return base;
	}
}
