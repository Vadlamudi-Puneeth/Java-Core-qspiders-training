package polymorphism;

public class Task13Main {
	public static void main(String[] args) {
		Task13Account t13;
		t13 = new Task13SavingsAccount();
		System.out.println(t13.balance);
		t13.calculateInterest(4);
		t13.bankName();
		
		// objects are accessed using reference type not object type
		// in 5 and 6 lines Task13Account is reference type and Task13SavingsAcvount is object type
		
		Task13SavingsAccount s = (Task13SavingsAccount)t13;
		System.out.println(s.balance);
		s.calculateInterest(4);
		s.bankName();
	}
}
