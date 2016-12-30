package com.abhi.mutithreading;

class ThreadPooling implements Runnable {  
	private String message;  
	
	public ThreadPooling(String s){  
		this.message=s;  
	}  
	
	public void run() {  
		System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);   
		System.out.println(Thread.currentThread().getName()+" (End)"); 
	}
} 
