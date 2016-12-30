package com.abhi.mutithreading;

public class CallingThread2 extends Thread{
	SynchronizedMethod s;
	public CallingThread2(SynchronizedMethod s) {
		this.s = s;
	}
	
	public void run(){
		s.printTable(100);
	}
}
