package oopfundamentals;

public class Student {
	
	int id;
	
	Student(int id){
//		this.id = id;
		id=id;
		System.out.println(id);
}
	
	public static void main(String args[]) {
		Student s = new Student(101);
//		System.out.println(s.id);
	}

}

