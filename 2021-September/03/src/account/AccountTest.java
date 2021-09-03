package account;

public class AccountTest {

	public static void main(String[] args) {
		Account account;
		account = new Account("441-0290-1203", 500000, 7.3f);
		System.out.print("계좌: " + account.getAccount());
		System.out.println("\t현재잔액: " + account.getBalance());

		account.deposit(20000);
		System.out.print("계좌: " + account.getAccount());
		System.out.println("\t현재잔액: " + account.getBalance());

		System.out.printf("이자: %.1f\n", account.calculateInterest());

	}
}