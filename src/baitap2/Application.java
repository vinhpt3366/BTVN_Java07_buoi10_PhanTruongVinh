package baitap2;

public class Application {
	public static void main(String[] args) {

		ReferenceBook referenceBook = new ReferenceBook();
		referenceBook.setTitle("ReferenceBook 1");
		referenceBook.setAuthor("Author 1");
		referenceBook.setIsbn("ISBN001");
		referenceBook.setField("Field 1");
		referenceBook.displayInfo();

		TextBook textBook = new TextBook("TextBook 1", "Author 1", "ISBN101", "Subject 1");
		textBook.displayInfo();

		User user = new User();
		user.setName("Tran Van Ti");
		user.setUserId("U124124");
		user.displayInfo();

		user.borrow(textBook);
		user.borrow(referenceBook);
		user.displayInfo();

		user.returnBook(textBook);
		user.displayInfo();
	}
}
