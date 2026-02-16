package practise;

public class BookMain {
	public static void main(String[] args) {
		Book b = new Book("122", "dfsd", 2);
		
		String[] names = {"Amit", "Neha", "Amit", "Rohit"};
		
		for(String s: names) {
			try {
				b.borrowBook(s);
				System.out.println(s + " borrowed successfully.");
			}catch(DuplicateBorrowException dle) {
				System.out.println(dle.getMessage());
			}catch(BookUnavailableException  bue) {
				System.out.println(bue.getMessage());
			}
		}
		
	}
}
