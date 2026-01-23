package exceptionhandling;

public class Task1InsufficientBalanceException extends Throwable{
	Task1InsufficientBalanceException(String msg){
		super(msg);
	}
}
