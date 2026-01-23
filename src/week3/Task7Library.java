package week3;

public class Task7Library {
	private int books;
	private Task7Book book;
	
	Task7Library(int books){
		this.books = books;
	}

	public int getBooks() {
		return books;
	}

	public void setBooks(int books) {
		this.books = books;
	}
	
	public void createObj() {
		book = new Task7Book(2000);
	}
	
	public void showDetails() {
		System.out.println(books);
		System.out.println(book.getPrice());
	}
	
}
