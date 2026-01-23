package collectionstack;
import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		// top stores the index of recently pushed element
		
		st.push(10);
		st.push(10);
		st.push(30);
		st.push(60);
		
		System.out.println(st);
//		System.out.println(st.pop());
//		System.out.println(st.peek());
//		System.out.println(st.isEmpty());
//		System.out.println(st);
		
		System.out.println(st.search(30)); // this return the 1-based position
		System.out.println(st.search(10));
	
	}
}
