package com.abhi.mutithreading;

public class TestStaticSynchronization {

	public static void main(String[] args) {
		Thread t1=new Thread(){
			public void run(){
				StaticSynchronization.printTable(1);
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				StaticSynchronization.printTable(5);
			}
		};
		
		Thread t3=new Thread(){
			public void run(){
				StaticSynchronization.printTable(10);
			}
		};
		
		Thread t4=new Thread(){
			public void run(){
				StaticSynchronization.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
