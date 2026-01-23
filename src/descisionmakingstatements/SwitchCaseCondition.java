package descisionmakingstatements;

import java.util.Scanner;
//
//public class SwitchCaseCondition {
//	public static void main(String args[]) {
//		
//	Scanner sc = new Scanner(System.in);
//	
//	String input = sc.nextLine();
//	
//	switch(input){
//		case "Mon":{
//			System.out.println("Dosa");
//		} break;
//		case "Tue":{
//			System.out.println("Idly");
//		} break;
//		case "Wed":{
//			System.out.println("Paratha");
//		}break;
//		case "Thu":{
//			System.out.println("Paneer Bhurji");
//		}break;
//		case "Fri":{
//			System.out.println("Sandwhich");
//		}break;
//		case "Sat":{
//			System.out.println("Aloo Paratha");
//		}break;
//		case "Sun":{
//			System.out.println("Gobhi Paratha");
//		}
//	}
//}
//	
//}




public class SwitchCaseCondition {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 1: {
			System.out.println("Jan");
		}
		case 2: {
			System.out.println("Feb");
		}
		case 3: {
			System.out.println("Mar");
		}
		case 4:{
			System.out.println("Apr");
		}
		case 5:{
			System.out.println("May");
		}
		case 6:{
			System.out.println("June");
		}
		case 7:{
			System.out.println("Jul");
		}
		case 8:{
			System.out.println("Aug");
		}
		case 9:{
			System.out.println("Sep");
		}
		case 10:{
			System.out.println("Oct");
		}
		case 11:{
			System.out.println("Nov");
		}
		case 12:{
			System.out.println("Dec");
		}break;
		default:{
			System.out.println("Invalid");
		}
		
		}
		
	}
}



















