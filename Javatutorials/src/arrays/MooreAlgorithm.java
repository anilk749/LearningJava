package arrays;

public class MooreAlgorithm {
	public static void main(String[] args) {
		int[] arr = {1,1,2,1,4,2};
		int n = arr.length;
		findMajorityElement(arr,n);
	}
	static void findMajorityElement(int[] arr,int n) {
		int index = 0;
		int count = 1;
		for(int i=1;i<n;i++) {
			if(arr[i] == arr[index]) {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				index=i;
				count = 1;
			}
			count = 0;
			for( i=0;i<n;i++) {
				if(arr[i] == arr[index]) {
					count++;
				}
			}
		}
		if(count > n/2) {
			System.out.println(arr[index]);
		}else {
			System.out.println("no majority element");
		}
		
	}

}
