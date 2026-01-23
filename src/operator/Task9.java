package operator;

public class Task9 {
	public static void main(String args[]) {
		int no_of_units_consumed = 350;
		boolean isCommercialCustomer = true;
		
		
		int ratePerUnit = (no_of_units_consumed >= 300 || isCommercialCustomer) ? 10: 5;
				
		int amount = no_of_units_consumed * ratePerUnit;
		
		int tax = 100;
		amount+=tax;
		System.out.println(amount);
		
	}
}
