package abstraction;

public class Task10Main {
	public static void main(String[] args) {
		Task10Course t10;
		t10 = new Task10OnlineCourse();
		t10.startCourse();
		t10.endCourse();
		t10.calculateDuration();
		t10 = new Task10OfflineCourse();
		t10.startCourse();
		t10.endCourse();
		t10.calculateDuration();
	}
}
