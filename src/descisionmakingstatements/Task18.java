package descisionmakingstatements;
import java.util.*;

public class Task18 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		switch(a){
		case "Mon":{
			System.out.println("Breakfast is : Dosa, 100rs");
		} break;
		case "Tue":{
			System.out.println("Breakfast is : Idly, 100rs");
		} break;
		case "Wed":{
			System.out.println("Breakfast is : Paratha, 100rs");
		}break;
		case "Thu":{
			System.out.println("Breakfast is : Paneer Bhurji, 100rs");
		}break;
		case "Fri":{
			System.out.println("Breakfast is : Sandwhich, 100rs");
		}break;
		case "Sat":{
			System.out.println("Breakfast is : Aloo Paratha, 100rs");
		}break;
		case "Sun":{
			System.out.println("Breakfast is : Gobhi Paratha, 100rs");
		}
		}
	}
}
