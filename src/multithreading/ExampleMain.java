package multithreading;
import java.lang.*;

public class ExampleMain {
	public static void main(String[] args) throws InterruptedException{
		Example e1 = new Example();
		Example e2 = new Example();
		
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
//		t2.run(); // this wont create the thread
//		System.out.println();
		t1.start();
		t1.join();
		t1.sleep(5000);
		System.out.println("\nhello main");
		t2.start();
		
	}
}
