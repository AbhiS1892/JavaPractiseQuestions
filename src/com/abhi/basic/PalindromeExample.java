package com.abhi.basic;

public class PalindromeExample {

	static void palindrome(int num){
		int temp,rem,sum=0;
		temp=num;
		while(num>0){
			rem=num%10;
			sum=(sum*10) + rem;
			num=num/10;
		}
		if(sum==temp){
			System.out.println("Number is palindrome");
		}else
			System.out.println("Number is not palindrome");
	}
	
	public static void main(String[] args) {
		int num = 152;
		palindrome(num);
		
	}

}
