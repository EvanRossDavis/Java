/**
 * Title:		Assignment 4
 * Semester:	COP3337 - Fall 2018
 * @author 		Evan Ross Davis
 * 
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
 *  
 *  • An AccountingFormatter formats negative numbers with parenthesis; for example, -1 as (1). 
 **/

class AccountingFormatter implements NumberFormatter {
	
	//Declared in NumberFormatter.
	public String format(int n) {
		return String.format("(%d)", n);
	}
}
