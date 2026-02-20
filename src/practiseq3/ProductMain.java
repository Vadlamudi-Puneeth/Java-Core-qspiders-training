package practiseq3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ProductMain {
	public static void main(String[] args) {
		ProductUtil pu = new ProductUtil();
		
		 List<Product> products = new ArrayList<>();

	        products.add(new Product("Laptop","Electronics",75000,5));
	        products.add(new Product("Mouse","Electronics",800,50));
	        products.add(new Product("Table","Furniture",12000,3));
	        products.add(new Product("Chair","Furniture",4000,20));
	        products.add(new Product("Mobile","Electronics",55000,2));
	        products.add(new Product("Bed","Furniture",30000,1));

		
		Map<String, Product> map = pu.getCostliestProductByCategory(products.stream());
		
		for(Map.Entry<String, Product>m: map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
//		Stream<Product> st =  pu.getLowStockProducts(products,4);
//		List<Product> li = st.toList();
		
		
		
//		System.out.println(li);
		
		
		System.out.println(pu.getTotalInventoryValue(products.stream()));
		
	}
}
