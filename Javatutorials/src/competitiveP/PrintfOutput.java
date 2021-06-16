package competitiveP;
import java.util.Scanner;
public class PrintfOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		for(int i = 0; i < 3; i++) {
		String name = sc.nextLine();
		int l = Integer.parseInt(sc.nextLine()); 
		System.out.printf("%-15s"+"%03d" ,name,l);
		}
//		System.out.printf("%08d%n",l);
//		System.out.printf("%-10.3f",f);
//		System.out.printf(" %-10s", name+"%03d",l);
//		String fs;
//		fs = String.format("The value of the float variable is %f " +
//		                   ", while the value of the " + 
//		                   "integer variable is %d, " +
//		                   " and the string is %s",
//		                   f, l, name);
//		System.out.println(fs);
	}

}
