package arrays;

public class MajorityArrayElement {

	public static void main(String[] args) {
		int[] arr = {2,1,3,1,1};
		int n = arr.length;
		findMajorityElement(arr,n);
	}
		
	static void findMajorityElement(int[] arr,int n) {
		int index = 0;
		int maxCount = 0;
		for(int i = 0;i <n;i++) {
			int count = 0;
			for(int j = 0;j <n;j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count > maxCount) {
				maxCount = count;
				index = i;
			}
		}
		if(maxCount > n/2)
			System.out.println(arr[index]);
		else
			System.out.println("No majority element");
	}
		
}
