package com.savacc;

public class JobA extends Thread {

	SavingAccount sa;

	public JobA(SavingAccount sa) {
		super();
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			sa.withdraw(5);

		}
	}

}
