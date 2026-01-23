package descisionmakingstatements;
import java.util.Scanner;

public class IfElseCondition {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		if(input.equals("mon")) {
			System.out.println("Dosa");
		}else if(input.equals("tue")) {
			System.out.println("Idly");
		}else if(input.equals("wed")) {
				System.out.println("vada");
		}else if(input.equals("thu")) {
			System.out.println("vada");
		}
		else if(input.equals("fri")) {
			System.out.println("paranta");
		}
		else if(input.equals("sat")) {
			System.out.println("puri");
		}else  {
			System.out.println("sleep");
		}
		
	}
}
