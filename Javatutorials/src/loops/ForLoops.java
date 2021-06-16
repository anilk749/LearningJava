package loops;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
//		for(int i=0;i<10;i=i+1) {
//			System.out.println("Hii there "+i);
//		}
//		int sum = 0;
//		int n = 4 ;
//       for(int i=1;i<=n;i++) {
//    	   sum = sum + i;
//       }
		//System.out.println("Sum is "+sum);

//		for(int i=10;i>=1;i=i-1) {
//			System.out.println(i);
//		}
//		int tableof = 2;
//		 for(int i = 1;i <= 10;i++) {
//			 System.out.println(tableof+" * "+i+" ="+" "+tableof*i);
//		 }
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial ");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i = n;i > 0;i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+n+" is "+factorial);
       	}

}
