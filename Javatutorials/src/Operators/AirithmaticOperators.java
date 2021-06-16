package Operators;

public class AirithmaticOperators {
	public static void main(String[] args) {
		int a=53;
		int b=7;
		int c=b++;
		 c=a++;
		 c = a;
		System.out.println(c+" "+b);
		System.out.println(c);
		try {
			int[] ar= {2,3,4};
			System.out.println(ar[5]);
		}
		catch(Exception e) {
			System.out.println("Somthing went wrong.");
		}
		finally{
			System.out.println("The 'try catch' is finished.");
		}
	}

}
