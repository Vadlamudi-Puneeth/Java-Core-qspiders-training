package multithreading;

public class Test2 extends Thread{
	@Override
	public void run() {
		// print numbers from 6 to 10
		for(int i = 6;i < 11; i++) {
			System.out.print(i + " ");
		}
	}
}
