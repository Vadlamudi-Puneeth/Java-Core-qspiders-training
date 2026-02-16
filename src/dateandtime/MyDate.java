package dateandtime;
import java.time.LocalDate;

public class MyDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate tomorrow = date.plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate yesterday = date.minusDays(1);
		System.out.println(yesterday);
		
		LocalDate leap = LocalDate.of(2016, 01, 05);
		System.out.println(leap.isLeapYear());
		
	}
}
