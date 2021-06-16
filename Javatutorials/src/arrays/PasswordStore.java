package arrays;

import java.util.Arrays;

public class PasswordStore {

	public static void main(String[] args) {
		String pwd1 = "anil1234";
		System.out.println("Password is:" + pwd1);
		char pwd2[] = new char[]{'a','n','i','l','1','2'};
		System.out.println("password is: "+pwd2);
		Arrays.fill(pwd2,'*');
		for(int i=0;i<pwd2.length;i++) {
		System.out.print(pwd2[i]);
		}
	}

}

