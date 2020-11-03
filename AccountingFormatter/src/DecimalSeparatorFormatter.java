/**
 * Title:		Assignment 4
 * Semester:	COP3337 - Fall 2018
 * @author 		Evan Ross Davis
 * 
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
 *  
 *  A DecimalSeparatorFormatter formats an integer with decimal separators; for example,
 *  one million as 1,000,000. 
 **/

class DecimalSeparatorFormatter implements NumberFormatter {
	
	//Declared in NumberFormatter.
	public String format(int n) {
		return String.format("%, d", n);
	}
}
