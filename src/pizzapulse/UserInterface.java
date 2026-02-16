package pizzapulse;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) throws InvalidPizzaOrderException{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String input[] = str.split(":");
		
		String id = input[0];
		String type = input[1];
		double basePrice = Double.parseDouble(input[2]);
		int quantity = Integer.valueOf(input[3]);
		
		PizzaUtil pu = new PizzaUtil();
		
		double price = 0;
		
		try {
			pu.validateOrderId(id);
			pu.validatePizzaType(type);
			pu.validateQuantity(quantity);
			price = pu.calculateFinalBill(type, basePrice, quantity);
		}catch(InvalidPizzaOrderException ipoe) {
			System.out.println(ipoe.getMessage());
		}
		
		if(price > 0)
			System.out.println(price);
	}
}
