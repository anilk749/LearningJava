package Arrayds;

 class Student{
	public int id;
	public String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class ObjectArray {

	public static void main(String[] args) {
		Student[] arr=new Student[3];
		arr[0]= new Student(1,"Anil");
	    arr[1]=new Student(2,"Ajay");
		arr[2]=new Student(3,"Rahul");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].id+" "+arr[i].name);
		}
	}

}
