package polymorphism;

public class Task5Main {
	public static void main(String args[]) {
		Task5Employee t5;
		t5 = new Task5Manager(10000);
		t5.calculateBonus();
		
		t5 = new Task5Developer(20000);
		t5.calculateBonus();
		
		t5 = new Task5Intern(30000);
		t5.calculateBonus();
		
	}
}
