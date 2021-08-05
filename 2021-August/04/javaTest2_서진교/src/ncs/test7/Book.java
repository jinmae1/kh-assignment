package ncs.test7;

public class Book {

	private String category;
	private String bookName;
	private double bookPrice;
	private double DiscountRate;

	public Book() {
	}

	public Book(String category, String bookName, double bookPrice, double DiscountRate) {
		this.category = category;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.DiscountRate = DiscountRate;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return this.bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getDiscountRate() {
		return this.DiscountRate;
	}

	public void setDiscountRate(double DiscountRate) {
		this.DiscountRate = DiscountRate;
	}

}
