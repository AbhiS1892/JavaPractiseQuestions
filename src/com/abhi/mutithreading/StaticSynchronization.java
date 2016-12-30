package com.abhi.mutithreading;

public class StaticSynchronization {
	synchronized static void printTable(int number){
		for (int i = 1; i <= 5; i++) {
			System.out.println(number*i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
