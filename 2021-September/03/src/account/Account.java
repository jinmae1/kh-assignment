package account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;

	public Account() {
	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return this.balance * this.interestRate / 100;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}

	public void accountinfo() {
		System.out.print("계좌번호: " + this.account + " ");
		System.out.print("잔액: " + this.balance + "원");
		System.out.print("이자율: " + this.interestRate + "%");
	}

}