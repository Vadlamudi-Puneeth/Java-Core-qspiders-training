package practiseq3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FurnitureOrder {
	
	private Set<String> orderSet = new LinkedHashSet<>();

	public Set<String> getOrderSet() {
		return orderSet;
	}

	public void setOrderSet(Set<String> orderSet) {
		this.orderSet = orderSet;
	}
	
	public void addOrderDetails(String furnitureDetails) {
		if(furnitureDetails != null) {
			orderSet.add(furnitureDetails);
		}
	}
	
	public int findCountOfCustomersBasedOnTheFurniture(String furniture){
		int count = 0;
		boolean flag = false;
		for(String s: orderSet) {

			String arr[] = s.split(":");
			String customerName = arr[0];
			String furnitureName = arr[1];
			
			if(furnitureName.equalsIgnoreCase(furniture)) {
				count+=1;
				flag = true;
			}
			
		}
		
		if(flag)
			return count;
		else
			return 1;
	}
	
	public List<String> getCustomerNamesByFurniture(String furniture)  {
		
		List<String> list = new ArrayList<>();
		
		for(String s: orderSet) {
			String arr[] = s.split(":");
			String customerName = arr[0];
			String furnitureName = arr[1];
			
			if(furnitureName.equalsIgnoreCase(furniture)) {
				list.add(customerName);
			}
		}
		return list;
	}
	
	public String getFurnitureByCustomerName(String customerName) {
		for(String s: orderSet) {
			String arr[] = s.split(":");
			String customerName1 = arr[0];
			String furnitureName = arr[1];
			
			if(customerName1.equalsIgnoreCase(customerName)) {
				return furnitureName;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		FurnitureOrder fo = new FurnitureOrder();
		for(int i = 0;i < n; i++) {
			fo.addOrderDetails(sc.nextLine());
		}
		
		System.out.println("count");
		System.out.println(fo.findCountOfCustomersBasedOnTheFurniture(sc.nextLine()));
		
		System.out.println("names");
		List<String> list = fo.getCustomerNamesByFurniture(sc.nextLine());
		for(String s: list) {
			System.out.println(s);
		}
		
		System.out.println(fo.getFurnitureByCustomerName(sc.nextLine()));
		
		
	}
	
}
