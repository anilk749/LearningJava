package practice;
import java.util.Scanner;
public class Prac4 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//int n = Integer.parseInt(sc.nextLine());
//		//String name = sc.nextLine();
//		//System.out.println(name+n);
//		float a = 20f;
//		int b = 24;
//		System.out.printf("15%15d",b);
		    int x = 100; 
		    System.out.printf("Printing simple integer: x = %d\n", x); 
		  
		    // this will print it upto 2 decimal places 
		    System.out.printf("Formatted with precison: PI = %.2f\n", Math.PI); 
		  
		    float n = 5.2f; 
		  
		    // automatically appends zero to the rightmost part of decimal 
		    System.out.printf("Formatted to specific width: n = %.4f\n", n); 
		  
		    n = 2324435.3f; 
		  
		    // here number is formatted from right margin and occupies a 
		    // width of 20 characters 
		    System.out.printf("Formatted to right margin: n = %20.4f\n", n); 
		  }
}

