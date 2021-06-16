package oops;

public class Interfaces implements TestCar,Person1 {

	public static void main(String[] args) {
		Interfaces c1 = new Interfaces();
		c1.start();
		c1.walk();

	}

	@Override
	public void start() {
		System.out.println("Car is starting.");
		
	}

	@Override
	public void walk() {
		System.out.println("Person is walking");
		
	}

}
interface TestCar{
	void start();
}
interface Person1{
	void walk();
}

