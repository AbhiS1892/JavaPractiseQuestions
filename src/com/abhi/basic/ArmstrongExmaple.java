package com.abhi.basic;

public class ArmstrongExmaple {
	
	static void armstrong(int num){
		int temp=num, sum=0, rem;
		
		while(num>0){
			rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==temp){
			System.out.println("Number is armstrong");
		}else
			System.out.println("Number is not armstrong");
	}

	public static void main(String[] args) {
		int num=152;
		armstrong(num);

	}

}
