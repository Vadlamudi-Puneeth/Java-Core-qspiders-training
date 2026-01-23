package methodchaining;

public class Task2 {
	private String name;
	private int age;
	private int class1;
	
	public Task2 setClass(int class1) {
		this.class1 = class1;
		return this;
	}

	
	public int getClass1() {
		return class1;
	}




	public String getName() {
		return name;
	}
	public Task2 setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Task2 setAge(int age) {
		this.age = age;
		return this;
	}
	
	
	
	
}
