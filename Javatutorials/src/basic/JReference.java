package basic;

public class JReference {
	String name;
	JReference(String st){
		this.name = st;
	}
	public void name() {
		System.out.println(name);
	} 

	public static void main(String[] args) {
		JReference r1 = new JReference("anil");
//		JReference r2 = new JReference("ajay");
//		name(r1,r2);
		r1.name();
		
	}

}
