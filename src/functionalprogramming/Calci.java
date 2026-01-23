package functionalprogramming;

public interface Calci {
//	void add();
	
//	String demo();
	
//	void test(int a);
	
//	int test(int a);
	
//	void evenOrOdd(int a);
	
	void evenNums(int low, int high);
	
	default void sub() {
		System.out.println("hi");
	}
}
