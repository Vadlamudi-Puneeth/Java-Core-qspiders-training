package exceptionhandling;

public class Task3OutOfStockException extends Throwable{
	Task3OutOfStockException(String msg){
		super(msg);
	}
}
