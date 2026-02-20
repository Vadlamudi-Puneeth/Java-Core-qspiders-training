package practiseq3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ProductUtil {
	
	public Map<String, Product> getCostliestProductByCategory(Stream<Product> products){
//		Map<Object, Optional<Product>> map = products
//									.collect(Collectors.groupingBy(
//												p -> p.getCategory(),
//												Collectors.maxBy(new SortByPrice())
//											));
//		
//		Map<String, Product> ma = new LinkedHashMap<>();
//
//		for(Map.Entry<Object, Optional<Product>>m : map.entrySet()){
//			ma.put(m.getKey().toString(), m.getValue().orElse(null));
//		}
//		return ma;
		
		List<Product> list = products.toList();
		Map<String, Product> map = new LinkedHashMap<>();
		for(Product p: list) {
			String category = p.getCategory();
			if(!map.containsKey(category)) {
				map.put(category, p);
			}else {
				Product existing = map.get(category);
				if(p.getPrice() > existing.getPrice()) {
					map.put(category, p);
				}
			}
		}
		
		return map;
		
	}

	
	public Stream<Product> getLowStockProducts(List<Product> products, int limit){
		return products.stream().filter(p -> p.getQuantity() < limit);
	}
	
	public double getTotalInventoryValue(Stream<Product> products) {
		double sum = products.mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
		return sum;
	}
	
}
