package dateandtime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	public static void main(String[] args) {
		
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println(dateAndTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String afterFormat = dateAndTime.format(formatter);
		System.out.println(afterFormat);
		
		System.out.println(dateAndTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println(dateAndTime.get(ChronoField.DAY_OF_WEEK));
		System.out.println(dateAndTime.get(ChronoField.DAY_OF_YEAR));
		
	}
}
