package objectclass;

final class Student extends Object{
	int sId;
	final String name;
	
	Student(int sId, String name){
		this.sId = sId;
		this.name = name;
	}
	
	public String toString() {
		return name + " " + sId;
	}
	
	public boolean equals(Object o) { 
//		Object o = s; //implicit upcasting
		Student s1 = (Student)o; // downcast
		return this.sId == s1.sId  &&  this.name == s1.name;
	}
	
	public int hashCode() {
//		System.out.println(name.hashCode());
		return sId+name.hashCode();
	}
	
}
