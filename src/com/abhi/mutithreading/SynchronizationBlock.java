package com.abhi.mutithreading;

public class SynchronizationBlock {
	void printTable(int number){
		synchronized (this) {
			for (int i = 1; i <=5; i++) {
				System.out.println(number*i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}

}
