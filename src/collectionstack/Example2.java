package collectionstack;
import java.util.Stack;

public class Example2 {
	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
//		System.out.println(st.capacity());
		
		st.push(10);
		st.push(20);
		st.push(40);
		
//		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		
	}
}
