package onlyfunctionalinterfacesupplier;

public class StudentGenerator {
	private String name;
	private int marks;
	private String dept;
	public StudentGenerator(String name, int marks, String dept) {
		super();
		this.name = name;
		this.marks = marks;
		this.dept = dept;
	}
	
	
	
	public StudentGenerator() {}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "StudentGenerator [name=" + name + ", marks=" + marks + ", dept=" + dept + "]";
	}
	
	
	
	
}
