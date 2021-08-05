package member.model.vo;

public class Gold extends Member {

	private static float interest = 0.05f;

	public Gold() {

	}

	public Gold(String name, String grade, int point) {
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