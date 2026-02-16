package functionalinterfacepredicate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductsFilterData {
	public static void main(String[] args) {
		List<Products> list = new ArrayList<>();
		list.add(new Products("P101", "Laptop", 65000.00));
		list.add(new Products("P102", "Smartphone", 25000.00));
		list.add(new Products("P103", "Headphones", 1999.99));
		list.add(new Products("P104", "Keyboard", 799.50));
		list.add(new Products("P105", "Mouse", 499.00));
		list.add(new Products("P106", "Smartwatch", 3499.00));
		list.add(new Products("P107", "Power Bank", 1299.00));
		
		Stream<Products> filteredList = list.stream().filter(x -> x.productPrice > 2000);
		filteredList.forEach(
					product -> System.out.println(product.productName + " " + product.productPrice)
				);
		
	}
}
