package nonprimitivetypecasting;

public class Employee extends Person{
	int eid;
	String role;
	
	Employee(String name, String address,int eid,String role){
		super(name, address);
		this.role = role;
		this.eid = eid;
	}
	
}
