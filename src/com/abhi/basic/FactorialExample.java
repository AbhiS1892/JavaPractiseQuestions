package com.abhi.basic;

public class FactorialExample {
	
	static void factorial(int num){
		int fact=1;
		
		for(int i=num; i>0; i--){
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

	public static void main(String[] args) {
		int num = 4;
		factorial(num);
		
	}

}
