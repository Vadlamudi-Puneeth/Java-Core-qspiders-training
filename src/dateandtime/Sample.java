package dateandtime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Sample {
	public static void main(String[] args) {
		
		String str1 = "26-03-2001";
		String str2 = "27-04-2001";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date1 = LocalDate.parse(str1, formatter);
		LocalDate date2 = LocalDate.parse(str2, formatter);
		
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		System.out.println(daysBetween);
		
	}
}
