/**
 * Title:		Assignment 3
 * Semester:	COP3337 - Fall 2018
 * @author 		Evan Ross Davis
 * 
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
/**
 * PART II. Provide a subclass of Clock namded WorldClock whose constructor
 * accepts a time offset. For example, if you live in California, a new
 * WorldClock(3) should show the time in New York, three time zones ahead. You
 * should not override getTime.
 */
public class WorldClock extends Clock {
	// Your work goes here
	int offSet;

	/**
	 * Constructs WorldClock
	 * 
	 * @param offset time zone offset
	 */
	public WorldClock(int offSet) {
		this.offSet = offSet;
	}

	/**
	 * 
	 * Gets hours after offset
	 * 
	 * @return hours of current time in string after offset
	 */
	@Override
	public String getHours() {
		int hours = Integer.parseInt(super.getHours());
		int dayHrs = 24;
		hours = hours + offSet;

		if (hours > dayHrs) {
			hours -= dayHrs;
		} else if (hours < 0) {
			hours += dayHrs;
		}
		
		return Integer.toString(hours);
	}

}
