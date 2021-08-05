package ncs.test7;

public class BookTest {

	public static void main(String[] args) {

		Book[] bookArray = new Book[5];
		double total = 0.0;

		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArray[3] = new Book("Novel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Novel", "cloven hoof", 50000, 15);

		for (Book book : bookArray) {
			System.out.printf("%s\t%s\t%.1f원  %.1f%%%n", book.getCategory(), book.getBookName(), book.getBookPrice(),
					book.getDiscountRate());
		}

		System.out.print("\n책 가격의 합: ");
		for (Book book : bookArray) {
			total += book.getBookPrice() * (100 - book.getDiscountRate()) / 100.0;
		}
		System.out.printf("%.1f원%n", total);
	}

}
