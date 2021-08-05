package member.model.vo;

public class Silver extends Member {

	private static float interest = 0.02f;

	public Silver() {

	}

	public Silver(String name, String grade, int point) {
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
