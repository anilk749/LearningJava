package loops;

import java.util.Scanner;

public class FiboAndPrimeSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int a = 1,b = 1;
		int c = 0;
		System.out.print(a+" ");
		for(int i = 2;i <= n;i++) {
		if(i % 2 != 0) {
		if(i == 3) {
		System.out.print(b+" ");
		}else {
		for(int j = 1;j <= i;j++) {
			c = a + b;
			a = b;b = c;
			System.out.print(c+" ");
		}
		}
		}else {
		int count = 0; 
		for(int j = 2;j*j <= i;j++) {
			if(i % j == 0) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.print(i+" ");
			}
		}
		}
	}

}
