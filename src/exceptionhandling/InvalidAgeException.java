package exceptionhandling;

public class InvalidAgeException extends Throwable{
	public InvalidAgeException(String msg){
		super(msg);
	}
}
