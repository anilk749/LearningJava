package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j = 0;j<5;j  ++) {
		System.out.println("Enter the number to find its factorial ");
		
		int factorial = 1;
		for(int i = n;i > 0;i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+n+" is "+factorial);
		}

	}

}
