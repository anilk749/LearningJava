package ConditionalStatements;

public class Nestedif {

	public static void main(String[] args) {
		int a=4,b=7,c=60;
	    int result=0;
		if(a>b) {
			if(a>c) {
				result=a;
			} 
			else {
				result=c;
			}
		}
			else {
				if(b>c) {
					result=b;
				}
				else {
					result=c;
				}
			}
		System.out.println("Largest of three numbers is "+result);
		}

	}

