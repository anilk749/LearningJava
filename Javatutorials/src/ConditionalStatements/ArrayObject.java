package ConditionalStatements;
public class ArrayObject {
	public static void main(String args[]) {
		int[] arr[]= {{9,3},{2,4}};
		//System.out.print("Element at index"+i+":");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++){
			System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}