package loops;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {         /* is a number prime */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int t = sc.nextInt();
		for(int j =0;j<=t;j++) {
			int n = sc.nextInt();
			boolean isPrime = true;
			for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) { 
				isPrime = false;
				break;
			}
		}
				if(isPrime == true) {
					System.out.println("isPrime");
				}
				else {
					System.out.println("not prime");
				}
	}
	}
}
