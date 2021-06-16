package practice;
import java.util.Scanner;
public class Prac3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		/*while(i<=10){
			System.out.println(i);
			i++;
		}*/
		int i=0;
		for(i = 0 ; i <= n;i++) {
			i = i+1;
//			System.out.println(i);
		}
		System.out.println(++i);
//		int a = 0;
//		int i;
//		for( i = 0 ; i <= n;i++) {
//			a = a+1;
//			System.out.println(a);
//		}
//		System.out.println(i);
	}

}
