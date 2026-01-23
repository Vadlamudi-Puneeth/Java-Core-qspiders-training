package polymorphism;

public class Task10Main {
	public static void main(String[] args) {
		Task10Transport trans[] = new Task10Transport[3];
		trans[0] = new Task10Bus();
		trans[1] = new Task10Flight();
		trans[2] = new Task10Train();
		
		for(Task10Transport tr: trans) {
			tr.bookTicket();
			tr.calculateFare();
		}
		
	}
}
