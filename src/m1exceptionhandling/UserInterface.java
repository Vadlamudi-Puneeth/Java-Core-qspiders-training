package m1exceptionhandling;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		try {			
			System.out.println("Enter Name");
			String name = sc.nextLine();
			
			System.out.println("Enter Age");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Email");
			String email = sc.nextLine();
			
			System.out.println("Enter Credit Card Number");
			String creditCard = sc.nextLine();
			
			HotelBooking.validateUserDetails(age, email, creditCard);	
			
			System.out.println("Enter Hotel Name");
			String hotelName = sc.nextLine();
			
			System.out.println("Select Room Type below");
			System.out.println("Suite" + "\n" + "Deluxe" + "\n" + "Standard");
			String roomType = sc.nextLine();
			
			System.out.println("Enter Check-in Date (yyyy-MM-dd)");
			String checkInStr = sc.nextLine();
			
			System.out.println("Enter Check-out Date (yyyy-MM-dd");
			String checkOutStr = sc.nextLine();
			
			LocalDate checkInDate = null;
			LocalDate checkOutDate = null;
			
				try {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					
					checkInDate = LocalDate.parse(checkInStr, formatter);
					checkOutDate = LocalDate.parse(checkOutStr, formatter);
				}catch(Exception e) {
					throw new InvalidBookingDetailsException("Invalid date format");
				}
				
			HotelBooking.validateBookingDetails(hotelName, roomType, checkInDate,  checkOutDate);
			
			long numNights = ChronoUnit.DAYS.between(checkInDate, checkOutDate);

			System.out.println("Breakfast included? (true/false)");
			boolean breakfastIncluded = sc.nextBoolean();
			sc.nextLine();
			
			double cost = HotelBooking.calculateBookingCost(roomType, numNights, breakfastIncluded);
			System.out.println("Total Cost: " + cost);
			
		}catch(InvalidBookingDetailsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
}
