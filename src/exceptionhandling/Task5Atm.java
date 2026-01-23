package exceptionhandling;

public class Task5Atm {
	
	static int balance = 100000;
	static int pin = 101010;
	static double atmContains = 10000;
	
	public static void main(String[] args) {
		try{
			withdrawCash(25000, 101010);
		}catch(Task5InsufficientBalance i) {
			System.out.println(i.getMessage());
		}catch(Task5InvalidPin ip) {
			System.out.println(ip.getMessage());
		}catch(Task5AtmOutOfCash ao) {
			System.out.println(ao.getMessage());
		}
	}
	
	public static void withdrawCash(double withdraw, int currentPin) throws Task5InsufficientBalance, Task5InvalidPin, Task5AtmOutOfCash{
		if(withdraw < balance && pin == currentPin && atmContains > withdraw) {
			System.out.println("you can withdraw amount");
		}else if(withdraw > balance) {
			throw new Task5InsufficientBalance("you are having less balance");
		}else if(pin != currentPin) {
			throw new Task5InvalidPin("You entered pin is wrong");
		}else if(withdraw > atmContains) {
			throw new Task5AtmOutOfCash("No cash in ATM");
		}
	}
	
}
