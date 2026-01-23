package collectionarraylist;
import java.util.ArrayList;
import java.util.*;

public class Sample4 {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(101, "nani"));
		a.add(new Student(102, "puneeth"));
		a.add(new Student(103, "pavan"));
		
		System.out.println(a);
		System.out.println("_________________________________________________________\n");
		
//		System.out.println(a.get(1).getId());
		
		
		Scanner sc = new Scanner(System.in);
		
		int search = sc.nextInt();
		boolean found = false;
		
//		for(int i = 0;i < a.size(); i++) {
//			if(a.get(i).getId() == search) {
//				flag = true;
//			}
//		}
		
		ListIterator<Student> i = a.listIterator();
		
		while(i.hasNext()) {
//			Student curr = (Student)i.next(); // if not generic then downcast to use student
			if(i.next().getId() == search) {
				found = true;
				System.out.println(i.previous().getName());
				break;
			}
		}
		
		
		System.out.println(found);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList a1 = new ArrayList();
//		a1.add(10);
//		a1.add("hai");
//		a1.add(23);
//		a1.add(10);
//		
////		System.out.println(a1.contains(10));
////		System.out.println(a1.indexOf(10));
////		System.out.println(a1.lastIndexOf(10));
////		System.out.println(a1.get(1));
////		a1.set(2, 33);
////		System.out.println(a1);
		
	}
}
