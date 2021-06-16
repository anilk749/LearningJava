package arrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ArrayList1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		//List<Integer> age = new LinkedList<>(); 
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(7);
		numbers.add(2,8);
		numbers.set(3, 9);
		numbers.set(1,3);
//		age.add(23);
//		age.add(24);
		numbers.remove(4);
		List<Integer> toRemove = new ArrayList<>();
		toRemove.add(8);
		toRemove.add(9);
		numbers.removeAll(toRemove);
		//numbers.clear();
//		numbers.addAll(age);
		System.out.println(numbers);
		System.out.println(numbers.size()); 
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(1));
		System.out.println(numbers.isEmpty());
		//to convert a list into an array.
		numbers.toArray();
		//or
//		int[] temp = new int[numbers.size()];
//		numbers.toArray(temp);
	} 

}
