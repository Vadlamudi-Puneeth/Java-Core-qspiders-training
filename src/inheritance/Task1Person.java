package inheritance;

public class Task1Person {
	private String name;
	private int age;
	
	Task1Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void displayPerson() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
