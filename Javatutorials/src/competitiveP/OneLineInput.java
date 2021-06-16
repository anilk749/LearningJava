package competitiveP;
import  java.util.Scanner;
public class OneLineInput {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		    String InputValue;
		    String name[] = new String[6];
		    int number[] = new int[6];
		    for (int x = 0; x < 1; x++) {
		        System.out.print(" Name & number : ");
		        InputValue = in.nextLine();
		        String[] Value = InputValue.split(" ");
		        name[x] = Value[0];
		        number[x] = Integer.parseInt(Value[1]);
		        System.out.println(name[x]+" "+number[x]);
		    }
		    
}
}
