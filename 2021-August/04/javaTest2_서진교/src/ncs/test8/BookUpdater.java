package ncs.test8;

import ncs.test7.Book;

public class BookUpdater {

	private Book bookData;

	public BookUpdater() {

	}

	public BookUpdater(Book bookData) {
		this.bookData = bookData;
	}

	public Book getBookData() {
		return bookData;
	}

	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}

	public void updateBookPrice() {
		bookData.setBookPrice(bookData.getBookPrice() * (100 - bookData.getDiscountRate()) / 100.0);
	}
}
