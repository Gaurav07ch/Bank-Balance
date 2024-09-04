package com.savacc;

public class SavingAccount {

	int acno;
	String name;
	double balance;

	public synchronized void Deposit(int amt) {
		balance = balance + amt;
	}

	public synchronized void withdraw(int amt) {
		balance = balance - amt;
	}

	public SavingAccount() {
		super();
	}

	public SavingAccount(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}

}
