package loops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1,b = 1;
		int c = 0;
		System.out.print(a+" ");
		for(int i = 2;i <= n;i++) {
			if(i % 2 != 0) {
				if(i == 3) {
				System.out.print(1+" ");
				}else {
			c = a + b;
			a = b;b = c;
			System.out.print(c+" ");
				}
		    }
			else {
				int count = 0; 
				for(int j = i;j*j <= n;j++) {
					if(n % j == 0) {
						count++;
						break;
					}
				}
				if(count == 0) {
					System.out.print(n+" ");
					}
			}
		}
	}
}
