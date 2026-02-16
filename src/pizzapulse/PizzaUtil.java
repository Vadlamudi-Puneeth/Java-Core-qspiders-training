package pizzapulse;

public class PizzaUtil {
	
	private final String TYPES_OF_PIZZA[] = {"Margherita", "Pepperoni", "Veggie", "BBQ Chicken"};
	
	public boolean validateOrderId(String orderId) throws InvalidPizzaOrderException {
		if(!orderId.matches("PZ-[0-9]{3}")) {
			throw new InvalidPizzaOrderException("The " + orderId + " is invalid");
		}
		return true;
	}
	
	public boolean validatePizzaType(String pizzaType) throws InvalidPizzaOrderException{
		for(int i = 0; i < TYPES_OF_PIZZA.length; i++) {
			if(TYPES_OF_PIZZA[i].equals(pizzaType)) {
				return true;
			}
		}
		throw new InvalidPizzaOrderException("The pizza type " + pizzaType  + " is invalid");
	}
	
	public boolean validateQuantity(int quantity) throws InvalidPizzaOrderException{
		if(quantity < 0 || quantity > 50) {
			throw new InvalidPizzaOrderException("The quantity " + quantity + " is invalid");
		}
		return true;
	}
	
	public double calculateFinalBill(String pizzaType, double basePrice, int quantity) throws InvalidPizzaOrderException {
		
		if(basePrice < 200) {
			throw new InvalidPizzaOrderException("Invalid base price for " + pizzaType);
		}
		
		double baseCost = basePrice * quantity;
		double toppingPercent = 0;
		
		if(pizzaType.equals("Margherita")) {
			toppingPercent = 10;
		}else if(pizzaType.equals("Pepperoni")) {
			toppingPercent = 20;
		}else if(pizzaType.equals("Veggie")) {
			toppingPercent = 15;
		}else if(pizzaType.equals("BBQ Chicken")) {
			toppingPercent = 25;
		}
		
		double toppingCharge = (baseCost * toppingPercent) / 100;
		final double deliveryFee = 100;
		double finalBill = baseCost + toppingCharge + deliveryFee;
		
		
		return finalBill;
	}
	
	
	
}
