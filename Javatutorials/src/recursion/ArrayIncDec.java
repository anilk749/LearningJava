package recursion;
import java.util.Scanner;
public class ArrayIncDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		dec(n);
//		System.out.println();
//		inc(n);
//		System.out.println("Another way");
		incDec(n);

	}
//	 static void dec(int a) {
//		if(a == 1) {
//			System.out.println(1);
//			return;  
//		}
//			System.out.println(a);
//			dec(a - 1);
//		}
//      static void inc(int a) {
//		if(a == 1) {
//			System.out.println(1);
//			return;
//		}
//		inc(a - 1);
//		System.out.println(a);
//	}
      // Another shorter way
      static void incDec(int n) {
    	  if(n == 0) {
  			return;  
  		}
  			System.out.println(n);
  			incDec(n - 1);
  			System.out.println(n);
  		}

}
