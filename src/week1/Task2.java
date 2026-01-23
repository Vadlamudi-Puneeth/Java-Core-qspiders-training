package week1;

public class Task2 {
	public static void main(String args[]) {
		int cart_value = 2000;
		double discount = 0.2;
		
		boolean isPremiumMember = true;
		
		double final_amount = 0.0;
		final_amount = (cart_value > 3000 || isPremiumMember) ? (cart_value - (discount * cart_value)): (cart_value);
		
		System.out.println(final_amount);
		
		String appled_or_not = (cart_value == final_amount)? "No Discount Applied": "Discount Applied";
		
		System.out.println(appled_or_not);   
		
	}
}
