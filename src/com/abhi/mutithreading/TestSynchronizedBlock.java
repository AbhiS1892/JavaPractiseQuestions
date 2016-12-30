package com.abhi.mutithreading;

public class TestSynchronizedBlock {

	public static void main(String[] args) {
		SynchronizationBlock s = new SynchronizationBlock();
		
		Thread t1 = new Thread(){
			public void run(){
				s.printTable(5);
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				s.printTable(100);
			}
		};
		
		t1.start();
		t2.start();

	}

}
