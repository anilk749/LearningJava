package maps;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		Map<String,Integer> numbers = new HashMap<>();
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("three",3);
		numbers.put("one",5);     //replace the old value 1 with new value 5
		numbers.put("four",2);
		numbers.put("seven",9);
		numbers.putIfAbsent("four",2);
		System.out.println(numbers);
		System.out.println(numbers.get("one")); // returns the value associated with this key
		System.out.println(numbers.containsKey("two"));   //returns true if given key present
		

	}

}
