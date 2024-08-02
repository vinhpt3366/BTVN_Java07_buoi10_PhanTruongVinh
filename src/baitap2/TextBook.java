package baitap2;

public class TextBook extends Book {
	private String subject;

	public TextBook() {
	}

	public TextBook(String title, String author, String isbn, String subject) {
		super(title, author, isbn);
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.printf("%-15s: %s%n", "Subject", this.getSubject());
	}
}
