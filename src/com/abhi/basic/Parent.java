package com.abhi.basic;

public class Parent {
	
	int data;
	
	public Parent(int data) {
		this.data=data;
	}
	
	public void printData(){
		System.out.println(this.data);
	}
	
	public void printString(){
		System.out.println("PARENT");
	}
}
