package com.abhi.mutithreading;

public class CallingThread1 extends Thread{
	SynchronizedMethod s;
	public CallingThread1(SynchronizedMethod s) {
		this.s = s;
	}
	
	public void run(){
		s.printTable(5);
	}
}
