package com.javaoop.advanced.bankaccount;
import java.util.Random;

public class BankAccount {
	private String acctNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numAccounts = 0;
	private static double totalMoney = 0;
	
	private String randomAcct() {
		Random r = new Random();
		String newStr = "";
		for (int i = 0; i < 10; i++) {
			newStr += r.nextInt(10);
		}
		return newStr;
	}
	
	public BankAccount() {
		acctNumber = randomAcct();
		numAccounts++;
	}
	
	public String getAcctnumber() {
		return acctNumber;
	}
	public void setAcctnumber(String acctnumber) {
		this.acctNumber = acctnumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public static int getNumAccounts() {
		System.out.println("Total number of accounts:");
		return numAccounts;
	}
	public static double getTotalMoney() {
		System.out.println("Total amount in circulation:");
		return totalMoney;
	}
	
	public void depositChecking(double amt) {
		checkingBalance += amt;
		totalMoney += amt;
	}
	
	public void depositSavings(double amt) {
		savingsBalance += amt;
		totalMoney += amt;
	}
	
	public void withdrawChecking(double amt) {
		if (getCheckingBalance() - amt < 0) System.out.println("Insufficient funds");
		else {
			checkingBalance -= amt;
			totalMoney -= amt;
		}
	}
	
	public void withdrawSavings(double amt) {
		if (getSavingsBalance() - amt < 0) System.out.println("Insufficient funds");
		else {
			savingsBalance -= amt;
			totalMoney -= amt;
		}
	}
	
	public void totalInAccts() {
		double total = savingsBalance + checkingBalance;
		System.out.println("Total in bank accounts: $" + total);
	}
	
}
