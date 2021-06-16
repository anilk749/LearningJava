package basic;

import java.util.Scanner;

public  class Swapping {
	public static void swap(int a,int b) { 
		int temp = a;
		a = b;
		b = temp;
		System.out.println("in method : "+ "a = "+a+" , "+ "b = "+b);
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int x = 3,y = x;
		x = 4; 
		Swapping.swap(a,b);
		System.out.println("in main : "+"a = "+a+" , "+"b = "+b);
		System.out.println("x = "+x+" ,"+"y = "+y);
	}
	

}
