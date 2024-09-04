package com.savacc;

public class BankTest {
	public static void main(String[] args) throws InterruptedException {

		SavingAccount s1 = new SavingAccount(201, "Sima Gupta", 500);

		JobA j1 = new JobA(s1);

		JobB j2 = new JobB(s1);

		Thread t1 = new Thread(j2);
         
		j1.start();
		t1.start();
		
		j1.join();
		t1.join();

		System.out.println(s1.balance);
	}

}
