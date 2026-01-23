package comparator;
import java.util.*;

public class TrainerDriver {
	public static void main(String[] args) {
		
		ArrayList<Trainer> arr = new ArrayList<>();
		
		arr.add(new Trainer(122, "nani", "tel"));
		arr.add(new Trainer(122, "puneeth", "hindi"));
		arr.add(new Trainer(112, "siva", "eng"));
		arr.add(new Trainer(102, "mohan", "maths"));
		arr.add(new Trainer(103, "naman", "ps"));
		
		for(Trainer t: arr) {
			System.out.println(t);
		}
		
		System.out.println("\nafter sort");
		
		Collections.sort(arr,new SortById());
		
		for(Trainer t: arr) {
			System.out.println(t);
		}
		
//		System.out.println();
//		
//		Collections.sort(arr,new SortByName());
//		for(Trainer t: arr) {
//			System.out.println(t);
//		}
		
	}
}
