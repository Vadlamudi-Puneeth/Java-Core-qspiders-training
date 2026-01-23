package inheritance;

public class Task14Student extends Task14Person{
	int rollNo;
	Task14Student(String name, int age, int rollNo){
		super(name, age);
		this.rollNo = rollNo;
	}
	
	public void display() {
		super.display();
		System.out.println(rollNo);
	}
}
