package m1exceptionhandling;

public class InvalidBookingDetailsException extends Exception{
	InvalidBookingDetailsException(String msg){
		super(msg);
	}
}
