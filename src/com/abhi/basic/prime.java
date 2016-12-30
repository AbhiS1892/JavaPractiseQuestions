package com.abhi.basic;

public class prime {
	
	static void primenumber(int num){
		int limit, flag=0;
		
		limit=(int) Math.sqrt(num);
		
		for(int i=2;i<=limit;i++){
			if(num%i == 0){
				System.out.println("Numer is not prime");
				flag=1;
				break;
			}			
		}
		
		if(flag==0){
			System.out.println("Number is prime");
		}
	}

	public static void main(String[] args) {
		int num=50;
		primenumber(num);

	}

}
