package hasarelationlazyinstantiation;

public class Library {
	private Book[] book = new Book[3];
	
	int i = 0;
	
	void addBook(Book b) {
		if(i < book.length)
			book[i++] = b;
	}
	
	Book[] getBook() {
		return book;
	}
	
}
