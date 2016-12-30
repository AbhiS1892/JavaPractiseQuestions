package com.abhi.mutithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SharedResource {
	
	public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
 
        Thread producer1 = new Thread(new Producer(queue));
        Thread producer2 = new Thread(new Producer(queue));
        Thread producer3 = new Thread(new Producer(queue));
 
        Thread consumer1 = new Thread(new Consumer(queue));
        Thread consumer2 = new Thread(new Consumer(queue));
        Thread consumer3 = new Thread(new Consumer(queue));
 
        producer1.start();
        producer2.start();
        producer3.start();
 
        consumer1.start();
        consumer2.start();
        consumer3.start();
 
    }
}
