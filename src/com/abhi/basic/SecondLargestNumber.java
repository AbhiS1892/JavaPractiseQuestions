package com.abhi.basic;

public class SecondLargestNumber{

	public static void main(String args[]){ 

		int numbers[] = {7,5,4,3,2,1,19};
		int highest = numbers[0];
		int second_highest = numbers[1];

		for(int n:numbers){

			if(highest < n){

				second_highest = highest;
				highest = n;

			} else if(second_highest < n && n < highest){

				second_highest = n;

			}

		}
		System.out.println("First Max Number: "+highest);
		System.out.println("Second Max Number: "+second_highest);


	}

}