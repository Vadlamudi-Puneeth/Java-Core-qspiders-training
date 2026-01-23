package abstraction;

public class Task10OnlineCourse extends Task10Course{

	@Override
	public void startCourse() {
		System.out.println("started");
	}
	
	@Override
	public void calculateDuration() {
		System.out.println("20min");
	}
	
	@Override
	public void endCourse() {
		System.out.println("end");
	}
	
}
