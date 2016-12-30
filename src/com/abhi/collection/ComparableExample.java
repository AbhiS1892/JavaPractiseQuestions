package com.abhi.collection;

public class ComparableExample implements Comparable<ComparableExample>{
	
	int rollno;
	String name;
	int age;
	
	public ComparableExample(int rollno, String name, int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(ComparableExample o) {
		if(this.age==o.age && this.name==o.name){
			return 0;
		}else if (this.age>o.age) {
			return 1;
		}else
			return -1;
//		return this.age-o.age;
	}

}
