package interfaces;

public interface Student {
	 default void study() {
		System.out.println("person is student"); 
	 }
}
