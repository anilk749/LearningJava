package basic;

public class basic {

	public static void main(String[] args) {
		int j;
		for(int i=0;i<5;i++)
		{
			for(j=i;j<5;j++)
			{
			  System.out.print("*");
			}
			System.out.println(" ");
		}

		for(int i=0;i<5;i++)
		{
			for( j=0;j<i;j++)
			{
			  System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
