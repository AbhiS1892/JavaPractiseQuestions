package com.abhi.mutithreading;

public class ThreadEX2 implements Runnable{



	public static void main(String[] args) {
		ThreadEX2 t2 = new ThreadEX2();
		Thread t3 = new Thread(t2);
		t3.start();

	}

	@Override
	public void run() {
		
		System.out.println("thread is running");
		
	}




}

