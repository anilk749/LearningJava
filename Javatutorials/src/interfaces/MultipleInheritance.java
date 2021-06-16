package interfaces;

interface P1 {
	void show();
}
interface P2{
	 void show();
}

public class MultipleInheritance implements P1,P2 {

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.show();
		

	}

	@Override
	public void show() {
		System.out.println("hello");
		
	}

}
