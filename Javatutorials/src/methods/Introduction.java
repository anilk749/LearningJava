package methods;

public class Introduction {

	public static void main(String[] args) {
	int x =4,y = 6;
//	int result = maxOf(x,y);
//	System.out.println(maxOf(x,y));
//	sayHi();
//	sayHi();
//	System.out.println(maxOf(3.4f,6));
//	fun(x);
//	System.out.println(x);
	Dog c = new Dog();
	c.legs = 4;
	Dog d = new Dog();
	d.legs = 2;
	swap(c,d);
	System.out.println(c.legs+" "+d.legs);
//	System.out.println(Dog.swap(c,d));
	System.out.println(swap(x,y));

	}
	static void fun(int s) {
		s = 34;
		System.out.println(s);
	}
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
		}
	static float maxOf(float c,int d ) {
//		System.out.println(c>d?c:d);
		return c>d?c:d;
	}
	static void sayHi() {
		System.out.println("hii");
		System.out.println("Good morning");
	}	
	static int swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		return 0;
	}
	static void swap(Dog a,Dog b) {
		Dog temp = a;
		a = b;
		b = a;
	}
}
class Dog{
	int legs;
}
