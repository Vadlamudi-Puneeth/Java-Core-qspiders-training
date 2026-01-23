package exceptionhandling;

public class Task3Product {
	static int CurrentQuantity = 5;
	
	public static void main(String[] args) {
		try{
			checkQuantity(5);
		}catch(Task3OutOfStockException t3) {
			System.out.println(t3.getMessage());
		}
	}
	
	public static void checkQuantity(int quantity) throws Task3OutOfStockException{
		if(CurrentQuantity > quantity) {
			System.out.println("there is quantity avaiable");
		}else {
			throw new Task3OutOfStockException("No avaialable quantity");
		}
	}
	
}
