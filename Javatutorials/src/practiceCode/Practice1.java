package practiceCode;
import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		int nod = 0;
		while(temp > 0) {
			temp = temp / 10;
			nod++;
		}
		int b = (int)Math.pow(10, nod-1);
		while(n > 0) {
			int rem = n%10;
			n = n / 10;
			rev = rev + rem * b;
			b = b / 10; 
		}
		System.out.println(rev);

	}

}
