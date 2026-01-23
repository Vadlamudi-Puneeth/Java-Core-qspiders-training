package encapsulation;

public class Student {
	
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	public static void main(String args[]) {
		Student s = new Student(1,"nani");	
		accept(s);
	}
	
	public static void accept(Student s1) {
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
	
}
