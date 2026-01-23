package inheritance;

public class Task13Person {
	String name;
	int age;
	Task13Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(name + "\n"  + age);
	}
}
