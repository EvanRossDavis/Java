
public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Ferrari", 2019);
		Car car2 = new Car("Lamborghini", 2020);
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		
		System.out.println("Car 1 info:");
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.accelerate();
		System.out.println(car1.getSpeed());
		
		System.out.println("Car 2 info:");
		car2.accelerate();
		System.out.println(car2.getSpeed());
		car2.accelerate();
		System.out.println(car2.getSpeed());
		car2.accelerate();
		System.out.println(car2.getSpeed());
		
		System.out.println("Car 1 info:");
		car1.brake();
		System.out.println(car1.getSpeed());
		car1.brake();
		System.out.println(car1.getSpeed());
		car1.brake();
		System.out.println(car1.getSpeed());
		car1.brake();
		System.out.println(car1.getSpeed());
		car1.brake();
		System.out.println(car1.getSpeed());

		System.out.println(car1.toString());
		System.out.println(car2.toString());
		
		if (car1 == car2 ) {
			
		}

	}

}
