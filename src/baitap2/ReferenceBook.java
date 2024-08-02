package baitap2;

public class ReferenceBook extends Book {
	private String field;

	public ReferenceBook() {
	}

	public ReferenceBook(String title, String author, String isbn, String field) {
		super(title, author, isbn);
		this.setField(field);
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.printf("%-15s: %s%n", "Field", this.getField());
	}
}
