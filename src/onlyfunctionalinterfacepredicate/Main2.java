package onlyfunctionalinterfacepredicate;

import java.util.function.Predicate;

public class Main2 {
	
	public static void main(String[] args) {
		Predicate<Integer> p = isCheck(2020);
		System.out.println(p.test(2000));
	}
	
	public static Predicate<Integer> isCheck(int years) {
		Predicate<Integer> p = i -> i < 2000;
		return p;
	}
	
}
