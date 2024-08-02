package baitap2;

public class Book {
	private String title;
	private String author;
	protected String isbn;

	public Book() {
	}

	public Book(String title, String author, String isbn) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setIsbn(isbn);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void displayInfo() {
		System.out.println("---- Book info ----");
		System.out.printf("%-15s: %s%n", "Title", this.getTitle());
		System.out.printf("%-15s: %s%n", "Author", this.getAuthor());
		System.out.printf("%-15s: %s%n", "Isbn", this.getIsbn());
	}

}
