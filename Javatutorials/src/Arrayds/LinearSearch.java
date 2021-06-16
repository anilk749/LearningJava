package Arrayds;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of key");
		int key = sc.nextInt();
		int index = linearSearching(arr,n,key);
		if(index != -1)
			System.out.println("Element is at index "+ index);
		else 
			System.out.println("Element not found");
	}
	 static int linearSearching(int arr[],int n,int key) {
		for(int i = 0;i < n;i++) {
			if(arr[i]==key) 
				return i;
		}
		return -1;
	}
}
