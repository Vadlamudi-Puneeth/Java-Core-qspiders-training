package abstraction;

public class Task15Main {
	public static void main(String[] args) {
		Task15Subscription t15;
		t15 = new Task15Basic();
		t15.activate();
		t15.deactivate();
		t15.calculateMonthlyCost();
		t15 = new Task15Premium();
		t15.activate();
		t15.deactivate();
		t15.calculateMonthlyCost();
	}
}
