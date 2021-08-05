package member.controller;

import member.model.vo.Member;

public class MemberManager {

	private static int pMember = 0;
	private static final int MAX_MEMBER = 40;

	private Member[] member = new Member[MAX_MEMBER];

	public void insertMember(Member member) {
		this.member[pMember++] = member;
	}

	public void printData() {
		System.out.println("---------------------------<<회원정보>>---------------------------");
		System.out.printf("%s\t\t%s\t\t%s\t\t%s%n", "이름", "등급", "포인트", "이자포인트");
		System.out.println("-----------------------------------------------------------------");

		for (int i = 0; i < pMember; i++) {
			System.out.println(this.formatData(this.member[i]));
		}
	}

	private String formatData(Member member) {
		return String.format("%s\t\t%s\t\t%d\t\t%.2f", member.getName(), member.getGrade(), member.getPoint(),
				member.getInterestPoint());
	}

	public void printBuyInfo(int price) {
		for (Member member : member) {
			if (member == null)
				break;
			System.out.printf("%s\t등급회원 %s은 %d원 상품을 %d원에 구매합니다.%n", member.getGrade(), member.getName(), price,
					member.buy(price));

		}
	}

}