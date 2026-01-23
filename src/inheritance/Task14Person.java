package inheritance;

public class Task14Person {
	String name;
	int age;
	
	Task14Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
