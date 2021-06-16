package loops;

import java.util.Scanner;

public class SquareSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pow = sc.nextInt();
		int p = 1;
		System.out.print(1+",");
		System.out.print(1+",");
		for(int i = 1;i <= pow;i++) {
			int a = 3 * p;
			p = p *3;
			System.out.print(a+",");
			System.out.print(a+",");
		}
	}

}
