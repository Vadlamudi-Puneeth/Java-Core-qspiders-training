package dateandtime;
import java.time.LocalTime;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime afterHours = time.plusHours(10);
		System.out.println(afterHours);
		
		LocalTime afterMinutes = time.plusMinutes(20);
		System.out.println(afterMinutes);
		
		LocalTime afterSeconds = time.plusSeconds(10);
		System.out.println(afterSeconds);
		
//		like that minutes before also there
		
	}
}
