package basic;

public class Name {

	public static void main(String[] args) {
		System.out.print("* * * * * * * * *");
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.println("                *");
			if(i == 5) {
				System.out.println("* * * * * * * * *");
				for( i = 0;i<10;i++) {
					System.out.println("*");
				}
				
			}
			if(i == 20) {
				System.out.println("* * * * * * * * *");
			}
		}
		System.out.print("* * * * * * * * * * * * * * * * * *");
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.println("*");
		}
		System.out.println("* * * * * * * * *");
	}

}
