package dateandtime;
import java.time.*;
import java.time.temporal.*;

public class PeriodDem {
	public static void main(String[] args) {
		Period p = Period.ofDays(5);
		
		Temporal temp = p.addTo(LocalDate.now());
		System.out.println(temp);
		
		
		Period p1 = Period.of(2017, 5, 24);
		System.out.println(p1.toString());
		
		
		
	}
}
