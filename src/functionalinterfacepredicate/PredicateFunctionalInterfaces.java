package functionalinterfacepredicate;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaces {
	public static void main(String[] args) {
		// predicate interface test method is used to check the condition and returns the boolean value
		Predicate<Integer> pi = (age) -> (age > 18);
//		boolean res = pi.test(15);
//		System.out.println(res);
		
//		and method is used as logical AND 
//		Predicate<Integer> pi1 = (i1) -> (i1 > 10);
//		Predicate<Integer> pi2 = (i2) -> (i2 < 20);
//		Predicate<Integer> pi3 = (i3) -> (i3 == 19);
//		
//		Predicate<Integer> pi1andpi2 = pi1.and(pi2);
//		Predicate<Integer> pi1pi2andpi3 = pi1andpi2.and(pi3);
//		boolean res = pi1pi2andpi3.test(19);
//		System.out.println(res);
		
//		negate() is used to logical negation of the predicate
//		Predicate<Integer> pi1 = (i) -> (i > 100);
//		Predicate<Integer> negation = pi1.negate();
		
		// negate() method will change the condition reverse like i < 100
//		boolean res = negation.test(90);
//		System.out.println(res);
		
		// The equals() method in Predicate is inherited from Object and checks reference equality, not logical equivalence of predicate conditions.
//		Predicate<Integer> p1 = i -> i > 10;
//		Predicate<Integer> p2 = i -> i > 10;
//		Predicate<Integer> p3 = p1;
//
//		System.out.println(p1.equals(p2)); // false
//		System.out.println(p1.equals(p3)); // true

		
		
		
	}
}
