package whileLoops;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number .");
		int n = sc.nextInt();
		int reverseNumber = 0;
		int temp = n;
        while(temp>0) {
        	int lastDigit = temp % 10;
        	temp /= 10;
        	reverseNumber = reverseNumber*10 + lastDigit;
        	System.out.println(lastDigit+" "+reverseNumber+" "+temp);
        }	
        if(reverseNumber == n) {
        	System.out.println(n+" is a Palindrome number.");
        }
        else {
        	System.out.println(n+" is not a Palindrome number.");
        }
		

	}

}
