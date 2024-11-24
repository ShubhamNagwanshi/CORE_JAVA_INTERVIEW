package abstractclass;

public abstract class Vehicle {

	public int speed;
	public String brand;

	public Vehicle(int speed, String brand) {
		this.speed = speed;
		this.brand = brand;
	}

	public abstract void start();

	public void getInfo() {
		System.out.println("Vehicle Brand ->"+ " "+ brand);
		System.out.println("Vehicle Speed ->"+ " " + speed);
	}
}
