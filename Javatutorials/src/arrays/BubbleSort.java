package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {2,1,8,-3,6,4,12};
		int n = a.length;
		//bubbleSorting1(a,n);
		bubbleSorting2(a,n);
	}
	//bubble sorting function
	static void bubbleSorting1(int a[],int n) {
		for(int i = 0;i < n-1;i++) {
			boolean sorted = true;
			for(int j = 0;j < n-1-i;j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
		System.out.println("Sorted array is : ");
		for(int item : a) {
			System.out.print(item+" ");
		}
	}
	//Or
	static void bubbleSorting2(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			boolean swapped = false;
			for(int j=0;j<n-i-1;j++) {					//a = [5,3,4,2,6,1]
				if(a[j+1]<a[j]) {
					swapped=true;
					swap(a,j+1,j);
				} 
			}
			if(!swapped) {
				break;
			}
		}
		for(int items:a) {
			System.out.print(items+" ");
		} 
	}
	static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i] = a[j];
		a[j] = temp;		
	}
}
