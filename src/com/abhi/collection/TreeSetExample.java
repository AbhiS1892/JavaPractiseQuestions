package com.abhi.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("ACB");
		t1.add("ABC");
		t1.add("DAB");
		t1.add("ABD");
		t1.add("ABD");
		
		
		Iterator<String> i = t1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
