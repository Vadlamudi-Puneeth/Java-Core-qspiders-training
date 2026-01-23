package inheritance;

public class Student extends Person{
	int StudentId;
	
	Student(String name, int StudentId){
		super(name);
		this.StudentId = StudentId;
	}
	
	Student(){
		
	}
	
	public static void main(String args[]) {
		Student s = new Student("Nani", 10);
		System.out.println(s.name);
		System.out.println(s.StudentId);
	}
	
}
