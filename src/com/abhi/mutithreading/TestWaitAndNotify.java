package com.abhi.mutithreading;

public class TestWaitAndNotify {

	public static void main(String[] args) {
		WaitAndNotify W1=new WaitAndNotify();
		
		new Thread(){
			public void run(){
				W1.withdraw(15000);
			}
		}.start();
		
		new Thread(){
			public void run(){
				W1.deposit(10000);
			}
		}.start();
	}

}
