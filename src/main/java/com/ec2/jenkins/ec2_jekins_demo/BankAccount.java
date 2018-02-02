package com.ec2.jenkins.ec2_jekins_demo;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double debit(double amount) {
		if (balance < amount) {
			amount = balance;
		}

		balance -= amount;
		return amount;
	}

}
