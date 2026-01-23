package arrays;
import java.util.*;

public class Task22 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int bookId[] = new int[size];
		int id = sc.nextInt();
		
		for(int i = 0;i < size; i++) {
			bookId[i++] = sc.nextInt();
		}
		
		for(int i = 0;i < size; i++) {
			if(bookId[i++] == id) {
				System.out.println("found");
			}
		}
		
	}
}
