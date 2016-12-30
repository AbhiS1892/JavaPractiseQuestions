package com.abhi.mutithreading;

public class TestSynchronization {

	public static void main(String[] args) {
		SynchronizedMethod s1 = new SynchronizedMethod();
		Thread t1 = new Thread(new CallingThread1(s1));
		Thread t2 = new Thread(new CallingThread2(s1));
		
		t1.start();		
		t2.start();
	}

}
