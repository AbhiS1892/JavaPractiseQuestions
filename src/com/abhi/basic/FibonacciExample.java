package com.abhi.basic;

import java.io.IOException;

public class FibonacciExample {

	static void fibonacci(int limit){
		int n1=0,n2=1,n3=0;

		System.out.print(n1+" "+n2);

		for(int i=2;i<limit;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);

		}
	}

	public static void main(String[] args) throws IOException {
		int limit=10;
		fibonacci(limit);

	}
}

	
