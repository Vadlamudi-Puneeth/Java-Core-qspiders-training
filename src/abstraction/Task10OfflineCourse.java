package abstraction;

public class Task10OfflineCourse extends Task10Course{
	@Override
	public void startCourse() {
		System.out.println("started");
	}
	
	@Override
	public void endCourse() {
		System.out.println("end");
	}
	
	@Override
	public void calculateDuration() {
		System.out.println("20 min");
	}
	
}
