package loops;

import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = 1;
          for(int i = 0;i <b;i++) {
        	 power *= a;
          }
        System.out.println("Power of "+a+" is "+power);
	}

}
