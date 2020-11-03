
public class Car {
	private String make;
	private int year;
	private int speed;

	public Car(String make, int year) {

		this.make = make;
		this.year = year;
		speed = 0;
	}

	public String toString() {

		String str = "";
		str = String.format("A %d %s that is going %.1f mph", getYear(), getMake(), getSpeed());
		return str;
	}

	public String getMake() {
		return make;
	}

	public double getSpeed() {
		return speed;
	}

	public int getYear() {
		return year;
	}

	public void accelerate() {
		speed = speed + 5;
	}

	public void brake() {
		speed = speed - 5;
	}

}
