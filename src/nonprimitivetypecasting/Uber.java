package nonprimitivetypecasting;

public class Uber {
	public static void main(String args[]) {
		int select = 1;
		
		System.out.println("click 1 for Mini");
		System.out.println("click 2 for Sedan");
		System.out.println("click 3 for Luxury");
		
		Uber u;
		switch(select) {
			case 1:{
				Mini m = new Mini();
				u = m;
				Mini m1 = (Mini)u; // down casting
				System.out.println(m1.price);
			}
			break;
			case 2:{
				Sedan s = new Sedan();
				u = s;
				Sedan s1 = (Sedan)u; // down casting
				System.out.println(s1.price);
			}
			break;
			case 3:{
				Luxury l = new Luxury();
				u = l;
				Luxury l1 = (Luxury)u; // down casting
				System.out.println(l1.price);
			}
			break;
			
			default:{
				System.out.println("Enter only 1 or 2 or 3");
			}
				
		}
		
	}
}
