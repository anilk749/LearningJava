package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of terms of which to find the sum");
		int n = sc.nextInt();
		double sum = 0;
//		for(double i = 1;i<=n;i++) {
//			sum = sum + 1/i;
//		}
//		System.out.println(sum);
		for(double i = 1;i <= n;i++) {             //Alternative sign series
			if(i % 2 == 0) sum -= 1/i;
			else sum += 1/i;
		}
        System.out.println(sum);
	}

}
