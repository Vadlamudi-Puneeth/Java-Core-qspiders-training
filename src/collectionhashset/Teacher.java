package collectionhashset;

public class Teacher implements Comparable<Teacher>{
	int id;
	String name;
	double salary;
	
	@Override
	public int compareTo(Teacher t) {
		return this.id - t.id;
	}
	
	Teacher(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return id + " " + name + " " + salary;
	}
	
}
