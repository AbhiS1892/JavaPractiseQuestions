package com.abhi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator {

	public static void main(String[] args) {
		ArrayList<ComparatorExample> a1=new ArrayList<ComparatorExample>();
		a1.add(new ComparatorExample(102, "ABHI", 12));
		a1.add(new ComparatorExample(100, "VIJAY", 10));
		a1.add(new ComparatorExample(101, "ABC", 11));
		
		System.out.println("Sorting by name:");
		Collections.sort(a1, new NameComparator());
		
		Iterator<ComparatorExample> itr=a1.iterator();
		while(itr.hasNext()){
			ComparatorExample c1=(ComparatorExample)itr.next();
			System.out.println(c1.rollno+" "+c1.name+" "+c1.age);
		}
		
		System.out.println();
		System.out.println("Sorting by age:");
		Collections.sort(a1, new AgeComparator());
		
		Iterator<ComparatorExample> itr2=a1.iterator();
		while(itr2.hasNext()){
			ComparatorExample c2=(ComparatorExample)itr2.next();
			System.out.println(c2.rollno+" "+c2.name+" "+c2.age);
		}
		
		
		
	}

}
