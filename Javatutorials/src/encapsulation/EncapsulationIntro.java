package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.setPrice(10);
		lap.setRam(20);
		System.out.println(lap.getRam());
		}
	public void doWork() {
		System.out.println("i am working");
	}

}
class Laptop{
	private int ram;
	private int price;
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRam() {
		return ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		boolean isAdmin = true;
		if(!isAdmin) {
			System.out.println("you cannot change price");
		}else {
			this.price = price;
			System.out.println(price);
		}
	}
}
