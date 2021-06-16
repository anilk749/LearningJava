package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principal amount : ");
		int principal=sc.nextInt();
		System.out.print("Enter rate of interest : ");
		float rate=sc.nextFloat();
		System.out.print("Enter time period : ");
		int time=sc.nextInt();
		float SI=principal*rate*time/100;
		
		
		System.out.println("Simple interest is : "+SI);

	}

}
