package arrays;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i]= sc.nextInt();
		}
         System.out.print("Array is : ");
         for(int i = 0;i < n;i++) {
         System.out.print(arr[i]+" ");
         }
	}

}
