package comparable;

public class Employee implements Comparable<Employee>{
	
	int i = 0;
	public int compareTo(Employee e) {
//		return this.name.length() - e.name.length(); // sort according to length
		return this.name.compareTo(e.name);
		
	}
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + " " + name;
	}
	
}
