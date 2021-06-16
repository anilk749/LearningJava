
package ConditionalStatements;
import java.util.Scanner;
public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any positive number : ");
		 int number=sc.nextInt();
		if(number<10) {
			System.out.println("Number is less than 10");
		}
		else if(number>10 && number<=15) { 
			System.out.println("Number is greater than 10 and less than 16 ");
		}
		else if(number > 15 && number <=20) 
		{
			System.out.println("Nmuber is greater than 15 and less than 21");
		}
		else {
			System.out.println("Number is greater than 20");
		}
//		 int a=4;
//		 int b=4;
//		 int c = a==b?a:b;
//		 System.out.println(c);  
	}

}
