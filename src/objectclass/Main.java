package objectclass;

public class Main {

	
	public static void main(String args[]) {
		Student s1 = new Student(101, "nani");

		Student s2 = new Student(101, "nani");
//		System.out.println(s1.equals(s2));
		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1.hashCode() == s2.hashCode());
		
		System.out.println(s1.getClass());
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass().getCanonicalName());
		System.out.println(s1.getClass().getModifiers());
		System.out.println(s1.getClass().getSimpleName());
		

	}
}
