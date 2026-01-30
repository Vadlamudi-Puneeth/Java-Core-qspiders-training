package m1exceptionhandling;
import java.time.*;

final public class HotelBooking {
	
	private static final String[] VALID_HOTELS = {"Taj", "Oberoi", "Hyatt", "Marriott", "ITC"};
	private static final String[] ROOM_TYPE = {"Suite", "Deluxe", "Standard"};
	
	public static void validateUserDetails(int age, String email, String creditCard) throws InvalidBookingDetailsException{
		
		if((age < 18 || age > 100)) {
			throw new InvalidBookingDetailsException("Invalid age");
		}
		
		if(!email.contains("@") || !email.contains(".") || (email.indexOf('@') != email.lastIndexOf('@')) ){
			throw new InvalidBookingDetailsException("Invalid email");
		}
		
		if(creditCard.length() != 16 || !creditCard.matches("\\d+")){
			throw new InvalidBookingDetailsException("Invalid credit card number");
		}

	}
	
	public static void validateBookingDetails(String hotelName, String roomType, LocalDate checkInDate, LocalDate checkOutDate) throws InvalidBookingDetailsException{
		
		if(!isValidate(hotelName)) {
			throw new InvalidBookingDetailsException("Invalid hotel name");
		}
		
		if(!roomTypeIsValid(roomType)) {
			throw new InvalidBookingDetailsException("Invalid room type");
		}
		
		if (checkInDate == null || checkOutDate == null) {
			throw new InvalidBookingDetailsException("Invalid date format");
		}
		
		if (!checkInDate.isAfter(LocalDate.now())) {
			throw new InvalidBookingDetailsException("Invalid check-in date");
		}

		if (!checkOutDate.isAfter(checkInDate)) {
			throw new InvalidBookingDetailsException("Invalid check-out date");
		}
	}
	
	public static boolean isValidate(String hotelName) {
		for(int i = 0;i < VALID_HOTELS.length; i++) {
			if(VALID_HOTELS[i].equals(hotelName)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean roomTypeIsValid(String roomType) {
		for(int i = 0;i < ROOM_TYPE.length; i++) {
			if(ROOM_TYPE[i].equals(roomType)) {
				return true;
			}
		}
		return false;
	}
	
	public static double calculateBookingCost(String roomType, long numNights, boolean breakfastIncluded) {

	    double perDay = 0;
	
	    if (roomType.equals("Standard")) perDay = 1000;
	    else if (roomType.equals("Deluxe")) perDay = 2000;
	    else if (roomType.equals("Suite")) perDay = 3000;
	
	    double total = perDay * numNights;
	
	    if (breakfastIncluded) {
	        total += 100 * numNights;
	    }
	
	    return total;
	}
	
}
