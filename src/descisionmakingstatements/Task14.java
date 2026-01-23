package descisionmakingstatements;
import java.util.*;

public class Task14 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rate = sc.nextInt();
		
		switch(rate) {
			case 5: {
				System.out.println("30% hike");
			}	break;
			case 4: {
				System.out.println("20% hike");
			} break;
			case 3: {
				System.out.println("10% hike");
			}break;
			case 2: {
				System.out.println("No hike");
			}
			case 1: {
				System.out.println("No hike");
			}break;
			default:{
				System.out.println("Invalid");
			}
		}
		
	}
}
