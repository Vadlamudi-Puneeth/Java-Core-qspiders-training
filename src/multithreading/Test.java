package multithreading;

public class Test extends Thread{
	
	@Override
	public void run() {
		// print numbers from 1 to 5
		for(int i = 1;i < 6; i++) {
			System.out.print(i + " ");
		}
	}
	
}
