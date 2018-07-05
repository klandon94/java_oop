package com.javaoop.advanced.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount kenny = new BankAccount();
		BankAccount davis = new BankAccount();
		kenny.depositChecking(420.81);
		kenny.depositSavings(1230.43);
		kenny.totalInAccts();
		davis.depositChecking(350.92);
		davis.withdrawChecking(300);
		System.out.println(davis.getCheckingBalance());
		System.out.println(BankAccount.getNumAccounts());
		System.out.println(BankAccount.getTotalMoney());
		
	}
}
