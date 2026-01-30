package multithreading;

public class Demo extends Thread{
	//Override the run method
	
	@Override
	public void run() {
		System.out.println("Hello, Thread is running");
	}
	
}
