package stack;

import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(5);
		st.push(6);
		st.push(8);
		int popped = st.pop();
		System.out.println(popped);
		System.out.println(st.peek());
		popped = st.pop();
		System.out.println(popped);
		System.out.println(st.peek());
	}

}
