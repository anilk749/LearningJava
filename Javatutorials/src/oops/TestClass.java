package oops;

public class TestClass {
	int id;
	int age;
	String name;
	TestClass(int id,String name){
		this.id = id;
		this.name = name;
	}
	void show() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		TestClass t = new TestClass(12,"anil");
		t.age = 23;
		t.show();
		System.out.println(t.age);
	}
	

}
