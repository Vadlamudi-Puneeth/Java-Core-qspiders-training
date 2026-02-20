package onlyfunctionalinterfaceconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProductMain {
	public static void main(String[] args) {
		ProductUtil pu = new ProductUtil();
		Consumer<Product> co = pu.applyDiscount(10.0);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("nani", 10000, 3));
		list.add(new Product("puneeth", 20000, 4));
		pu.processProducts(list.stream(), co);
		pu.processProducts(list.stream(), System.out::println);
		
		Consumer<Product> upper = pu.printUpperCase();
		pu.processProducts(list.stream(), upper);
		pu.processProducts(list.stream(), System.out::println);
		
		
	}
}
