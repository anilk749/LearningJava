package ConditionalStatements;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		//int a=8,b=9,c=7;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers : ");
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b =sc.nextInt();
		System.out.print("c = ");
		int c = sc.nextInt();
		int result=0;
//		if(a>b) {
//			if(a>c) {
//				result=a;
//			}
//			else {
//				result = c;
//			}
//		} else {
//			if(b>c){
//				result = b;
//			}
//			else {
//				result = c;
//			}
//		}
		result = a>b ? a>c ? a:c : b>c ? b:c;
System.out.println("Greatest of the three numbers is "+result);

	}

}
