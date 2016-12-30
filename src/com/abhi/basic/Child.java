package com.abhi.basic;

public class Child extends Parent{

	public Child(int data) {
		super(data);
		this.data=data;
	}
	
	public void printData(){
		System.out.println("Print child data "+this.data);
	}
	

}
