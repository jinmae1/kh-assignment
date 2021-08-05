package ncs.test3;

public class Tv implements Comparable<Tv> {

	private String name;
	private int price;
	private String description;

	public Tv() {
	}

	public Tv(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("%-10s%d %s", name, price, description);
	}

	@Override
	public int compareTo(Tv obj) {
		if (this.price == obj.price)
			return 0;
		else if (this.price < obj.price)
			return -1;
		else
			return 1;
	}

}
