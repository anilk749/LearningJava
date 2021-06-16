package ConditionalStatements;
import java.util.Scanner;
public class SwitchCaseStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		if(dayofweek==1) {
//			
//		}
//		if(dayofweek==2) {
//			 
//		}
//		if(dayofweek==3) {
//			
//		}
//		if(dayofweek==4) {
//			
//		}
//		if(dayofweek==5) {
//			
//		}
//		if(dayofweek==6) {
//			
//		}
//		if(dayofweek==7) {
//			
//		}
//		switch(dayofweek) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//		    break;
//		case 3:   
//			System.out.println("Wednesday");
//		    break;
//		case 4:   
//			System.out.println("Thursday");
//		 //   break;
//		case 5:   
//			System.out.println("Friday");
//		   // break;
//		case 6:   
//			System.out.println("Saturday");
//		    break;
//		 default:
//				System.out.println("Sunday");
//		   
//		}
		int i = 0;
		while(i<5){
			System.out.println("Enter your rating  1 to 5 .");
			int rating = sc.nextInt();
		switch(rating) {
		case 1 :
			break;
		case 2 :
		     System.out.println("Bad review");
		     break;
		case 3 :
			System.out.println("Average review");
			break;
		case 4 :
		case 5 :
			System.out.println("Good review");
			break;
		default :
			System.out.println("Please enter ratings 1 to 5 only.");
		}
		i++;
		}
	}

}
