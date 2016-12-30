package com.abhi.basic;

public class fibonacci_recursion {
	static int n1=0, n2=1, n3=0;
	
	static int fibonacci(int n){
        if (n == 1) { 
            return 1; 
        } 
        if (n == 2) { 
            return 1; 
        } 
        
        return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		int n=5;
		fibonacci(n);

	}

}
