package inheritance;

public class Task6Person {
	private String name;
	private int age;
	
	Task6Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
