package baitap2;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String userId;
	private List<Book> borrowedBooks;

	public User() {
		this.borrowedBooks = new ArrayList<Book>();
	}

	public User(String name, String userId) {
		this.setName(name);
		this.setUserId(userId);
		this.borrowedBooks = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void borrow(Book book) {
		this.borrowedBooks.add(book);
		System.out.println(this.name + " đã mượn " + book.getTitle());
	}

	public void returnBook(Book book) {
		if (this.borrowedBooks.remove(book)) {
			System.out.println(this.name + " đã trả " + book.getTitle());
		} else {
			System.out.println(this.name + " không mượn " + book.getTitle());
		}
	}

	public void displayInfo() {
		System.out.println("---- User info ----");
		System.out.printf("%-15s: %s%n", "Name", this.getName());
		System.out.printf("%-15s: %s%n", "UserId", this.getUserId());
		if (this.borrowedBooks.size() > 0) {
			System.out.printf("%-15s: %s", "Sách đã mượn", "");
			for (Book book : this.borrowedBooks) {
				System.out.printf(book.getTitle() + " + ");
			}
			System.out.printf("%n");
		} else {
			System.out.printf("%-15s: %s%n", "Sách đã mượn", "không có");
		}
	}

}
