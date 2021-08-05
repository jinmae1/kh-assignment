package ncs.test8;

import ncs.test7.Book;

public class BookStore {
	public static void main(String[] args) {

		Book bookData;
		BookUpdater bookUpdater;

		bookData = new Book("IT", "HTML5", 30000, 15);

		System.out.printf("기본정보%n%s\t%.1f%n", bookData.getBookName(), bookData.getBookPrice());

		bookUpdater = new BookUpdater(bookData);

		bookUpdater.updateBookPrice();

		System.out.printf("변경된 정보%n%s\t%.1f%n", bookData.getBookName(), bookData.getBookPrice());
		// System.out.printf("변경된 정보%n%s\t%.1f%n",
		// bookUpdater.getBookData().getBookName(),
		// bookUpdater.getBookData().getBookPrice());
	}
}
