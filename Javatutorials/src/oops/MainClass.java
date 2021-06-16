package oops;
import encapsulation.EncapsulationIntro;
public class MainClass {
	public static void main(String[] args) {
//		Person p1 = new Person();
//		Person p2 = new Person(26,"amit");
//		p1.name = "Anil";
//		p1.age = 24;
//		p1.eat();
//		p2.walk();
//		System.out.println(p1.name);
//		System.out.println(Person.count);
//		System.out.println(p2.name+" "+ p2.age);
//		Developer d1 = new Developer(21,"Deepak");
//		System.out.println(d1.name+" "+d1.age);
//		d1.walk();
		EncapsulationIntro obj = new EncapsulationIntro();
		obj.doWork();
	}
}
	 class Person {
		int age;
		String name;
		static int count;
		public Person(){
			count++;
			System.out.println("hello");
		}
		public Person(int age,String name){
			this();
			this.name = name;
			this.age = age;
		}
		void walk() {
			System.out.println("walking");
		}
		public void eat() {
			System.out.println("eating");
		}
	}
 	class Developer extends Person{
		 public Developer(int age ,String name) {
			 super(age,name);
		 }
		 void walk() {
				System.out.println("Developer is walking");
			}
	 }

