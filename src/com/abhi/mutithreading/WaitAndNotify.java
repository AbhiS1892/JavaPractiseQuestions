package com.abhi.mutithreading;

public class WaitAndNotify {
	
	int amount=10000;
	
	synchronized void withdraw(int amount){
		System.out.println("Withdrawing Money");
		
		if(this.amount < amount){
			System.out.println("Less money");
			try {
				wait();
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		this.amount-=amount;
		System.out.println("Money Withdrawn");
	}
	
	synchronized void deposit(int amount){
		System.out.println("Depositing Money");
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		this.amount+=amount;
		System.out.println("Money Deposited");
		notify();
	}

}
