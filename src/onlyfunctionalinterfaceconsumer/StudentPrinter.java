package onlyfunctionalinterfaceconsumer;

public class StudentPrinter {
	String name;
	int marks;
	String dept;
	public StudentPrinter(String name, int marks, String dept) {
		super();
		this.name = name;
		this.marks = marks;
		this.dept = dept;
	}
	
	
	
	public StudentPrinter() {}



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
		return "StudentPrinter [name=" + name + ", marks=" + marks + ", dept=" + dept + "]";
	}
	
	
	
	
}
