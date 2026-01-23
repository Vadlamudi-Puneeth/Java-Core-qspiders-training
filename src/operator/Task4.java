/*
 
 */
package operator;

public class Task4 {
	public static void main(String args[]) {
		int totalPurchase = 300;
		boolean isPremiumMember = true;
		boolean isFirstTimeCustomer = false;
		
		int discount = 200;
		
		boolean isEligibleForDiscount = (totalPurchase > 2000 && (isPremiumMember == true || isFirstTimeCustomer == false));
		
		int finalPrice = (isEligibleForDiscount == true) ? totalPurchase - discount: totalPurchase ;
		
		System.out.println(finalPrice);
		
		
	}
}
