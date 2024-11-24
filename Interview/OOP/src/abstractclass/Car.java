package abstractclass;

public class Car extends Vehicle {

	public Car(int speed, String brand) {
		super(speed, brand);
	}

	@Override
	public void start() {

		System.out.println("Car engine starts");
	}

	public static void main(String[] args) {
		Car c = new Car(200, "BMW");

		c.getInfo();
		c.start();
	}

}
