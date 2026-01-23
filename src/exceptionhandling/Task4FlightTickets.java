package exceptionhandling;

public class Task4FlightTickets {
	static int AvailSeats = 100;
	
	public static void main(String[] args) {
		try{
			checkSeats(101);
		}catch(Task4SeatUnavaiableException t4) {
			System.out.println(t4.getMessage());
		}
	}
	
	public static void checkSeats(int request_seats) throws Task4SeatUnavaiableException{
		if(request_seats > AvailSeats) {
			throw new Task4SeatUnavaiableException("There are no seats vacant");
		}else {
			System.out.println("seats are still vacant");
		}
	}
	
}
