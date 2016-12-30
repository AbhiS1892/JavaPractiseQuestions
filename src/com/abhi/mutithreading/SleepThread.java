package com.abhi.mutithreading;

public class SleepThread extends Thread {

	public void run(){
		
		for(int i=1; i<5; i++){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		SleepThread st1 = new SleepThread();
		SleepThread st2 = new SleepThread();
		
		st1.start();
		st2.start();

	}

}
