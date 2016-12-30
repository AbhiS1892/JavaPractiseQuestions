package com.abhi.mutithreading;

public class JoinExample {
	static Object lock = new Object();
	//static Class<JoinExample> lock = JoinExample.class;

	public static void main(String[] args) {
		final int limit = 10;
		Thread t1 = new Thread() {
			public void run() {
				for (int itr = 1; itr < (limit+1); itr = itr + 2) {
					synchronized (lock) {
						System.out.println("ODD -> " + itr);
						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run() {

				for (int itr = 2; itr < (limit+1); itr = itr + 2) {
					synchronized (lock) {
						System.out.println("EVEN -> " + itr);
						try {
							lock.notify();
							if(itr==limit)
								break;
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		try {
			t1.start();
			t2.start();
			t1.start();
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}