package onlyfunctionalinterfacepredicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ProductUtil {

	public List<Product> getFilteredProducts(Stream<Product> products, Predicate<Product> predicate){
		return products.filter(p ->	predicate.test(p)).toList();
	}
	
	public Predicate<Product> lowStock(int threshold){
		Predicate<Product> p = i -> i.getQuantity() < threshold;
		return p;
	}
	
	
	
	
	
}
