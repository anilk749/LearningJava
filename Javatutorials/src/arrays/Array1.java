package arrays;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of students ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		float sum = 0;
		//int average = 0;
		System.out.println("Enter student's marks");
		for(int i = 0;i < n;i++) {
			marks[i] = sc.nextInt();
		}
		for(int i = 0;i < n;i++) {
			sum +=marks[i];
		}
		System.out.println("Average of students's marks is : "+sum/n);
		
	}

}
