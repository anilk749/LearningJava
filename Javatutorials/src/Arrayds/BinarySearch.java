package Arrayds;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		System.out.println(binarySearch(arr,n,key));

	}
	static int binarySearch(int arr[],int n,int key) {
		int start=0;
		int end=n;
		while(start<=end) {
			int mid=(start+end)/2;
  			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]>key) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}

}
