package strings;

public class StringsIntro {

	public static void main(String[] args) {
		String name = "  anil  ";
		String name2 = new String(" anil");
		String name1 = "anilkumar ";
		String cars = "Honda,Hyundai,Suzuki,Tata";
		String allcar[] = cars.split(","); 
		for(String car : allcar) {
			System.out.println(car+" ");
		}
		String reverse = "I love coding in java language "; //reversing string

        String reverse2[] = reverse.split(" ");
        for(String rev:reverse2) {
        System.out.print(rev+" ");
        } 
        System.out.println();
        for (int i = reverse2.length-1; i >= 0; i--) {

            System.out.print( reverse2[i]+" ");

        }
        System.out.println();
        System.out.println(reverse2[1]);
     //     System.out.println();
	//	System.out.println(cars);
//	System.out.println(cars.indexOf('y')); 
//		System.out.println(name.trim());  // to remove white spaces
//		System.out.println(cars.replace('a','A')); 
//		String anotherName = new String("Anil");  // Creating object
//		System.out.println(name==name1);
//		System.out.println(name1);
//		System.out.println(name.charAt(2)); //char charAt(int index) 
//		System.out.println(name.length());  //int length()
//		System.out.println(name1.substring(4,7));  //String substring(int beginIndex)
//		System.out.println(name.contains("nil"));  // boolean contains(CharSequence s)
//		System.out.println(name.equals(name2));  //boolean equals(object another)
//		System.out.println(name.substring(0,4));//String substring(int beginIndex,int endIndex)
	//	System.out.println(name1.isEmpty());  //boolean isEmpty();
	//	System.out.println(name.concat(name2)); //String concat(String str)
        char c = 'A';
        int a = (int) c;
        System.out.println(a);
	}
	
}
