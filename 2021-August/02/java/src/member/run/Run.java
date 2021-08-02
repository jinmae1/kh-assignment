package member.run;

import java.util.Arrays;

import member.controller.MemberManager;
import member.model.vo.*;

public class Run {

	public static void main(String[] args) {

		MemberManager m = new MemberManager();
		m.memberInsert(new Silver("홍길동", "Silver", 1000));
		m.memberInsert(new Silver("김말똥", "Silver", 2000));
		m.memberInsert(new Silver("고길동", "Silver", 3000));

		m.memberInsert(new Gold("김회장", "Gold", 1000));
		m.memberInsert(new Gold("이회장", "Gold", 2000));
		m.memberInsert(new Gold("오회장", "Gold", 3000));

		m.memberInsert(new Vip("최순실", "Vip", 10000));
		m.memberInsert(new VVip("박근혜", "VVip", 100000));

		m.printData();

	}
}