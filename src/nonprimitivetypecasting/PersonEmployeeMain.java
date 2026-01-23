package nonprimitivetypecasting;

public class PersonEmployeeMain {
	public static void meeain(String args[]) {
		
		Employee e = new Employee("Dingaa", "Hyderabad",101,"it");
		Person p = e; //upcasted scenario
		
		Employee e1 = (Employee)p; //downcasting 
		System.out.println(e1.name);
		System.out.println(e1.address);
		System.out.println(e1.role);
		System.out.println(e1.eid);
		
		System.out.println(p.name);
		System.out.println(p.address);
//		System.out.println(p.eid);

		
		
	}
}
