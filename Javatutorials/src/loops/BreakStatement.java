package loops;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i = 1;i<20;i++) {
			if(i == 7) {
				break;
			}
			System.out.println(i);
		}
//		Scanner sc = new Scanner(System.in);
//		for( ; ;) {
//			int n = sc.nextInt();
//			if(n > 0)
//			  break;
//		}
	}

}
