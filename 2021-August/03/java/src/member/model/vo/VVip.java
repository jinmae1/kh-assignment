package member.model.vo;

public class VVip extends Member {

	private static float interest = 0.15f;

	public VVip() {

	}

	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}

	@Override
	public float getInterestPoint() {
		return this.getPoint() * interest;
	}

}