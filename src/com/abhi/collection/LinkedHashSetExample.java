package com.abhi.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> l1=new LinkedHashSet<String>();
		l1.add("AB");
		l1.add("ABC");
		l1.add("AB");
		l1.add("ABCD");
		
		Iterator<String> i = l1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
