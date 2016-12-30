package com.abhi.mutithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPooling {
	public static void main(String[] args) {  
		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 5; i++) {  
			Runnable worker = new ThreadPooling("" + i);  
			executor.execute(worker); 
		}  

		executor.shutdown();  

		while (!executor.isTerminated()) {   }  

		System.out.println("Finished all threads");  
	} 

}
