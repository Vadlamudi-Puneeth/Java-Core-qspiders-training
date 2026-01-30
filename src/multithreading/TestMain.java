package multithreading;

public class TestMain {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test2 t2 = new Test2();
		
		t1.start();
		t2.start();
		
	}
}
