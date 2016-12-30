package com.abhi.mutithreading;

public class ThreadEX1 extends Thread{
	
	public void run(){
		System.out.println("thread t1");
	}

	public static void main(String[] args) {
		ThreadEX1 t1 = new ThreadEX1();
		t1.start();

	}

}
