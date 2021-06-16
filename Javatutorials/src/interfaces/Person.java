package interfaces;

public class Person implements Student,YouTuber {

	public static void main(String[] args) {
		Person obj = new Person();
	
		obj.makeVideos();
		Student st = obj;
		st.study();

	}
	
	@Override
	public void makeVideos() {
		System.out.println("Person makes youtube videos.");
	}
	
}
