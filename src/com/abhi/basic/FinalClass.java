package com.abhi.basic;

public final class FinalClass {
	final int data;
	
	public FinalClass(int data) {
		this.data=data;
	}

	public int getData() {
		return data;
	}
	
	public void display(){
		System.out.println("DATA IS -> "+this.data);
	}
	
	public static void main(String[] args) {
		FinalClass f=new FinalClass(11);
		System.out.println(f.getData());
		f.display();
	}
}
