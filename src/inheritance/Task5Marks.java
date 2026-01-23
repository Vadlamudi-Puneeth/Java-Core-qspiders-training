package inheritance;

public class Task5Marks extends Task5Student{
	int []marks;
	double MyTotal = 0;
	Task5Marks(int []marks, int rollno, String name){
		super(rollno, name);
		this.marks = marks;
	}
	
	public void displayTotal() {
		for(int i: marks) {
			MyTotal += i;
		}
		System.out.println(MyTotal);
	}
	
	public void displayPercent() {
		int total = marks.length * 100;
		double percent = (MyTotal / (double)total) * 100;
		System.out.println(percent);
	}
	
	
}
