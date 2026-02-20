package onlyfunctionalinterfaceconsumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ProductUtil {
	public Consumer<Product> applyDiscount(double percent){
		Consumer<Product> co = p -> p.setPrice(p.getPrice() - p.getPrice() * percent/100);
		return co;
	}	
	
	public void processProducts(Stream<Product> products, Consumer<Product> c) {		
		products.forEach(c);
	}
	
	
	public Consumer<Product> printUpperCase(){
		return c -> c.setName(c.getName().toUpperCase());
	}
	
}
