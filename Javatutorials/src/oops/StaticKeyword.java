package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	static {
		System.out.println("block 1");
	}
	static {
		System.out.println("block 2");
	}

	public static void main(String[] args) {
//		A objA = new A();
//		B objB = objA.new B();
//		C objC = new C(); 
		System.out.println("main block ");
	}
	static {
		System.out.println("block 3");
	}

}
