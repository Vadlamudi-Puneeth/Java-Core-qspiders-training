package inheritance;

public class Task1Student extends Task1Person{
	private int rollno;
	private int marks;
	
	Task1Student(int rollno, int marks,String name,int age){
		super(name, age);
		this.rollno = rollno;
		this.marks = marks;
	}
	
	void display() {
		super.displayPerson();
		System.out.println(rollno);
		System.out.println(marks);
	}
	
}
