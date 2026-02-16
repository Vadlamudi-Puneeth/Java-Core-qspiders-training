package practise;
import java.util.*;

public class Book {
	String bookId;
	String title;
	int maxCopies;
	
	Book(String bookId, String title, int maxCopies){
		this.bookId = bookId;
		this.title = title;
		this.maxCopies = maxCopies;
	}
	
	List<String> borrowedBy = new ArrayList<>();
	
	public void borrowBook(String employeeName) throws DuplicateBorrowException, BookUnavailableException{
		
		if(borrowedBy.contains(employeeName)) {
			throw new DuplicateBorrowException("Cannot borrow: Employee has already borrowed this book.");
		}
		
		if(borrowedBy.size() >= maxCopies) {
			throw new BookUnavailableException("Cannot borrow: No copies available.");
		}
		
		borrowedBy.add(employeeName);
	}
	
}
