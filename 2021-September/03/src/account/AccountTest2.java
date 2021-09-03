package account;

public class AccountTest2 {
	public static void main(String[] args) {
		Account[] account = new Account[5];

		for (int i = 0; i < account.length; i++) {
			account[i] = new Account("221-0101-211" + (i + 1), 100000, 4.5);
			account[i].accountinfo();
			System.out.println();
		}

		System.out.println();
		for (Account acc : account) {
			acc.setInterestRate(3.7);
			acc.accountinfo();
			System.out.printf(" 이자: %.0f원\n", acc.calculateInterest());
		}
	}

}