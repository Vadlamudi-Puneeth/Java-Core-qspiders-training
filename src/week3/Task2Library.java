package week3;

public class Task2Library {
	Task2Book[] book = new Task2Book[3];
	
	int i = 0;
	public void addBook(Task2Book b) {
		if (i < book.length)
			book[i++] = b;
	}
	
	Task2Book[] getBook() {
		return book;
	}
	
	
	
	
}
