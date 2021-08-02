package member.model.vo;

public class Member {

	private String name;
	private String grade;
	private int point;
	private static float interest;
	// ? How to inherit static fields?

	public Member() {
	}

	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public float getInterset() {
		return Member.interest;

	}

	public void setInterest(float interest) {
		Member.interest = interest;
	}

	public float getInterestPoint() {
		return point * interest;
	}

}