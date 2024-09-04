package com.savacc;

public class JobB implements Runnable {

	SavingAccount sa;

	public JobB(SavingAccount sa) {
		super();
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			sa.Deposit(10);
		}

	}

}
