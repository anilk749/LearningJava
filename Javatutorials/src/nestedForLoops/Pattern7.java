package nestedForLoops;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int n = sc.nextInt();
		int rows = 2*n ;
		int columns = 1;
		for(int i = 1;i < rows;i++) {
			for(int j = 1;j<=columns;j++) {
				System.out.print("* ");
			}
				if(i<n) {
					columns++;
				}
				else columns--;
			System.out.println();
		}
		//or
		System.out.println();
		for(int i = 1;i <rows;i++) {
			if(i <= n) {
			for(int j = 1;j <= i;j++) {
				System.out.print("* ");
			}
			}
			else {
				for(int j = 1;j < rows-i+1;j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		}
       
	}
