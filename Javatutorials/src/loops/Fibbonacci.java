package loops;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Fibbonacci Series ");
		int n = sc.nextInt();
		int a = 0,b = 1;
		System.out.print(a+" \n"+b+" \n");
		for(int i = 0;i < n-2;i++) {
			int c = a + b;
			System.out.print(c+" \n");
			a = b;
			b = c;
		}
	}

}
