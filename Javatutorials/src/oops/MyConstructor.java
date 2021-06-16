package oops;
class Vehicle{
	int wheels;
	int headLights;
	String color;
	Vehicle(){
		
	}
	Vehicle(int wheels){
		this.wheels = wheels;
		headLights = 2;
	}
	Vehicle(String color,int wheels){
		this.color = color;
		this.wheels = wheels;
		headLights = 2;
	}
}
public class MyConstructor {
	String name;
	MyConstructor(String name1){
		name = name1;
	}
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor("anil");
		Vehicle car = new Vehicle(4);
		Vehicle bike = new Vehicle("Green",2);
		Vehicle scooty = new Vehicle();
		System.out.println(scooty.wheels);
		System.out.println(car.wheels+" "+car.headLights);
		System.out.println(bike.wheels+" "+bike.color+" "+bike.headLights);
	}
}
