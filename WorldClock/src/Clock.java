import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
 * Title:		Assignment 3
 * Semester:	COP3337 - Fall 2018
 * @author 		Evan Ross Davis
 * 
 *  I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.
/**
 * Part I: Implement a class Clock whose getHours, getMinutes and getTime
 * methods return the current time at your location. Return the time as a
 * string.
 *
 * There are two ways to retrieve the current time as a String:
 *
 * 1) Before Java 8 use new Date().toString() 2) With Java 8, you can use 3
 * classes in the java.time package: Instant, LocalDateTime and ZoneId. Here's
 * how you do it: String timeString = LocalDateTime.ofInstant(Instant.now(),
 * ZoneId.systemDefault()).toString()
 *
 * With either method, you'll need to extract the hours and minutes as a
 * substring.
 *
 *
 * Add an alarm feature to the Clock class. When setAlarm(hours, minutes) is
 * called, the clock stores the alarm. When you call getTime, and the alarm time
 * has been reached or exceeded, return the time followed by the string "Alarm"
 * and clear the alarm.
 */
public class Clock {
	private int hours;
	private int minutes;

	/**
	 * Sets the alarm.
	 * 
	 * @param hours
	 *            hours for alarm
	 * @param minutes
	 *            minutes for alarm
	 */
	public void setAlarm(int hours, int minutes) {
		// Complete this method
		this.hours = hours;
		this.minutes = minutes;

	}

	/**
	 * gets current time composed of hours and minutes
	 * 
	 * @return time in string;
	 */
	public String getTime() {
		// Complete this method
		String time = getHours() + ":" + getMinutes();
		
		if (hours != 0) {
			if (Integer.parseInt(getHours()) >= hours) {
				if (Integer.parseInt(getMinutes()) >= minutes) {

					hours = 0;
					minutes = 0;
					return "Alarm " + time;
				}
			}
		}
		return time;

	}

	/**
	 * gets hours
	 * 
	 * @return hours of current time in string
	 */
	public String getHours() {
		// Complete this method
		return currentTime().substring(11, 13);

	}

	/**
	 * gets minutes
	 * 
	 * @return minutes of current time in string
	 */
	public String getMinutes() {
		// Complete this method
		return currentTime().substring(14, 16);

	}

	/**
	 * Returns the current Date and Time as a String.
	 */
	private String currentTime() {
		return LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString();
	}
}
