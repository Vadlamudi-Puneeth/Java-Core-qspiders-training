package dateandtime;

import java.time.OffsetTime;

public class JavaOffsetTime {
	public static void main(String[] args) {
		OffsetTime off = OffsetTime.now();
		
		int h = off.getHour();
		System.out.println(h);
		
		int m = off.getMinute();
		System.out.println(m);
		
		int s = off.getSecond();
		System.out.println(s);
		
	}
}
