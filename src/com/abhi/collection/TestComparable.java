package com.abhi.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		ArrayList<ComparableExample> a1=new ArrayList<ComparableExample>();
		a1.add(new ComparableExample(103, "AB", 12));
		a1.add(new ComparableExample(100, "DF", 10));
		a1.add(new ComparableExample(101, "AR", 11));
		a1.add(new ComparableExample(102, "AT", 13));
		
		Collections.sort(a1);
		
		for(ComparableExample o:a1){
			System.out.println(o.rollno+" "+o.name+" "+o.age);
		}

	}

}
