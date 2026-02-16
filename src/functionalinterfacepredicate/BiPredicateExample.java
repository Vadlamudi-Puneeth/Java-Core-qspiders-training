package functionalinterfacepredicate;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bi = (a, b) -> {
			if((a+b) % 2 == 0) {
				return true;
			}
			return false;
		};
		
		System.out.println(bi.test(10, 20));
		
	}
}
