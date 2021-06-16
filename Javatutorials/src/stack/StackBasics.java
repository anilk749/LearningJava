package stack;

public class StackBasics {
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(2);
		st.push(4);
		st.push(7);
		System.out.println(st.Top());
		System.out.println(st.empty());
		st.pop();
		st.pop();
		System.out.println(st.Top());
		System.out.println(st.empty());
		st.push(8);
		System.out.println(st.Top());
		st.push(8);  
	}
}
class Stack {
	private static final int n = 1;
	int arr[];
	int top;
	Stack(){
		arr = new int[n];
		top=-1;
	}
	void push(int x) {
		if(top==n-1) {
			System.out.println("stack overflow");
			return ;
		}
		top++;
		arr[top]=x;
	}
	void pop() {
		if(top==-1) {
			System.out.println("No element to pop");
			return ;
		}
		top--;
	}
	int Top() {
		if(top==-1) {
			System.out.println("no element in stack");
			return -1;
		}
		return arr[top];
	}
	boolean empty() {
		return top==-1;
	}
	
}
