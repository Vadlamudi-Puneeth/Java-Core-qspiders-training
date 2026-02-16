package functionalinterfacepredicate;
import java.util.function.Predicate;

public class PredicateRealLifeExample {

	public static void main(String[] args) {
		String emp[] = {"Rony", "Bruce", "Helen", "vidven", "georgia"};
		
		Predicate<String> pi = (str) -> (str.length() > 5);
		for(String e: emp) {
			if(pi.test(e)) {
				System.out.println(e);
			}
		}
	}
}
