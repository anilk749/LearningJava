package oops;

public class Abstraction {

	public static void main(String[] args) {
		Honda h1 = new Honda();
		h1.start();

	}

}
class Honda extends Car{

	@Override
	void start() {
		
		System.out.println("Honda is starting.");
	}
	
}
class BMW extends Car{

	@Override
	void start() {
		
		System.out.println("BMW is starting.");
	}
	
}
abstract class Car{
	int price;
	abstract void start();
}
