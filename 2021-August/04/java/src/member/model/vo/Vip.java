package member.model.vo;

public class Vip extends Member implements Buyable {

	private static float interest = 0.10f;

	public Vip() {

	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}

	@Override
	public float getInterestPoint() {
		return this.getPoint() * interest;
	}

	@Override
	public int buy(int price) {
		return (int) (price * (1 - interest));
	}
}