package multithreading;
import java.lang.*;

public class Example implements Runnable{

	@Override
	public void run() {
//		System.out.println("Thread is Running....");
//		System.out.println(Thread.currentThread());
	
		for(int i = 1;i <= 5; i++) {
			System.out.print(i + " ");
		}
		
	}
	
}
