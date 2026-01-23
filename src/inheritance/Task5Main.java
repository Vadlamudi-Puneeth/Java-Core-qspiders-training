package inheritance;

public class Task5Main {
	public static void main(String args[]) {
		int marks[] = {80,90,88};
		Task5Result t5 = new Task5Result(101, "nani",marks);
		t5.displayTotal();
		t5.displayPercent();
	}
}
