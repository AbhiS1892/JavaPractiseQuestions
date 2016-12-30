package com.abhi.mutithreading;

public class SynchronizedMethod {
	synchronized void printTable(int number){
		for (int i = 1; i <= 5; i++) {
			System.out.println(number*i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			
		}
	}
}
